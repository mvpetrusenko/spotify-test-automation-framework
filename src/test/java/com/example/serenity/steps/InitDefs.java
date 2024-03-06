package com.example.serenity.steps;

import com.example.serenity.clients.swagger.InitClient;
import com.example.serenity.dtos.requests.clients.InitRequest;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.rest.SerenityRest;

public class InitDefs {

    @Steps
    private InitClient initClient;

    @When("^I wont to get pet with id: (.*)$")
    public void getPetById(Long id) {
        initClient.getInit(id);
    }

    @When("^I wont to get pet from last response$")
    public void getPetFromLastRequest() {
        initClient.getInit(SerenityRest.lastResponse().jsonPath().getLong("id"));
    }

    @When("^I wont to create pet with default props and name: \"(.*)\"$")
    public void createPetWithDefaultPropsAndName(String name) {
        var init = InitRequest.builder()
                .name(name)
                .build();

        initClient.postInit(init);
    }

}
