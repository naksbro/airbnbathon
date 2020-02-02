@adventurePage
  Feature: Adventure page testing
    @smoke
    Scenario: Verify Airbnb Adventures
      Given User opens home page
      When User navigates to "Adventure" page
      Then Verifies title is "Airbnb Adventure"
      And Verifies Adventures under 500