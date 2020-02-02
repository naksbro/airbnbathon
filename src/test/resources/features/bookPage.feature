@bookPage @fullTest
Feature: Home page Testing
  #@smoke
  Scenario: Verify Search Feature
    Given User opens home page
    When User enters "Bahamas", checks in today, checks out in a week, and enters "4" guests
    Then Verify "Bahamas" is searched

