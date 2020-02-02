@homePage @fullTest
Feature: Home page Testing
  @verifytitle
  Scenario: Verify title of Home Page
    Given User opens home page
    Then Verifies title is "Total-QA - Future of Software Testing"
