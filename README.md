# Diagram renderer

### Description
Render diagrams from [draw.io](https://draw.io) from a URL or embedded into a webpage, whilst maintaining interactive support in the diagram, e.g. links, layers and pages.

### Usage
Include this script anywhere:
```
<script src="https://laingsimon.github.io/render-diagram/drawio-renderer.js"></script>
```

Then include diagrams using any of the below approaches:

#### Embedded content
```
<div class="drawio-diagram" data-diagram-data="diagram-content"></div>
```

This is an analogue of `<img src="data:image/png;base64,xxxx"/>` and is equivalent to embedding the diagram based on the embed option in draw.io.

##### Working example
<div class="drawio-diagram" data-diagram-data="zVbJbtswEP0aHW1IpLcevefQoktaFO2loCRaYk2RAkXFdr6+MyJly1CXBHCK5OAMH4ccct7jjAK6LI5bw8r8nU65DEiYHgO6CgiZjUL4ReDkgNFs5IDMiNRB0QW4F4/cg35dVouUV1eOVmtpRXkNJlopntgrjBmjD9duOy2vo5Ys4z3gPmGyj34Vqc09Gk3eXCbuuMhyH3pGpm4iZsk+M7pWPl5A6K75c9MFa/fyF61ylupDB6LrgC6N1tZZxXHJJaa2TZtbt/nD7Pnchiv7lAX7j/X31ZbQH9Fprr9NZw93hA6i8Yi4jR6YrH1KVoYdhMoA/MRVyg03/gb21GbN8iMEXeS2kABEYBpeiUcWNw4hjEstlG24GS+C8QoQVltdOf5xAZMiU2BLvsOtHrixAmiZe9jqEtCqZAkc5TMOVoMRIDutrFcRwTj9NPjM4Ib82IF8WrZcF9yaE7i0s6HPgZdwNPUSPnQF4WnMO1poqWVeg9l56wsPYHgqnkcL7dHiyMBj6hr+TViBGVJxVTZpCP8/lDqhVAFZojxEUUpMK4MnARdUaOKTZIWQgpnGrHKh1SuS0wvIh4S0Jx86vo18vlTcvI9/YiEkoWQxl24pMjEUGjiSePsY9ZHZ8/2kUHvnmFuLhXWOAcjmvIw8QZGjTha8iF8FhVgRllpq0xyETtfzyfpWlWEa/ZPaGzELww65z6sV416t6L0w6D4lmqJo+mGXp9/nuUXfosg+AE0WHy5dxdpaXYBDo77FuQl2GPBtkC6aYPOqdH0bOWHtYCeOPG1dYHytyyRVZCig5e8E1rxhAhFBrcxCPdkgDiVnE7NKJINaDLjkBXBcDaIJwFE0xR20MRBpEJHZsIRe1m8cLyib9pvoL/1kPOmrpsWep5rLF0Qz1/lKo+tf">
See this working here: <a href="https://laingsimon.github.io/render-diagram/">https://laingsimon.github.io/render-diagram/</a>
</div>
<script src="https://laingsimon.github.io/render-diagram/drawio-renderer.js"></script>

#### Relative content

```
<div class="drawio-diagram" data-diagram-url="url"></div>
```

This is an analogue of `<img src="url"/>`.

##### Working example
<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-diagram/Sample file.xml">
See this working here: <a href="https://laingsimon.github.io/render-diagram/">https://laingsimon.github.io/render-diagram/</a>
</div>

#### With options

```
<div class="drawio-diagram" data-diagram-options='{options}'></div>
```

NOTE: Make sure the options use double quotes to encapsulate property names, e.g. "toolbar". One of the easiest ways to achieve this is to use single quotes to encapsulate the json blob, as shown above.

##### Options
Any option that is valid for the draw.io renderer is valid here, some notable examples are:

| option | data type | purpose | default | example |
| ---- | ---- | ---- | ---- | ---- |
| `hightlight` | colour-string | The colour to highlight links with | `none` | `blue` |
| `target` | string | The window name to open links in | - | `_blank` |
| `lightbox` | boolean | Whether to enable the lightbox view of the diagram | `false` | `true` |
| `nav` | boolean | Whether to permit navigation from links | `true` | `true` |
| `toolbar` | space-delimited-string | Which buttons to show in the toolbar, see below | - | `zoom layers` |

##### Toolbar options
Some of the known toolbar options are:
1. `zoom` - Whether to show the zoom buttons
1. `layers` - Whether to show the layers button
1. `pages` - Whether to show the pages button

If this option is missing or empty then the toolbar will be hidden.

##### Working example
<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-diagram/Sample file.xml" data-diagram-options='{"toolbar": "pages layers zoom", "highlight": "blue"}'>
See this working here: <a href="https://laingsimon.github.io/render-diagram/">https://laingsimon.github.io/render-diagram/</a>
</div>

See <a href="https://laingsimon.github.io/render-diagram/TestCases">other examples and test cases here</a>

### Other facilities
#### Relay option
Open draw.io with drawing content by providing a URL. This is possible with draw.io, but only where the URL is publicly accessible.
This facility loads the content in the browser (rather than server side) therefore can be hosted privately by the user/organisation.

Example: [https://laingsimon.github.io/render-diagram/relay?chrome=0#https://raw.githubusercontent.com/laingsimon/draw-ship/master/Sample%20file.xml](https://laingsimon.github.io/render-diagram/relay?chrome=0#https://raw.githubusercontent.com/laingsimon/draw-ship/master/Sample%20file.xml)

Security: The diagram data is accessed in the same manner as if the diagram was downloaded by the user from the given url, the diagram data is not sent/retrieved by any other service.
  

### Other tools
There are some other tools available that permit similar behaviour, namely:
- [Draw.io Embed-Diagrams](https://github.com/jgraph/drawio/wiki/Embed-Diagrams) - presents diagrams as PNG files, can click-to-open them as a SVG
   - Supports links, pages and layers but only via popup
- https://github.com/jgraph/drawio-html5
   - Requires the 'host application' to provide the data to the tool, rather than the image data coming from a URL
   
### Editing diagrams
The following link format can be used to open diagrams in draw.io for editing. The url must be accessible publicly so draw.io can access the drawing.

```
https://www.draw.io/#Uhttps://laingsimon.github.io/render-diagram/Sample%20file.xml
```

#### Example
[Edit sample file](https://www.draw.io/#Uhttps://laingsimon.github.io/render-diagram/Sample%20file.xml)

### How it works
The above script will perform the following steps:
1. Include a link to the stylesheet for this tools: https://laingsimon.github.io/render-diagram/drawio-renderer.css
1. Include a link to the draw.io render script: https://www.draw.io/js/viewer.min.js   
   Once the page has finished loading
1. Look for elements with the `drawio-diagram` css-class
1. For each element, render the diagram based on whether it has a `data-diagram-data` or `data-diagram-url` attribute
   1. Pass any settings in `drawio-diagram-options` (json blob) to draw.io

Diagrams can only be embedded in one of the following element types:
1. `div`
2. `span`
3. `section`
4. `body`
   
### Supported environments
- [x] - Html
- [x] - GitHub pages
- [ ] - [GitHub flavoured markdown](https://github.github.com/gfm/#disallowed-raw-html-extension-); script tags are modified in the content
- [x] - Regular markdown

### Motivation
Diagrams can be easily embedded within a page by using tooling within Draw.io. This works without any issue, however requires the data about the diagram to be embedded in other content.
Diagrams drawn from a file (as produced by saving the diagram to a file) isn't natively supported.

This means that you should save the diagram as a PNG with the data embedded. Once again this works fine, and achieves the expected behaviour as part of this tool - but with the following drawbacks
1. It is less clear (although would become common practice) that the PNG contains diagram data
   1. An XML - or other identified file - would convey this meaning more effectively
1. PNGs are non-interactive therefore the following functionality from draw.io isn't supported
   1. Links
   1. Pages
   1. Layers
   
It was desired that a tool should be able to:
1. Render a diagram from a hosted file (so that becomes the only file requiring an edit if the diagram needs to be changed)
1. Render a diagram in a familiar fashion - as similar to `img` tags as possible
1. Render a diagram in SVG format to preserve Link, Page and Layer support
1. Render a diagram from any webpage and (github) markdown content

All but the last point has been covered, due to enforced limitations over the `<script>` tag within markdown content.

### Known limitations
1. \[All\]: [GitHub flavoured markdown](https://github.github.com/gfm/#disallowed-raw-html-extension-); script tags are modified in the content
1. \[Relative content\]: Diagram content must be present on the same origin/host/address, or CORS must be enabled on the source of the content
