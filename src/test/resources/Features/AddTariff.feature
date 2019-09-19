Feature: AddTariff flow

  Background: 
    Given User should be in the telecom Home page
    And user click on add tariff plan button

  Scenario: 1D List
    When user enter all the field with valid charges
      | 10 | 110 | 20 | 80 | 90 | 109 | 80 |
    And User clicks on submit button
    Then user should be displayed Your Tariff added

  @smoke
  Scenario: 2D List
    When user enter all the field with valid chargess
      | 10 | 110 | 20 | 80 | 90 | 109 | 80 |
      | 50 |  30 | 90 | 80 | 70 |  50 | 40 |
    And User clicks on submit button
    Then user should be displayed Your Tariff added

  Scenario: 2D Map
    When user enter all the fields with validd chargess
      | A  | B   | C  | D  | E  | F   | G  |
      | 10 | 110 | 20 | 80 | 90 | 109 | 80 |
      | 50 |  30 | 90 | 80 | 70 |  50 | 40 |
      | 89 |  99 | 89 | 60 | 70 |  50 | 10 |
    And User clicks on submit button
    Then user should be displayed Your Tariff added

  Scenario Outline: 
    When user enter all the field with valid chargess"<A>""<B>""<C>""<D>""<E>""<F>""<G>"
    And User clicks on submit button
    Then user should be displayed Your Tariff added

    Examples: 
      | A  | B   | C  | D  | E  | F   | G  |
      | 10 | 110 | 20 | 80 | 90 | 109 | 80 |
      | 50 |  30 | 90 | 80 | 70 |  50 | 40 |
      | 10 | 110 | 20 | 80 | 90 | 109 | 80 |
