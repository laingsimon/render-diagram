package com.simonlaing.drawiorenderer.models;

import com.mxgraph.canvas.mxICanvas;
import com.mxgraph.canvas.mxSvgCanvas;
import com.mxgraph.io.mxCodec;
import com.mxgraph.util.mxCellRenderer;
import com.mxgraph.util.mxDomUtils;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.view.mxGraph;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;

@Service
public class DiagramRenderer {
    public String renderAsSvg(Document xml) {
        mxCodec codec = new mxCodec(xml);
        mxGraph graph = new mxGraph();

        codec.decode(xml.getDocumentElement(), graph.getModel());

        mxSvgCanvas canvas = (mxSvgCanvas) mxCellRenderer.drawCells(graph,
                null, 1, null, new mxCellRenderer.CanvasFactory()
                {
                    public mxICanvas createCanvas(int width, int height)
                    {
                        return new mxSvgCanvas(mxDomUtils
                                .createSvgDocument(width, height));
                    }
                });

        if (canvas == null){
            return "Empty diagram";
        }

        return mxXmlUtils.getXml(canvas.getDocument());
    }
}
