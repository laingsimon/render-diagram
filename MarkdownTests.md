# GitHub flavoured markdown
### Attempts to produce desisired functionality

#### 1: Use `drawing-renderer` utility

```
<script src="https://laingsimon.github.io/render-diagram/drawio-renderer.js"></script>
<div class="drawio-diagram" data-diagram-data="zVbJbtswEP0aHW1IpLcevefQoktaFO2loCRaYk2RAkXFdr6+MyJly1CXBHCK5OAMH4ccct7jjAK6LI5bw8r8nU65DEiYHgO6CgiZjUL4ReDkgNFs5IDMiNRB0QW4F4/cg35dVouUV1eOVmtpRXkNJlopntgrjBmjD9duOy2vo5Ys4z3gPmGyj34Vqc09Gk3eXCbuuMhyH3pGpm4iZsk+M7pWPl5A6K75c9MFa/fyF61ylupDB6LrgC6N1tZZxXHJJaa2TZtbt/nD7Pnchiv7lAX7j/X31ZbQH9Fprr9NZw93hA6i8Yi4jR6YrH1KVoYdhMoA/MRVyg03/gb21GbN8iMEXeS2kABEYBpeiUcWNw4hjEstlG24GS+C8QoQVltdOf5xAZMiU2BLvsOtHrixAmiZe9jqEtCqZAkc5TMOVoMRIDutrFcRwTj9NPjM4Ib82IF8WrZcF9yaE7i0s6HPgZdwNPUSPnQF4WnMO1poqWVeg9l56wsPYHgqnkcL7dHiyMBj6hr+TViBGVJxVTZpCP8/lDqhVAFZojxEUUpMK4MnARdUaOKTZIWQgpnGrHKh1SuS0wvIh4S0Jx86vo18vlTcvI9/YiEkoWQxl24pMjEUGjiSePsY9ZHZ8/2kUHvnmFuLhXWOAcjmvIw8QZGjTha8iF8FhVgRllpq0xyETtfzyfpWlWEa/ZPaGzELww65z6sV416t6L0w6D4lmqJo+mGXp9/nuUXfosg+AE0WHy5dxdpaXYBDo77FuQl2GPBtkC6aYPOqdH0bOWHtYCeOPG1dYHytyyRVZCig5e8E1rxhAhFBrcxCPdkgDiVnE7NKJINaDLjkBXBcDaIJwFE0xR20MRBpEJHZsIRe1m8cLyib9pvoL/1kPOmrpsWep5rLF0Qz1/lKo+tf">
See this working here: <a href="https://laingsimon.github.io/render-diagram/">https://laingsimon.github.io/render-diagram/</a>
</div>
```

<script src="https://laingsimon.github.io/render-diagram/drawio-renderer.js"></script>
<div class="drawio-diagram" data-diagram-data="zVbJbtswEP0aHW1IpLcevefQoktaFO2loCRaYk2RAkXFdr6+MyJly1CXBHCK5OAMH4ccct7jjAK6LI5bw8r8nU65DEiYHgO6CgiZjUL4ReDkgNFs5IDMiNRB0QW4F4/cg35dVouUV1eOVmtpRXkNJlopntgrjBmjD9duOy2vo5Ys4z3gPmGyj34Vqc09Gk3eXCbuuMhyH3pGpm4iZsk+M7pWPl5A6K75c9MFa/fyF61ylupDB6LrgC6N1tZZxXHJJaa2TZtbt/nD7Pnchiv7lAX7j/X31ZbQH9Fprr9NZw93hA6i8Yi4jR6YrH1KVoYdhMoA/MRVyg03/gb21GbN8iMEXeS2kABEYBpeiUcWNw4hjEstlG24GS+C8QoQVltdOf5xAZMiU2BLvsOtHrixAmiZe9jqEtCqZAkc5TMOVoMRIDutrFcRwTj9NPjM4Ib82IF8WrZcF9yaE7i0s6HPgZdwNPUSPnQF4WnMO1poqWVeg9l56wsPYHgqnkcL7dHiyMBj6hr+TViBGVJxVTZpCP8/lDqhVAFZojxEUUpMK4MnARdUaOKTZIWQgpnGrHKh1SuS0wvIh4S0Jx86vo18vlTcvI9/YiEkoWQxl24pMjEUGjiSePsY9ZHZ8/2kUHvnmFuLhXWOAcjmvIw8QZGjTha8iF8FhVgRllpq0xyETtfzyfpWlWEa/ZPaGzELww65z6sV416t6L0w6D4lmqJo+mGXp9/nuUXfosg+AE0WHy5dxdpaXYBDo77FuQl2GPBtkC6aYPOqdH0bOWHtYCeOPG1dYHytyyRVZCig5e8E1rxhAhFBrcxCPdkgDiVnE7NKJINaDLjkBXBcDaIJwFE0xR20MRBpEJHZsIRe1m8cLyib9pvoL/1kPOmrpsWep5rLF0Qz1/lKo+tf">
See this working here: <a href="https://laingsimon.github.io/render-diagram/">https://laingsimon.github.io/render-diagram/</a>
</div>

