@helpPage
Feature: help Page Test
@helpPageT
  Scenario: Verify text
    Given User opens home page
    When User navigates to "Help" page
    Then Verifies title is "Home - Airbnb Help Center"
    And User navigates to "First Article" page
    Then Verifies title of article
