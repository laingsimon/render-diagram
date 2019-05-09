package com.simonlaing.drawiorenderer.models;

import com.mxgraph.util.mxXmlUtils;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Base64;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

@Service
public class DiagramDecoder {
    public Document getDiagramData(String xmlString) throws DataFormatException, IOException {
        Document xmlDocument = mxXmlUtils.parseXml(xmlString);

        //See: https://stackoverflow.com/questions/35274068/rendering-xml-from-draw-io-as-an-image-using-mxcellrenderer
        Node diagram = xmlDocument.getElementsByTagName("diagram").item(0);
        String textContent = diagram.getTextContent();

        if (!textContent.startsWith("<")) {
            //content is compressed, following steps need to take place

            byte[] compressed = base64Decode(textContent);
            byte[] decompressed = inflate(compressed);
            textContent = urlDecode(new String(decompressed));
        }

        return mxXmlUtils.parseXml(textContent);
    }

    private byte[] inflate(byte[] compressed) throws IOException, DataFormatException {
        int compressedDataLength = 0;
        Inflater compresser = new Inflater(true);
        compresser.setInput(compressed, 0, compressed.length);
        ByteArrayOutputStream o = new ByteArrayOutputStream(compressed.length);
        byte[] result = new byte[1024];
        try {
            while (!compresser.finished()) {
                compressedDataLength = compresser.inflate(result);
                if (compressedDataLength == 0) {
                    break;
                }
                o.write(result, 0, compressedDataLength);
            }
        } finally {
            o.close();
        }
        compresser.end();
        return o.toByteArray();
    }

    private byte[] base64Decode(String input){
        return Base64.getDecoder().decode(input);
    }

    private String urlDecode(String input) {
        return URLDecoder.decode(input, Charset.defaultCharset());
    }
}
