Feature: Gmail Signup

  Scenario: User Signup with positive data
    Given user is on the gmail signup page
    When user enters the Firstname as "rk"
    And user enters the Lastname as "vrit"
    And user click on the next button
    #And user selects the bday month as "February"
    #And user enters the date as "11"and year as "1980"
    #And user click on the preferred email in the list