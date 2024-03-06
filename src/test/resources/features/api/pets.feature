Feature: Test for pet group of endpoints

  Scenario: check creation of pet and that it's in the system.
    When I wont to create pet with default props and name: "Apricot"
    Then I see in response status code: 200
    Then I see in response by path: "name", value: "Apricot"
    When I wont to get pet from last response
    Then I see in response status code: 200
    Then I see in response by path: "name", value: "Apricot"