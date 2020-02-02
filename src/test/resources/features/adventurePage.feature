@adventurePage
  Feature: Adventure page testing
    @smoke
    Scenario: Verify Airbnb Adventures
      Given User opens home page
      When User navigates to "Adventure" page
      Then Verifies title is "Airbnb Adventure"
      And Verifies Adventures under 500

    Scenario: Verify text
      Given User opens home page
      When User navigates to "Help" page
      Then Verifies title is "Home - Airbnb Help Center"
      And User navigates to "First Article" page
      Then Verifies title of article
