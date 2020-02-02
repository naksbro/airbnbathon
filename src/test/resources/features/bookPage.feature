@bookPage @fullTest
Feature: Home page Testing
  @smoke
  Scenario: Verify Search Feature
    Given User opens home page
    When User enters "Bahamas", checks in today, checks out in 1 week, and enters "4" guests
    Then Verify search parameters are correct

