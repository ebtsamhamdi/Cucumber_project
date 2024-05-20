Feature: login with valid data
  Scenario: Fill valid username and valid password
    Given Fill username and password
    When click on login button
    Then navigate homepage
