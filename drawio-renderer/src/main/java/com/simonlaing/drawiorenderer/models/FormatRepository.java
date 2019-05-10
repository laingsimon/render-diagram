package com.simonlaing.drawiorenderer.models;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FormatRepository {
    private static final HashMap<String, RenderFormat> formats = new HashMap<>();

    static {
        formats.put("svg", new RenderFormat(MediaType.valueOf("image/svg+xml"), DiagramRenderer::renderAsSvg));
        formats.put("png", new RenderFormat(MediaType.IMAGE_PNG, DiagramRenderer::renderAsPng));
    }

    public RenderFormat getFormat(String formatKey){
        return formats.get(formatKey);
    }
}
