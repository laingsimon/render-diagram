window.addEventListener("load", function(){
	addStyle("https://laingsimon.github.io/render-drawing/drawio-renderer.css");
	addScript("https://www.draw.io/js/viewer.min.js");
	
	let diagrams = document.querySelectorAll(".drawio-diagram");
	
	waitForDrawIo(0, function() {
		diagrams.forEach(function(diagram){
			processDiagram(diagram);
		});
	})
})

function waitForDrawIo(attempt, callback) {
	if (typeof GraphViewer === "undefined") {
		if (attempt >= 5) {
			return;
		}
		
		window.setTimeout(function() {
			waitForDrawIo(attempt + 1, callback);
		}, 500);

		return;
	}
	
	callback();
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
			addDiagram(data, diagram);
			return;
		}
		
		if (url) {
			diagram.innerHTML = "";
			diagram.className += " drawio-diagram-loading";
		
			loadDataFromUrlThen(url, function(data, error) { 
				if (error) {
					showError(diagram, "Url: <a href=\"" + url + "\" target=\"_blank\">" + url + "</a><br />Status: " + error.status);
					return;
				}
			
				addDiagram(data, diagram);
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
    xmlhttp.open("GET", url, false );
	xmlhttp.send();
}

function addDiagram(diagramData, replaceElement){
	let div = document.createElement("div");
	div.setAttribute("class", "mxgraph");
	div.setAttribute("data-mxgraph", JSON.stringify({
		highlight: "none",
		target: "self",
		lightbox: false,
		nav: true,
		xml: "<mxfile version=\"10.6.5\"><diagram>" + diagramData + "</diagram></mxfile>"
	}));
	replaceElement.parentElement.insertBefore(div, replaceElement);
	replaceElement.parentElement.removeChild(replaceElement);
	
	GraphViewer.processElements();
}