## Test cases

This page describes some test cases and the current working behaviour of the tool.
This page is only expected to work via <a href="//laingsimon.github.io/render-diagram/TestCases">https://laingsimon.github.io/render-diagram/TestCases</a>

<script src="https://laingsimon.github.io/render-diagram/drawio-renderer.js"></script>

### Positive test cases
1 - Valid url (expected to render correctly)   
```
<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-diagram/Sample file.xml">
See this working here: <a href="https://laingsimon.github.io/render-diagram/">https://laingsimon.github.io/render-diagram/</a>
</div>
```

<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-diagram/Sample file.xml">
See this working here: <a href="https://laingsimon.github.io/render-diagram/">https://laingsimon.github.io/render-diagram/</a>
</div>

2 - Valid data (expected to render correctly)   
```
<div class="drawio-diagram" data-diagram-data="zVbJbtswEP0aHW1IpLcevefQoktaFO2loCRaYk2RAkXFdr6+MyJly1CXBHCK5OAMH4ccct7jjAK6LI5bw8r8nU65DEiYHgO6CgiZjUL4ReDkgNFs5IDMiNRB0QW4F4/cg35dVouUV1eOVmtpRXkNJlopntgrjBmjD9duOy2vo5Ys4z3gPmGyj34Vqc09Gk3eXCbuuMhyH3pGpm4iZsk+M7pWPl5A6K75c9MFa/fyF61ylupDB6LrgC6N1tZZxXHJJaa2TZtbt/nD7Pnchiv7lAX7j/X31ZbQH9Fprr9NZw93hA6i8Yi4jR6YrH1KVoYdhMoA/MRVyg03/gb21GbN8iMEXeS2kABEYBpeiUcWNw4hjEstlG24GS+C8QoQVltdOf5xAZMiU2BLvsOtHrixAmiZe9jqEtCqZAkc5TMOVoMRIDutrFcRwTj9NPjM4Ib82IF8WrZcF9yaE7i0s6HPgZdwNPUSPnQF4WnMO1poqWVeg9l56wsPYHgqnkcL7dHiyMBj6hr+TViBGVJxVTZpCP8/lDqhVAFZojxEUUpMK4MnARdUaOKTZIWQgpnGrHKh1SuS0wvIh4S0Jx86vo18vlTcvI9/YiEkoWQxl24pMjEUGjiSePsY9ZHZ8/2kUHvnmFuLhXWOAcjmvIw8QZGjTha8iF8FhVgRllpq0xyETtfzyfpWlWEa/ZPaGzELww65z6sV416t6L0w6D4lmqJo+mGXp9/nuUXfosg+AE0WHy5dxdpaXYBDo77FuQl2GPBtkC6aYPOqdH0bOWHtYCeOPG1dYHytyyRVZCig5e8E1rxhAhFBrcxCPdkgDiVnE7NKJINaDLjkBXBcDaIJwFE0xR20MRBpEJHZsIRe1m8cLyib9pvoL/1kPOmrpsWep5rLF0Qz1/lKo+tf">
See this working here: <a href="https://laingsimon.github.io/render-diagram/">https://laingsimon.github.io/render-diagram/</a>
</div>
```

