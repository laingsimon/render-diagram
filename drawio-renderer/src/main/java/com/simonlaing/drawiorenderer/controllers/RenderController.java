package com.simonlaing.drawiorenderer.controllers;

import com.simonlaing.drawiorenderer.models.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.w3c.dom.Document;

@Controller
public class RenderController {
    private final DiagramDecoder decoder;
    private final DiagramRenderer renderer;
    private final DiagramRepository repository;
    private final FormatRepository formats;

    public RenderController(DiagramDecoder decoder, DiagramRenderer renderer, DiagramRepository diagrams, FormatRepository formats) {
        this.decoder = decoder;
        this.renderer = renderer;
        this.repository = diagrams;
        this.formats = formats;
    }

    @GetMapping("/")
    public ResponseEntity<Object> index(@RequestParam String url, @RequestParam(defaultValue = "svg", required = false) String format){
        //See: https://github.com/jgraph/mxgraph/blob/master/java/examples/com/mxgraph/examples/Xml2Svg.java

        try {
            String xmlString = repository.fromUrl(url);
            Document inflatedXml = decoder.getDiagramData(xmlString);
            RenderFormat renderFormat = formats.getFormat(format);

            if (renderFormat == null){
                return new ResponseEntity<>("Invalid render format", HttpStatus.BAD_REQUEST);
            }

            Object content = renderer.render(inflatedXml, renderFormat);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(renderFormat.getMediaType());
            return new ResponseEntity<>(content, headers, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();

            return new ResponseEntity<>("Error producing svg: " + e.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
