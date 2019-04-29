window.addEventListener("load", function(){
	let permittedTagNames = [ "DIV", "SPAN", "SECTION", "BODY" ];
	
	addStyle("https://laingsimon.github.io/render-diagram/drawio-renderer.css");
	addScript("https://www.draw.io/js/viewer.min.js");
	
	waitForDrawIo(function(timeout) {
		let diagrams = document.querySelectorAll(".drawio-diagram");

		diagrams.forEach(function(diagram){
			if (permittedTagNames.indexOf(diagram.tagName) === -1) {
				return; //not included in a permitted tag
			}
			
			if (timeout) {
				showError(diagram, "Unable to load draw.io renderer");
				return;
			}

			processDiagram(diagram);
		});
	})
})

function waitForDrawIo(callback, attempt) {
	if (!attempt) {
		attempt = 0;
	}
	
	if (typeof GraphViewer === "undefined") {
		if (attempt >= 5) {
			callback(true);
			return;
		}
		
		window.setTimeout(function() {
			waitForDrawIo(callback, attempt + 1);
		}, 500);

		return;
	}
	
	callback(false);
}

function addStyle(url){
	let link = document.createElement("link");
	link.setAttribute("rel", "stylesheet");
	link.setAttribute("type", "text/css");
	link.setAttribute("href", url);
	
	document.head.appendChild(link);
}

function addScript(url){
	let script = document.createElement("script");
	script.setAttribute("src", url);
	
	document.body.appendChild(script);
}

function processDiagram(diagram){
	try {
		let url = diagram.getAttribute("data-diagram-url");
		let data = diagram.getAttribute("data-diagram-data");
		
		if (data) {
			addDiagram(data, diagram, getUserOptions(diagram));
			return;
		}
		
		if (url) {
			diagram.innerHTML = "";
			diagram.className += " drawio-diagram-loading";
		
			loadDataFromUrlThen(url, function(data, error) { 
				try {
					if (error) {
						showError(diagram, "Url: <a href=\"" + url + "\" target=\"_blank\">" + url + "</a><br />Status: " + error.status);
						return;
					}
					
					let dataMatch = data != null ? data.match(/\<diagram .+?\>(.+)\<\/diagram\>/) : null;
					if (dataMatch != null && dataMatch.length >= 2) {
						data = dataMatch[1];	
					}
				
					addDiagram(data, diagram, getUserOptions(diagram));
				} catch (e) {
					showError(diagram, e);
				}
			});
			return;
		}
		
		showError(diagram, "No means to process diagram, no drawio-diagram-data or drawio-diagram-url attribute");
	} catch (e) {
		showError(diagram, e);
	}	
}

function showError(diagram, errorHtml){
	diagram.className = diagram.className.replace(" drawio-diagram-loading", "") + " drawio-diagram-error";
	diagram.innerHTML = "Error loading diagram<br />" + errorHtml;	
}

function loadDataFromUrlThen(url, callback) {
	let xmlhttp = null;

	if (window.XMLHttpRequest)
    {// code for IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp=new XMLHttpRequest();
    }
    else
    {// code for IE6, IE5
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange=function()
    {
        if (xmlhttp.readyState==4)
        {
			if (xmlhttp.status==200) {
				callback(xmlhttp.responseText, null);
			} else {
				callback(null, { status: xmlhttp.status, text: xmlhttp.responseText });
			}
			return;
        }
    }
    xmlhttp.open("GET", url, true);
	xmlhttp.send();
}

function addDiagram(diagramData, replaceElement, userOptions){
	let div = document.createElement("div");
	div.setAttribute("class", "mxgraph");
	div.setAttribute("data-mxgraph", JSON.stringify(getMxGraphData(diagramData, userOptions)));
	replaceElement.parentElement.insertBefore(div, replaceElement);
	replaceElement.parentElement.removeChild(replaceElement);
	
	window.setTimeout(function(){
		let svgElements = div.getElementsByTagName("svg");
		if (svgElements.length === 0) {
			let errorDiv = document.createElement("div");
			div.parentElement.insertBefore(errorDiv, div);
			div.parentElement.removeChild(div);
			
			showError(errorDiv, div.innerText);
		}
	}, 500);

	GraphViewer.processElements();	
}

function getMxGraphData(diagramData, userOptions){
  let options = Object.assign({}, getDefaultOptions());
  if (userOptions) {
    options = Object.assign(options, userOptions);
  }
  return Object.assign(options, {
    xml: "<mxfile version=\"10.6.5\"><diagram>" + diagramData + "</diagram></mxfile>"
  });
}

function getUserOptions(diagram) {
  let options = diagram.getAttribute("data-diagram-options");
  if (!options) {
    return null;
  }

  return JSON.parse(options);
}

function getDefaultOptions(){
    return {
		highlight: "none",
		target: "self",
		lightbox: false,
		nav: true
	};
}
