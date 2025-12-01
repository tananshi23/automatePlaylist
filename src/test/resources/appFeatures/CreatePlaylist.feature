Feature: User creates playlist
@Smoke
  Scenario: Creating playlist in Youtube
    Given user search for "Kishore Kumar songs"
    When user clicks on search result
    Then user navigates to list of songs