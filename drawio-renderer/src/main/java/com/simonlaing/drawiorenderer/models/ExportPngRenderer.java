package com.simonlaing.drawiorenderer.models;

import com.mxgraph.view.mxGraph;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class ExportPngRenderer implements Renderer {
    @Override
    public Object render(String xmlString) {
        try {
            URL url = new URL("https://exp-pdf.draw.io/ImageExport4/export");

            String urlParameters = getUrlEncodedData(xmlString);
            byte[] postData = urlParameters.getBytes( StandardCharsets.UTF_8 );

            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.setInstanceFollowRedirects(true);
            urlConnection.setRequestMethod("POST");
            urlConnection.setRequestProperty( "Content-Type", "application/x-www-form-urlencoded");
            urlConnection.setRequestProperty( "Content-Length", Integer.toString( postData.length ));

            urlConnection.setUseCaches( false );
            try( DataOutputStream wr = new DataOutputStream( urlConnection.getOutputStream())) {
                wr.write( postData );
            }

            if (urlConnection.getResponseCode() != 200){
                String message = urlConnection.getResponseMessage();
                throw new RuntimeException(String.format("Error converting diagram using %s\n" +
                        "%d: %s", url.toString(), urlConnection.getResponseCode(), message));
            }

            InputStream responseStream = urlConnection.getInputStream();
            return responseStream.readAllBytes();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private String getUrlEncodedData(String xmlString) {
        return "format=png&allPages=1&bg=none&base64=0&embedXml=0&xml=" + URLEncoder.encode(xmlString, StandardCharsets.UTF_8);
    }
}
