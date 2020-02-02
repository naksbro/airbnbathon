@helpPage
Feature: help Page Test
@helpPageT
  Scenario: Verify text
    Given User opens home page
    When User navigate to "help" page
    Then Verifies title is "Home - Airbnb Help Center"
    And User Select first popular article

