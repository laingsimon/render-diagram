# Drawing renderer

Render drawings from [draw.io](https://draw.io) from a URL or embedded into a webpage.

There are tools available that do similar functionality to this, however they require the image to be embedded as an asset of the page. This is atypical when it comes to images, which are normally referenced by URL.
This solution supports URL based rendering of the image as if it was an image, as an analogue to [gravizo](https://github.com/TLmaK0/gravizo) for DOT drawings.

### Supported environments
- [x] - Html
- [x] - GitHub pages
- [ ] - [GitHub flavoured markdown](https://github.github.com/gfm/#disallowed-raw-html-extension-); script tags are modified in the content
- [x] - Regular markdown

## Usage
Include this script anywhere:
```
<script src="https://github.com/laingsimon/render-drawing/drawio-renderer.js"></script>
```

Embed drawings using any of the below approaches

#### Embedded content
```
<div class="drawio-diagram" data-drawing-data="drawing-content"></div>
```

This is an analogue of `<img src="data:image/png;base64,xxxx"/>` and is equivalent to embedding the drawing based on the embed option in draw.io.

#### Relative content

```
<div class="drawio-diagram" data-drawing-url="url"></div>
```

This is an analogue of `<img src="url"/>`.

### Examples
#### Embedded content
```
<div class="drawio-diagram" data-diagram-data="zVbbjtsgEP0aPyaywU7Sx1x3H1r1sq2q9qXCNrFpMFgY57Jf38Fgx5a77a6UlTYPyXCYYWDOgYmH18X5TpEy/yBTyj3kp2cPbzyEFqEP3wa4WCDEkQUyxVILBVfggT1SB7q4rGYprQaOWkquWTkEEykETfQAI0rJ09BtL/kwa0kyOgIeEsLH6HeW6tyhwezddeKesix3qRdobidikhwyJWvh8nkI75uPnS5Iu5Y7aJWTVJ56EN56eK2k1NYqzmvKTWnbstm43ROz3b4VFfo5AYfP9c/NHcK/gstS/pgvjvcIT4IoRHahI+G1K8lGkRMTGYBfqEiposqdQF/aqml6hqSrXBccgABMRSv2SOLGwYdxKZnQDTfRyos2gJBay8rybwIIZ5kAm9O9WepIlWZAy9LBWpaAViVJYCtfzWAzCQHZS6GdipDJ43YP0fT8ZGWCrt4gYyoLqtUFXNoA39XASTiYh3Z86gvC0Zj3tNBSS5wGs27pKw9gOCpeRgse0WLJMNuUtflJgaYpk86CKlUeWhuaWFFyczwC0oREwpjmapCCcUZUY1Y5k+IN0foKNCIfj2jE0W1o/FZR9TH+bR4k5HMSU25DO05m3Jw+hmLPMt2djzNxsI651uaBW5oEaNeFoWcoI+xVwYnpTVBobuZacqmajeD5djnb3uqGzoP/UnsjZmHYI/dldzYa3dnRDYMuUBqTFU1f6vP09zq36Hsjsk9AkzYXF29iqbUswKFR36prRj0GXDvCqybZsipt/zSckHawZ2eati4wHuoySQWaMmi9e2benmkCGUGtRMN7sjM4PDm7mFQsmdRsQjktgNBqEswADoK5WUEqBZkmAVpMS+gp4wf8FWXT/jf5x7sezcaqabGXqebayZu53r8lvP0D"></div>
<script src="https://github.com/laingsimon/render-drawing/drawio-renderer.js"></script>
```
<div class="drawio-diagram" data-diagram-data="zVbbjtsgEP0aPyaywU7Sx1x3H1r1sq2q9qXCNrFpMFgY57Jf38Fgx5a77a6UlTYPyXCYYWDOgYmH18X5TpEy/yBTyj3kp2cPbzyEFqEP3wa4WCDEkQUyxVILBVfggT1SB7q4rGYprQaOWkquWTkEEykETfQAI0rJ09BtL/kwa0kyOgIeEsLH6HeW6tyhwezddeKesix3qRdobidikhwyJWvh8nkI75uPnS5Iu5Y7aJWTVJ56EN56eK2k1NYqzmvKTWnbstm43ROz3b4VFfo5AYfP9c/NHcK/gstS/pgvjvcIT4IoRHahI+G1K8lGkRMTGYBfqEiposqdQF/aqml6hqSrXBccgABMRSv2SOLGwYdxKZnQDTfRyos2gJBay8rybwIIZ5kAm9O9WepIlWZAy9LBWpaAViVJYCtfzWAzCQHZS6GdipDJ43YP0fT8ZGWCrt4gYyoLqtUFXNoA39XASTiYh3Z86gvC0Zj3tNBSS5wGs27pKw9gOCpeRgse0WLJMNuUtflJgaYpk86CKlUeWhuaWFFyczwC0oREwpjmapCCcUZUY1Y5k+IN0foKNCIfj2jE0W1o/FZR9TH+bR4k5HMSU25DO05m3Jw+hmLPMt2djzNxsI651uaBW5oEaNeFoWcoI+xVwYnpTVBobuZacqmajeD5djnb3uqGzoP/UnsjZmHYI/dldzYa3dnRDYMuUBqTFU1f6vP09zq36Hsjsk9AkzYXF29iqbUswKFR36prRj0GXDvCqybZsipt/zSckHawZ2eati4wHuoySQWaMmi9e2benmkCGUGtRMN7sjM4PDm7mFQsmdRsQjktgNBqEswADoK5WUEqBZkmAVpMS+gp4wf8FWXT/jf5x7sezcaqabGXqebayZu53r8lvP0D">
Works on https://laingsimon.github.io/render-drawing/
</div>

#### Relative content
```
<div class="drawio-diagram" data-diagram-url="https://github.com/laingsimon/render-drawing/Sample file.xml"></div>
<script src="https://github.com/laingsimon/render-drawing/drawio-renderer.js"></script>
```

<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-drawing/Sample file.xml">
Works on https://laingsimon.github.io/render-drawing/
</div>

<script src="https://laingsimon.github.io/render-drawing/drawio-renderer.js"></script>


## How it works
The above script will perform the following steps:
1. Include a link to the stylesheet for this tools: https://laingsimon.github.io/render-drawing/drawio-renderer.css
1. Include a link to the draw.io render script: https://www.draw.io/js/viewer.min.js   
   Once the page has finished loading
1. Look for elements with the `drawio-drawing` css-class
1. For each element, render the drawing based on whether it has a `data-drawing-data` or `data-diagram-url` attribute

## Known limitations
1. \[All\]: [GitHub flavoured markdown](https://github.github.com/gfm/#disallowed-raw-html-extension-); script tags are modified in the content
1. \[Relative content\]: Drawing content must be present on the same origin/host/address, or CORS must be enabled on the source of the content
