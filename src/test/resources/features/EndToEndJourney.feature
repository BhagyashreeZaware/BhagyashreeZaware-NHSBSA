@SmokeTest
Feature: Validate if user is able to get help or not from NHS costs online service.

  Scenario Outline: Verify user able to check for help from NHS cost online service (Live in England )
    Given I access NHS cost online service
    And I start my application
    When I choose <country> as a live in country
    And I choose <option> to GP practice in Scotland or Wales
    And My dental practice is in <dp_country>
    And My date of birth is <day>, <month>, <year>
    And I choose <partner_option> to live with partner
    And I choose <claim_option> for claim any benefits or tax credits
    And My partner <uc_option> get universal credit payments
    And As part of joint universal credit <credit_option> responsibilities
    And I choose <pay_option> to have a combined take-home pay
    Then I will see <output> screen

    Examples:
      | country | option | dp_country | day | month | year | partner_option | claim_option | uc_option | credit_option | pay_option | output                      |
      | England | Yes    | England    | 01  | 01    | 2000 | Yes            | Yes          | does      | do not have   | Yes        | You get help with NHS costs |


  Scenario Outline: Validate user does not get help from NHS cost online service who Lives in Northern Ireland.
    Given I access NHS cost online service
    And I start my application
    When I choose <country> as a live in country
    Then I will see <output> screen
    Examples:
      | country          | output                      |
      | Northern Ireland | You get help with NHS costs |


  Scenario Outline: Validate user gets help from NHS cost online service who Lives in Scotland.
    Given I access NHS cost online service
    And I start my application
    When I choose <country> as a live in country
    And I choose <option> to GP practice in Scotland or Wales
    And I choose "Yes" to live in the Highlands and Islands
    And My dental practice is in <dp_country>
    And My date of birth is "<day>", "<month>", "<year>"
    And I choose <partner_option> to live with partner
    And I choose "Yes" for claim any benefits or tax credits
    And My partner <uc_option> get universal credit payments
    And I choose <pay_option> to have a combined take-home pay
    Then I will see "<output>" screen
    Examples:
      | country | option | dp_country | day | month | year | partner_option | claim_option | uc_option | pay_option | output                      |
      | Scotland | Yes   | Scotland   | 01  | 01    | 2000 | Yes            | Yes          | does      | Yes        | You get help with NHS costs |

#  Scenario: Validate user gets help from NHS cost online service who Lives in Wales.
#    Given I access NHS cost online service
#    And I start my application
#    When I choose <country> as a live in country
#    And I choose an option GP practice in Scotland or Wales as "Yes"
#    And I choose "England" as a country is my dental practices
#    And My date of birth is "<day>", "<month>", "<year>"
#    And I choose <partner_option> to live with partner
#    And I choose "Yes" for claim any benefits or tax credits
#    And I choose "Yes" to get paid Universal Credit
#    And I choose "Yes" as part of my joint Universal Credit
#    And I choose "Yes" for a combined take-home pay of £935 or less in your last Universal Credit period
#    Then I will see "You get help with NHS costs" screen

