package com.example.serenity.steps;

import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;

public class RestApiDefs {

    @Then("^I see in response status code: (.*)$")
    public void checkResponseStatusCode(Integer value) {
        SerenityRest.restAssuredThat(response -> response.statusCode(value));
    }

    @Then("^I see in response by path: \"(.*)\", value: \"(.*)\"$")
    public void checkResponseValue(String path, String value) {
        SerenityRest.restAssuredThat(response -> response.body(path, Matchers.equalTo(value)));
    }

    @Then("^I see in response by path: \"(.*)\", contains value: \"(.*)\"$")
    public void checkResponseContainsValue(String path, String value) {
        SerenityRest.restAssuredThat(response -> response.body(path, Matchers.containsString(value)));
    }
}
