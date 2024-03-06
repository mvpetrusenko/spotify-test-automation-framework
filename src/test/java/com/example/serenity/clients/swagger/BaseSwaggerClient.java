package com.example.serenity.clients.swagger;

import com.example.serenity.clients.BaseClient;

public abstract class BaseSwaggerClient extends BaseClient {

    public final static String URI = "https://api.spotify.com/v1";

    public BaseSwaggerClient() {
        requestSpecification = requestSpecification
                .given()
                .baseUri(URI);
    }
}
