Feature: Open Explorer Youtube Music
  Scenario: Open explorer on youtube music
    Given User access youtube music "https://music.youtube.com/"
    When User click explorer button
    Then User direct to explorer page