Feature: hdx app login feature

   User story:
  As a user, i should login with correct credentials to different accounts,
  and dashboard should be displayed.

  Accounts are: admin,user, superuser,data_management


  Scenario: login as a user
    When user enters username
    And  user enters password
    Then user click I Acknowledge button
    Then user click sign in button
    Then user should see the dashboard

