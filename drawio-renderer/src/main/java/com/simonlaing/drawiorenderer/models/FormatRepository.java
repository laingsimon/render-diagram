package com.simonlaing.drawiorenderer.models;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FormatRepository {
    private final HashMap<String, RenderFormat> formats = new HashMap<>();

    public FormatRepository() {
        formats.put("svg", new RenderFormat(MediaType.valueOf("image/svg+xml"), new JavaSvgRenderer(new DiagramDecoder())));
        formats.put("png", new RenderFormat(MediaType.IMAGE_PNG, new ExportPngRenderer()));
    }

    public RenderFormat getFormat(String formatKey){
        return formats.get(formatKey);
    }
}
