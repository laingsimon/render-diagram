package com.simonlaing.drawiorenderer.models;

import com.mxgraph.io.mxCodec;
import com.mxgraph.view.mxGraph;
import org.w3c.dom.Document;

import java.io.IOException;
import java.util.zip.DataFormatException;

public abstract class BaseGraphRenderer implements Renderer {
    private final DiagramDecoder decoder;

    public BaseGraphRenderer(DiagramDecoder decoder) {
        this.decoder = decoder;
    }

    public Object render(String xmlString) {
        try {
            Document xml = decoder.getDiagramData(xmlString);

            mxCodec codec = new mxCodec(xml);
            mxGraph graph = new mxGraph();

            codec.decode(xml.getDocumentElement(), graph.getModel());

            return render(graph);
        }
        catch (IOException | DataFormatException exc){
            throw new RuntimeException(exc);
        }
    }

    protected abstract Object render(mxGraph graph);
}
