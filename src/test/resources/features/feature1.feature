Feature: spicejet

  Scenario Outline: 
    Given open browser site
    And launch spicejet site
    When click on frome and enter "<from>"
    And click on to and enter "<to>"
    And enter  <dd>  and "<dm>" and  <dy>
    And click on calendar
    And Enter <ad> and "<am>" and <ay>
    Then click on search flight button
    When select low price in departure flights
    And select low price in arrival flights
    Then close site

    Examples: 
      | from      | to    | dd | dm    | dy   | ad | am  | ay   |
      | Bengaluru | Delhi | 25 | april | 2022 | 25 | may | 2022 |
