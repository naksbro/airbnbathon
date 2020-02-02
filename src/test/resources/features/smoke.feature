@smokeTest
  Feature: Smoke this fool
    @help
    Scenario: Verify text
      Given User opens home page
      When User navigates to "Help" page
      Then Verifies title is "Home - Airbnb Help Center"
      And User navigates to "First Article" page
      Then Verifies title of article

    @adventure
    Scenario: Verify Airbnb Adventures
      Given User opens home page
      When User navigates to "Adventure" page
      Then Verifies title is "Airbnb Adventures"
      And Verifies Adventures under 500

      @host
      Scenario:Verify title of becomeHostPage
        Given  User opens home page
        When User navigates to "Host a Home" page
        Then Verifies title is "Rent out your house, apartment or room on Airbnb"

      @book
      Scenario: Verify Search Feature
        Given User opens home page
        When User enters "Bahamas", checks in today, checks out in a week, and enters "4" guests
        Then Verify "Bahamas" is searched
