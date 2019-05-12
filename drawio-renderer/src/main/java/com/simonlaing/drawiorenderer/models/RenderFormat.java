package com.simonlaing.drawiorenderer.models;

import org.springframework.http.MediaType;

public class RenderFormat {
    private final MediaType mimeType;
    private final Renderer renderer;

    RenderFormat(MediaType mimeType, Renderer renderer) {
        this.mimeType = mimeType;
        this.renderer = renderer;
    }

    public MediaType getMediaType() {
        return mimeType;
    }

    Object render(String xmlString) {
        return renderer.render(xmlString);
    }
}
