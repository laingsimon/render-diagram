package com.simonlaing.drawiorenderer.controllers;

import com.simonlaing.drawiorenderer.models.DiagramDecoder;
import com.simonlaing.drawiorenderer.models.DiagramRenderer;
import com.simonlaing.drawiorenderer.models.DiagramRepository;
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

    public RenderController(DiagramDecoder decoder, DiagramRenderer renderer, DiagramRepository repository) {
        this.decoder = decoder;
        this.renderer = renderer;
        this.repository = repository;
    }

    @GetMapping("/")
    public ResponseEntity<String> index(@RequestParam String url){
        //See: https://github.com/jgraph/mxgraph/blob/master/java/examples/com/mxgraph/examples/Xml2Svg.java

        try {
            String xmlString = repository.fromUrl(url);
            Document inflatedXml = decoder.getDiagramData(xmlString);
            String svg = renderer.renderAsSvg(inflatedXml);

            return new ResponseEntity<>(svg, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();

            return new ResponseEntity<>("Error producing svg: " + e.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
