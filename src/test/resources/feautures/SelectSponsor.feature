Feature: as a user i select a sponsor

  Scenario: user select from Sponsor dropdown a sponsor
    Given user on  HDX home page
    When user select "Boehringer Ingelheim" sponsor
    And the page will move to the next page
    Then user click data entry
    Then user click new entry

