package com.simonlaing.drawiorenderer.models;

import com.mxgraph.view.mxGraph;
import org.springframework.http.MediaType;

import java.util.function.Function;

public class RenderFormat {
    private final MediaType mimeType;
    private final Function<mxGraph, Object> render;

    public RenderFormat(MediaType mimeType, Function<mxGraph, Object> render) {
        this.mimeType = mimeType;
        this.render = render;
    }

    public MediaType getMediaType() {
        return mimeType;
    }

    public Object render(mxGraph graph) {
        return render.apply(graph);
    }
}
