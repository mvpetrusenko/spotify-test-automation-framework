package com.example.serenity.clients.swagger;

import com.example.serenity.dtos.requests.clients.InitRequest;
import net.serenitybdd.annotations.Step;


import io.restassured.response.Response;



public class InitClient extends BaseSwaggerClient {



    private final static String INIT_ENDPOINT = "/artists/1RyvyyTE3xzB2ZywiAwp0i";
    private final static String INIT_ID_ENDPOINT = INIT_ENDPOINT + "/{id}";

    @Step("get pet by id: {0}")
    public void getInit(Long initId) {
        Response response = requestSpecification
                .pathParams("id", initId)
                .basePath(INIT_ID_ENDPOINT)
                .get();


        response.then().log().all(); // Log the response
        response.then().statusCode(200);

    }

    @Step("create pet with params: {0}")
    public void postInit(InitRequest initRequest) {
        Response response = requestSpecification
                .basePath(INIT_ENDPOINT)
                .body(initRequest)
                .post();

        response.then().log().all(); // Log the response
        response.then().statusCode(200);

    }
}
