package com.simonlaing.drawiorenderer.models;

import com.mxgraph.view.mxGraph;
import org.springframework.http.MediaType;

public class RenderFormat {
    private final MediaType mimeType;
    private final Renderer render;

    public RenderFormat(MediaType mimeType, Renderer render) {
        this.mimeType = mimeType;
        this.render = render;
    }

    public MediaType getMediaType() {
        return mimeType;
    }

    public Object render(mxGraph graph) {
        return render.render(graph);
    }
}
