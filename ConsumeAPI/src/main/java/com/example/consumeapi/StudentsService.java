package com.example.consumeapi;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class StudentsService {
    // Variables
    public HttpClient client;
    public HttpRequest request;
    public HttpResponse<String> response;


    public void setConnection() throws IOException, InterruptedException {
        client = HttpClient.newHttpClient();
        request = HttpRequest.newBuilder(
                URI.create("http://dados.ufrn.br/api/action/datastore_search?resource_id=e2b5b843-4f58-497e-8979-44daf8df8f94&limit=5"))
                .build();
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    public String getResponse() throws IOException, InterruptedException {
        this.setConnection();
        return response.body();
    }

    public StudentsService() {}
}
