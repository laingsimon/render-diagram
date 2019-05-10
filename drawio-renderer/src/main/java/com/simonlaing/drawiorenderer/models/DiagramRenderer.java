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

import javax.imageio.ImageIO;
import javax.imageio.stream.MemoryCacheImageOutputStream;
import java.awt.*;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

@Service
public class DiagramRenderer {
    public Object render(Document xml, RenderFormat format){
        mxCodec codec = new mxCodec(xml);
        mxGraph graph = new mxGraph();

        codec.decode(xml.getDocumentElement(), graph.getModel());

        return format.render(graph);
    }

    static Object renderAsSvg(mxGraph graph) {
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

    static Object renderAsPng(mxGraph graph) {
        RenderedImage image = mxCellRenderer.createBufferedImage(graph, null, 1, Color.WHITE, false, null);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "png", outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return outputStream.toByteArray();
    }
}
