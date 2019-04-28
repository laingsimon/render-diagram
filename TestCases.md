## Test cases

This page describes some test cases and the current working behaviour of the tool.
This page is only expected to work via <a href="//laingsimon.github.io/render-drawing/TestCases">https://laingsimon.github.io/render-drawing/TestCases</a>

<script src="https://github.com/laingsimon/render-drawing/drawio-renderer.js"></script>

### Positive test cases
1 - Valid url (expected to render correctly)   
<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-drawing/Sample file.xml">
See this working here: <a href="https://laingsimon.github.io/render-drawing/">https://laingsimon.github.io/render-drawing/</a>
</div>
2 - Valid data (expected to render correctly)   
<div class="drawio-diagram" data-diagram-data="zVbbjtsgEP0aPyaywU7Sx1x3H1r1sq2q9qXCNrFpMFgY57Jf38Fgx5a77a6UlTYPyXCYYWDOgYmH18X5TpEy/yBTyj3kp2cPbzyEFqEP3wa4WCDEkQUyxVILBVfggT1SB7q4rGYprQaOWkquWTkEEykETfQAI0rJ09BtL/kwa0kyOgIeEsLH6HeW6tyhwezddeKesix3qRdobidikhwyJWvh8nkI75uPnS5Iu5Y7aJWTVJ56EN56eK2k1NYqzmvKTWnbstm43ROz3b4VFfo5AYfP9c/NHcK/gstS/pgvjvcIT4IoRHahI+G1K8lGkRMTGYBfqEiposqdQF/aqml6hqSrXBccgABMRSv2SOLGwYdxKZnQDTfRyos2gJBay8rybwIIZ5kAm9O9WepIlWZAy9LBWpaAViVJYCtfzWAzCQHZS6GdipDJ43YP0fT8ZGWCrt4gYyoLqtUFXNoA39XASTiYh3Z86gvC0Zj3tNBSS5wGs27pKw9gOCpeRgse0WLJMNuUtflJgaYpk86CKlUeWhuaWFFyczwC0oREwpjmapCCcUZUY1Y5k+IN0foKNCIfj2jE0W1o/FZR9TH+bR4k5HMSU25DO05m3Jw+hmLPMt2djzNxsI651uaBW5oEaNeFoWcoI+xVwYnpTVBobuZacqmajeD5djnb3uqGzoP/UnsjZmHYI/dldzYa3dnRDYMuUBqTFU1f6vP09zq36Hsjsk9AkzYXF29iqbUswKFR36prRj0GXDvCqybZsipt/zSckHawZ2eati4wHuoySQWaMmi9e2benmkCGUGtRMN7sjM4PDm7mFQsmdRsQjktgNBqEswADoK5WUEqBZkmAVpMS+gp4wf8FWXT/jf5x7sezcaqabGXqebayZu53r8lvP0D">
See this working here: <a href="https://laingsimon.github.io/render-drawing/">https://laingsimon.github.io/render-drawing/</a>
</div>

### Negative test cases
3 - Invalid URL (expected to render error message)   
<div class="drawio-diagram" data-diagram-url="non-url"></div>

4 - Missing content - 404 (expected to render error message)   
<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-drawing/404"></div>

5 - Invalid host name (expected to render error message)   
<div class="drawio-diagram" data-diagram-url="https://missing-host-name"></div>

6 - Invalid content from URL (expected to render error message, if content cannot be processed)    
<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-drawing/README.md"></div>

7 - Empty URL (expected to render usage message)    
<div class="drawio-diagram" data-diagram-url=""></div>

8 - Invalid embedded data (expected to render error message, if content cannot be processed)    
<div class="drawio-diagram" data-diagram-data="invalid-drawing-data"></div>

9 - Empty data (expected to render usage message)   
<div class="drawio-diagram" data-diagram-data=""></div>

10 - No data attribute (expected to render usage message)    
<div class="drawio-diagram"></div>

11 - Applied to invalid element (e.g. &lt;br /&gt;) (expected to no modify element)   
<br class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-drawing/Sample file.xml" />