##### Outcome: Unsuccessful - GitHub flavoured markdown doesn't support `<script>` tags

#### 2: Use `iframe` with draw.io (embedded diagram) link
```
<iframe src="https://www.draw.io/?chrome=0&lightbox=1&layers=1&title=Untitled%20Diagram#R%3Cmxfile%20userAgent%3D%22Mozilla%2F5.0%20(Macintosh%3B%20Intel%20Mac%20OS%20X%2010_12_3)%20AppleWebKit%2F602.4.8%20(KHTML%2C%20like%20Gecko)%20Version%2F10.0.3%20Safari%2F602.4.8%22%20version%3D%226.0.3.0%22%20editor%3D%22www.draw.io%22%20type%3D%22device%22%3E%3Cdiagram%20name%3D%22Page-1%22%3E7VnJcuM2EP0aHcXCxu1oa6SZy5RT40lyhkhQREwSCghZdr4%2BDRLcJNllpRR5XGUfJPAB7G687odFntFF%2BfRV823%2BXaWimBGUPs3olxkhESXwaYHnFvAj2gIbLdMWQgNwL%2F8RLYg7dCdTUTushYxShZHbKZioqhKJmWBca7WfDstUkU6ALd%2BII%2BA%2B4cUx%2BqdMTe6m5aMB%2FybkJu88Y%2BR61jx52Gi1q5y%2FGaFZ89d2l7yz5cbXOU%2FVfgTR5YwutFKmbZVPC1FYaqe0rV7o7ePWojInXvi9Fvpu%2FZeljKCCryFrLky%2F4qWArxkJCnjzdq2htbGtDpE2XPPsKAr%2B3tkYbxNVKD2jN00q%2BfPQMbzub1UtjVTVyDxEJA8dHLvkYDXXIpt4LLksjGpc%2BsI%2BtGYP3C7bnt4bH2xbhprZNlNfPnIIDH2XRSG0o6%2BLtxmwWN21cKESPsB3WSYTYAw5zttQmi4wzZB44uW2EF6iSme14InIoRKFnlZnIauHFsiNsQV%2BY%2FNFVvv93ks133tStQO7LJO%2BUPoCGBJDXFpvZdkW%2BdRoklbUk6CbTFYQSRveKuWG25QAXsP3Dspkzh8B1PUcolz5mDi4nsdzMsck8rbVBrzsc2nE%2FRamBq72sBgAlpvSMoGh2UhBpO4pA5IXbcFApDTlIsoSwGuj1YMY9QRJJNZZn61HoY14erHE8YiPr0KVwmgoROReYJ1q3VrUa28%2FKBszh%2BUjVQcO4y5dm970IChouBx0jyOJfUruBcmle65TKzqltaxtlMeyu9W8asbwCupYvypBcnUJ0neVIEZzeikN%2BiJK2SkNRmRNg%2BAyGuw15zQYnpBg%2BCnB60nwh40LfVGVara%2FY%2FndP9dGQF2im7SU1avqo1dXH3tX9V1s%2B7uO9NBUehSf0F7wqb3rae%2BnqGvr5w%2B4bphT2vv2w2pTaiBNvb7xsatLz39X6X2sXY%2FGU%2Bn1J9Gx9Pz%2FTXpHt8PAzYkXO5evsjlc1S0%2BymOy0489d6JKb%2BydGh7XUIcPP3PYEBp4JYuO7kxVxt3jsX2u1DKFK7UziXtCRXpw867VTididLGBqz7XG2FGB62zSGfRhHRMzyfziLnwAzLHzmYuOLgoRa8w11iBydkFuB%2BwVbIy9cjJbxYYC8L3MI5jFPg%2Bjmg8zRQl2AuiOPRZEEd%2BGFP%2FIEWtuyFh%2FRTelMPoA%2BbQPzeHLCQeDmkMVc8oC6POwltS%2BlYxxEdEJlpwY4lEPElg3bUpz7qt6yViL8IZO%2BaMnF33lHmU0TgM4yhEwbQoSRB6JKABi3wa4Dig7NKaiJAXRQjFlLEIDmLkIGEQG0awdVCEGQHhXFQT3VnwV83l2as%2FiaiHD4r%2BIjsAxr82U2evFBTHXsAILLS4%2FZyuxeF%2FOoIMP1y3xTj8c4Au%2FwU%3D%3C%2Fdiagram%3E%3C%2Fmxfile%3E">
</iframe>
```

