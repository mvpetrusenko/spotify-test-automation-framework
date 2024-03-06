package com.example.serenity.clients;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.rest.SerenityRest;

public abstract class BaseClient extends UIInteractions {

    protected RequestSpecification requestSpecification;

    public BaseClient() {
        SerenityRest.enableLoggingOfRequestAndResponseIfValidationFails();

        requestSpecification = SerenityRest
                .given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON);
    }
}
