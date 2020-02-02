@becomeHostPage

Feature: becomeHostPage Testing
  @smoke
  Scenario:Verify title of becomeHostPage
    Given  User opens home page
    When User navigates to "Host a Home" page
    Then Verifies title is "Rent out your house, apartment or room on Airbnb"