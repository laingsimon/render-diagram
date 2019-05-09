package com.simonlaing.drawiorenderer.models;

import com.mxgraph.util.mxUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class DiagramRepository {
    public String fromUrl(String address) throws IOException {
        URL url = new URL(urlEncode(address));
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("GET");

        int responseCode = urlConnection.getResponseCode();

        if (responseCode == 200) {
            return mxUtils.readInputStream(urlConnection.getInputStream());
        }

        String message = urlConnection.getResponseMessage();
        throw new RuntimeException(String.format("Error downloading diagram from %s\n" +
                "%d: %s", address, urlConnection.getResponseCode(), message));
    }

    private String urlEncode(String address) {
        return address.replace(" ", "%20");
    }
}
