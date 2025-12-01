Feature: Navigate to Youtube homepage and singing in to the account

  @Smoke
Scenario: Verify user navigates to Youtube Homepage
Given user is able to see the Youtube logo
When user is able to see the sign button
Then user clicks on Sign in Button



Scenario: Verify user redirects to sign-in window
Given user provides email id "learn.selenium.automationn@gmail.com"
And user clicks on next button1
And user enters Password "Testing@12345"
When user clicks on next button2
Then user is able to logs in to the account and user is able to see "Try searching to get started" text

