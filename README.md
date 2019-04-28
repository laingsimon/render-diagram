# Drawing renderer

### Description
Render drawings from [draw.io](https://draw.io) from a URL or embedded into a webpage.
Maintain interactive support in the drawing in the rendered output, e.g. links, layers and pages.

### Usage
Include this script anywhere:
```
<script src="https://laingsimon.github.io/render-drawing/drawio-renderer.js"></script>
```

Then include drawings using any of the below approaches:

#### Embedded content
```
<div class="drawio-diagram" data-drawing-data="drawing-content"></div>
```

This is an analogue of `<img src="data:image/png;base64,xxxx"/>` and is equivalent to embedding the drawing based on the embed option in draw.io.

##### Working example
<div class="drawio-diagram" data-diagram-data="zVbJbtswEP0aHW1IpLcevefQoktaFO2loCRaYk2RAkXFdr6+MyJly1CXBHCK5OAMH4ccct7jjAK6LI5bw8r8nU65DEiYHgO6CgiZjUL4ReDkgNFs5IDMiNRB0QW4F4/cg35dVouUV1eOVmtpRXkNJlopntgrjBmjD9duOy2vo5Ys4z3gPmGyj34Vqc09Gk3eXCbuuMhyH3pGpm4iZsk+M7pWPl5A6K75c9MFa/fyF61ylupDB6LrgC6N1tZZxXHJJaa2TZtbt/nD7Pnchiv7lAX7j/X31ZbQH9Fprr9NZw93hA6i8Yi4jR6YrH1KVoYdhMoA/MRVyg03/gb21GbN8iMEXeS2kABEYBpeiUcWNw4hjEstlG24GS+C8QoQVltdOf5xAZMiU2BLvsOtHrixAmiZe9jqEtCqZAkc5TMOVoMRIDutrFcRwTj9NPjM4Ib82IF8WrZcF9yaE7i0s6HPgZdwNPUSPnQF4WnMO1poqWVeg9l56wsPYHgqnkcL7dHiyMBj6hr+TViBGVJxVTZpCP8/lDqhVAFZojxEUUpMK4MnARdUaOKTZIWQgpnGrHKh1SuS0wvIh4S0Jx86vo18vlTcvI9/YiEkoWQxl24pMjEUGjiSePsY9ZHZ8/2kUHvnmFuLhXWOAcjmvIw8QZGjTha8iF8FhVgRllpq0xyETtfzyfpWlWEa/ZPaGzELww65z6sV416t6L0w6D4lmqJo+mGXp9/nuUXfosg+AE0WHy5dxdpaXYBDo77FuQl2GPBtkC6aYPOqdH0bOWHtYCeOPG1dYHytyyRVZCig5e8E1rxhAhFBrcxCPdkgDiVnE7NKJINaDLjkBXBcDaIJwFE0xR20MRBpEJHZsIRe1m8cLyib9pvoL/1kPOmrpsWep5rLF0Qz1/lKo+tf">
See this working here: <a href="https://laingsimon.github.io/render-drawing/">https://laingsimon.github.io/render-drawing/</a>
</div>
<script src="https://laingsimon.github.io/render-drawing/drawio-renderer.js"></script>

#### Relative content

```
<div class="drawio-diagram" data-drawing-url="url"></div>
```

This is an analogue of `<img src="url"/>`.

##### Working example
<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-drawing/Sample file.xml">
See this working here: <a href="https://laingsimon.github.io/render-drawing/">https://laingsimon.github.io/render-drawing/</a>
</div>

See <a href="https://laingsimon.github.io/render-drawing/TestCases">other examples and test cases here</a>

### Other tools
There are some other tools available that permit similar behaviour, namely:
- [Draw.io Embed-Diagrams](https://github.com/jgraph/drawio/wiki/Embed-Diagrams) - presents drawings as PNG files, can click-to-open them as a SVG
   - Supports links, pages and layers but only via popup
- https://github.com/jgraph/drawio-html5
   - Requires the 'host application' to provide the data to the tool, rather than the image data coming from a URL

### How it works
The above script will perform the following steps:
1. Include a link to the stylesheet for this tools: https://laingsimon.github.io/render-drawing/drawio-renderer.css
1. Include a link to the draw.io render script: https://www.draw.io/js/viewer.min.js   
   Once the page has finished loading
1. Look for elements with the `drawio-drawing` css-class
1. For each element, render the drawing based on whether it has a `data-drawing-data` or `data-diagram-url` attribute

### Supported environments
- [x] - Html
- [x] - GitHub pages
- [ ] - [GitHub flavoured markdown](https://github.github.com/gfm/#disallowed-raw-html-extension-); script tags are modified in the content
- [x] - Regular markdown

### Motivation
This solution supports URL based rendering of the image as if it was an image, as an analogue to [gravizo](https://github.com/TLmaK0/gravizo) for DOT drawings.

Drawings can be easily embedded within a page by using tooling within Draw.io. This works without any issue, however requires the data about the drawing to be embedded in other content.
Drawings drawn from a file (as produced by saving the drawing to a file) isn't natively supported.

This means that you should save the drawing as a PNG with the data embedded. Once again this works fine, and achieves the expected behaviour as part of this tool - but with the following drawbacks
1. It is less clear (although would become common practice) that the PNG contains drawing data
   1. An XML - or other identified file - would convey this meaning more effectively
1. PNGs are non-interactive therefore the following functionality from draw.io isn't supported
   1. Links
   1. Pages
   1. Layers
   
It was desired that a tool should be able to:
1. Render a drawing from a hosted file (so that becomes the only file requiring an edit if the drawing needs to be changed)
1. Render a drawing in a familiar fashion - as similar to `img` tags as possible
1. Render a drawing in SVG format to preserve Link, Page and Layer support
1. Render a drawing from any webpage and (github) markdown content

All but the last point has been covered, due to enforced limitations over the `<script>` tag within markdown content.

### Known limitations
1. \[All\]: [GitHub flavoured markdown](https://github.github.com/gfm/#disallowed-raw-html-extension-); script tags are modified in the content
1. \[Relative content\]: Drawing content must be present on the same origin/host/address, or CORS must be enabled on the source of the content
