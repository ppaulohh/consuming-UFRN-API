package com.example.consumeapi.Student;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;


@Service
public class StudentsService {
    // Variables
    public HttpClient client;
    public HttpRequest request;
    public HttpResponse<String> response;
    public List<Records>  students = new ArrayList<>();


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

    public List<Records> mapping() throws IOException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.setConnection();


        String jsonOrigin = response.body();
        JsonNode jsonNode = objectMapper.readTree(jsonOrigin);

        String records = jsonNode.get("result").get("records").toString();



        try {
            if (records != null) {
                if (records.charAt(0) == '[') {
                    JavaType type = objectMapper.getTypeFactory().constructCollectionType(List.class, Records.class);
                    students.addAll(objectMapper.readValue(records, type));
                } else {
                    students.add(objectMapper.readValue(records, Records.class));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
    public StudentsService() {}
}
