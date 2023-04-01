@SmokeTest
Feature: Validate if user is able to get help or not from NHS costs online service.

  Scenario: Validate user gets help from NHS cost online service who Lives in England.
    Given I launch the cost online service application.
    And I am on the page "Check what help you could get to pay for NHS costs"
    And I start my NHS cost online service application
    And I will see "Which country do you live in?" page
    And I choose an option live in country as "England"
    And I choose an option GP practice in Scotland or Wales as "Yes"
    And I choose "England" as a country is my dental practices
    And My date of birth is "01", "02", "2000"
    And I choose "Yes" to live with a partner
    And I choose "Yes" for claim any benefits or tax credits
    And I choose "Yes" to get paid Universal Credit
    And I choose "Yes" as part of my joint Universal Credit
    And I choose "Yes" for a combined take-home pay of £935 or less in your last Universal Credit period
    Then I will see "You get help with NHS costs" screen

  Scenario: Validate user does not get help from NHS cost online service who Lives in Northern Ireland.
    Given I launch the cost online service application.
    Given I start my NHS cost online service application
    And I am on the page "Check what help you could get to pay for NHS costs"
    And I will see "Which country do you live in?" page
    When I choose an option live in country as "Northern Ireland"
    Then I will see "You cannot use this service because you live in Northern Ireland" screen

  Scenario: Validate user gets help from NHS cost online service who Lives in Scotland.
    Given I launch the cost online service application.
    And I start my NHS cost online service application
    And I am on the page "Check what help you could get to pay for NHS costs"
    And I will see "Which country do you live in?" page
    And I choose an option live in country as "Scotland"
    And I choose "Yes" to live in the Highlands and Islands
    And I choose "England" as a country is my dental practices
    And My date of birth is "01", "02", "2000"
    And I choose "Yes" to live with a partner
    And I choose "Yes" for claim any benefits or tax credits
    And I choose "Yes" to get paid Universal Credit
    And I choose "Yes" as part of my joint Universal Credit
    And I choose "Yes" for a combined take-home pay of £935 or less in your last Universal Credit period
    Then I will see "You get help with NHS costs" screen

  Scenario: Validate user gets help from NHS cost online service who Lives in Wales.
    Given I launch the cost online service application.
    And I start my NHS cost online service application
    And I am on the page "Check what help you could get to pay for NHS costs"
    And I will see "Which country do you live in?" page
    And I choose an option live in country as "Wales"
    And I choose an option GP practice in Scotland or Wales as "Yes"
    And I choose "England" as a country is my dental practices
    And My date of birth is "01", "02", "2000"
    And I choose "Yes" to live with a partner
    And I choose "Yes" for claim any benefits or tax credits
    And I choose "Yes" to get paid Universal Credit
    And I choose "Yes" as part of my joint Universal Credit
    And I choose "Yes" for a combined take-home pay of £935 or less in your last Universal Credit period
    Then I will see "You get help with NHS costs" screen

