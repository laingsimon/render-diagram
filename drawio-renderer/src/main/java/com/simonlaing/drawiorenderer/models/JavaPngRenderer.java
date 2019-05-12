package com.simonlaing.drawiorenderer.models;

import com.mxgraph.util.mxCellRenderer;
import com.mxgraph.view.mxGraph;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JavaPngRenderer extends BaseGraphRenderer {
    JavaPngRenderer(DiagramDecoder decoder) {
        super(decoder);
    }

    @Override
    protected Object render(mxGraph graph) {
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

