package com.simonlaing.drawiorenderer.models;

import com.mxgraph.canvas.mxICanvas;
import com.mxgraph.canvas.mxSvgCanvas;
import com.mxgraph.util.mxCellRenderer;
import com.mxgraph.util.mxDomUtils;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.view.mxGraph;

public class JavaSvgRenderer extends BaseGraphRenderer {
    JavaSvgRenderer(DiagramDecoder decoder) {
        super(decoder);
    }

    @Override
    protected Object render(mxGraph graph) {
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
            throw new RuntimeException("Empty diagram");
        }

        return mxXmlUtils.getXml(canvas.getDocument());
    }
}