<div class="drawio-diagram" data-diagram-data="zVbJbtswEP0aHW1IpLcevefQoktaFO2loCRaYk2RAkXFdr6+MyJly1CXBHCK5OAMH4ccct7jjAK6LI5bw8r8nU65DEiYHgO6CgiZjUL4ReDkgNFs5IDMiNRB0QW4F4/cg35dVouUV1eOVmtpRXkNJlopntgrjBmjD9duOy2vo5Ys4z3gPmGyj34Vqc09Gk3eXCbuuMhyH3pGpm4iZsk+M7pWPl5A6K75c9MFa/fyF61ylupDB6LrgC6N1tZZxXHJJaa2TZtbt/nD7Pnchiv7lAX7j/X31ZbQH9Fprr9NZw93hA6i8Yi4jR6YrH1KVoYdhMoA/MRVyg03/gb21GbN8iMEXeS2kABEYBpeiUcWNw4hjEstlG24GS+C8QoQVltdOf5xAZMiU2BLvsOtHrixAmiZe9jqEtCqZAkc5TMOVoMRIDutrFcRwTj9NPjM4Ib82IF8WrZcF9yaE7i0s6HPgZdwNPUSPnQF4WnMO1poqWVeg9l56wsPYHgqnkcL7dHiyMBj6hr+TViBGVJxVTZpCP8/lDqhVAFZojxEUUpMK4MnARdUaOKTZIWQgpnGrHKh1SuS0wvIh4S0Jx86vo18vlTcvI9/YiEkoWQxl24pMjEUGjiSePsY9ZHZ8/2kUHvnmFuLhXWOAcjmvIw8QZGjTha8iF8FhVgRllpq0xyETtfzyfpWlWEa/ZPaGzELww65z6sV416t6L0w6D4lmqJo+mGXp9/nuUXfosg+AE0WHy5dxdpaXYBDo77FuQl2GPBtkC6aYPOqdH0bOWHtYCeOPG1dYHytyyRVZCig5e8E1rxhAhFBrcxCPdkgDiVnE7NKJINaDLjkBXBcDaIJwFE0xR20MRBpEJHZsIRe1m8cLyib9pvoL/1kPOmrpsWep5rLF0Qz1/lKo+tf">
See this working here: <a href="https://laingsimon.github.io/render-diagram/">https://laingsimon.github.io/render-diagram/</a>
</div>

13 - Applied with options (expected toolbar to be visible and links to highlight in blue)
```
<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-diagram/Sample file.xml" data-diagram-options='{"toolbar": "pages layers zoom", "highlight": "blue"}'>
See this working here: <a href="https://laingsimon.github.io/render-diagram/">https://laingsimon.github.io/render-diagram/</a>
</div>
```

<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-diagram/Sample file.xml" data-diagram-options='{"toolbar": "pages layers zoom", "highlight": "blue"}'>
See this working here: <a href="https://laingsimon.github.io/render-diagram/">https://laingsimon.github.io/render-diagram/</a>
</div>

### Negative test cases
4 - Invalid URL (expected to render error message)   
```
<div class="drawio-diagram" data-diagram-url="non-url"></div>
```

<div class="drawio-diagram" data-diagram-url="non-url"></div>

5 - Missing content - 404 (expected to render error message)   
```
<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-diagram/404"></div>
```

<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-diagram/404"></div>

6 - Invalid host name (expected to render error message)   
```
<div class="drawio-diagram" data-diagram-url="https://missing-host-name"></div>
```

<div class="drawio-diagram" data-diagram-url="https://missing-host-name"></div>

7 - Invalid content from URL (expected to render error message, if content cannot be processed)    
```
<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-diagram/README.md"></div>
```

<div class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-diagram/README.md"></div>

8 - Empty URL (expected to render usage message)    
```
<div class="drawio-diagram" data-diagram-url=""></div>
```

<div class="drawio-diagram" data-diagram-url=""></div>

9 - Invalid embedded data (expected to render error message, if content cannot be processed)    
```
<div class="drawio-diagram" data-diagram-data="invalid-diagram-data"></div>
```

<div class="drawio-diagram" data-diagram-data="invalid-diagram-data"></div>

10 - Empty data (expected to render usage message)   
```
<div class="drawio-diagram" data-diagram-data=""></div>
```

<div class="drawio-diagram" data-diagram-data=""></div>

11 - No data attribute (expected to render usage message)    
```
<div class="drawio-diagram"></div>
```

<div class="drawio-diagram"></div>

12 - Applied to invalid element (e.g. &lt;hr /&gt;) (expected to not modify element)   
```
<hr class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-diagram/Sample file.xml" />
```

<hr class="drawio-diagram" data-diagram-url="https://laingsimon.github.io/render-diagram/Sample file.xml" />
