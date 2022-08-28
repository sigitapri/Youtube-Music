Feature: Search Music
  Scenario: As user i want to search music
    Given User open youtube music "https://music.youtube.com/"
    And User input keyword "numb"
    When User click search
    Then Youtube music show result of keyword numb