<iframe src="https://www.draw.io/?chrome=0&lightbox=1&layers=1&title=Untitled%20Diagram#R%3Cmxfile%20userAgent%3D%22Mozilla%2F5.0%20(Macintosh%3B%20Intel%20Mac%20OS%20X%2010_12_3)%20AppleWebKit%2F602.4.8%20(KHTML%2C%20like%20Gecko)%20Version%2F10.0.3%20Safari%2F602.4.8%22%20version%3D%226.0.3.0%22%20editor%3D%22www.draw.io%22%20type%3D%22device%22%3E%3Cdiagram%20name%3D%22Page-1%22%3E7VnJcuM2EP0aHcXCxu1oa6SZy5RT40lyhkhQREwSCghZdr4%2BDRLcJNllpRR5XGUfJPAB7G687odFntFF%2BfRV823%2BXaWimBGUPs3olxkhESXwaYHnFvAj2gIbLdMWQgNwL%2F8RLYg7dCdTUTushYxShZHbKZioqhKJmWBca7WfDstUkU6ALd%2BII%2BA%2B4cUx%2BqdMTe6m5aMB%2FybkJu88Y%2BR61jx52Gi1q5y%2FGaFZ89d2l7yz5cbXOU%2FVfgTR5YwutFKmbZVPC1FYaqe0rV7o7ePWojInXvi9Fvpu%2FZeljKCCryFrLky%2F4qWArxkJCnjzdq2htbGtDpE2XPPsKAr%2B3tkYbxNVKD2jN00q%2BfPQMbzub1UtjVTVyDxEJA8dHLvkYDXXIpt4LLksjGpc%2BsI%2BtGYP3C7bnt4bH2xbhprZNlNfPnIIDH2XRSG0o6%2BLtxmwWN21cKESPsB3WSYTYAw5zttQmi4wzZB44uW2EF6iSme14InIoRKFnlZnIauHFsiNsQV%2BY%2FNFVvv93ks133tStQO7LJO%2BUPoCGBJDXFpvZdkW%2BdRoklbUk6CbTFYQSRveKuWG25QAXsP3Dspkzh8B1PUcolz5mDi4nsdzMsck8rbVBrzsc2nE%2FRamBq72sBgAlpvSMoGh2UhBpO4pA5IXbcFApDTlIsoSwGuj1YMY9QRJJNZZn61HoY14erHE8YiPr0KVwmgoROReYJ1q3VrUa28%2FKBszh%2BUjVQcO4y5dm970IChouBx0jyOJfUruBcmle65TKzqltaxtlMeyu9W8asbwCupYvypBcnUJ0neVIEZzeikN%2BiJK2SkNRmRNg%2BAyGuw15zQYnpBg%2BCnB60nwh40LfVGVara%2FY%2FndP9dGQF2im7SU1avqo1dXH3tX9V1s%2B7uO9NBUehSf0F7wqb3rae%2BnqGvr5w%2B4bphT2vv2w2pTaiBNvb7xsatLz39X6X2sXY%2FGU%2Bn1J9Gx9Pz%2FTXpHt8PAzYkXO5evsjlc1S0%2BymOy0489d6JKb%2BydGh7XUIcPP3PYEBp4JYuO7kxVxt3jsX2u1DKFK7UziXtCRXpw867VTididLGBqz7XG2FGB62zSGfRhHRMzyfziLnwAzLHzmYuOLgoRa8w11iBydkFuB%2BwVbIy9cjJbxYYC8L3MI5jFPg%2Bjmg8zRQl2AuiOPRZEEd%2BGFP%2FIEWtuyFh%2FRTelMPoA%2BbQPzeHLCQeDmkMVc8oC6POwltS%2BlYxxEdEJlpwY4lEPElg3bUpz7qt6yViL8IZO%2BaMnF33lHmU0TgM4yhEwbQoSRB6JKABi3wa4Dig7NKaiJAXRQjFlLEIDmLkIGEQG0awdVCEGQHhXFQT3VnwV83l2as%2FiaiHD4r%2BIjsAxr82U2evFBTHXsAILLS4%2FZyuxeF%2FOoIMP1y3xTj8c4Au%2FwU%3D%3C%2Fdiagram%3E%3C%2Fmxfile%3E">
</iframe>

##### Outcome: Unsuccessful - GitHub flavoured markdown doesn't support `<iframe>` tags

#### 3: Use `img` with draw.io image rendering link
Note: Would have degraded functionality as only the static content would be visible (no access to layers, pages, links or zoom).
See [https://desk.draw.io/support/solutions/articles/16000042546-what-url-parameters-are-supported-](https://desk.draw.io/support/solutions/articles/16000042546-what-url-parameters-are-supported-)

```
<img src="https://www.draw.io/?chrome=0&splash=0&target=blank&highlight=ff00ff&lightbox=0&embed=0&toolbar=0#Uhttps%3A%2F%2Flaingsimon.github.io%2Frender-diagram%2FSample%20file.xml" />
```

<img src="https://www.draw.io/?chrome=0&splash=0&target=blank&highlight=ff00ff&lightbox=0&embed=0&toolbar=0#Uhttps%3A%2F%2Flaingsimon.github.io%2Frender-diagram%2FSample%20file.xml" />

##### Outcome: Unsuccessful - Draw.io returns HTML for the given link, which then cannot be rendered

#### 4: Draw.io recommendation
See [https://github.com/jgraph/drawio-github](https://github.com/jgraph/drawio-github)

##### Outcome: Unsuccessful - Requires the image representation of the diagram to be hosted somewhere