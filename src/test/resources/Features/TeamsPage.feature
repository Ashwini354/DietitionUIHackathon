Feature: Doctor Teams page

  Scenario: Validating the first Page of Doctor Team
    Given User is on Dietician Website
    When User lands on Teams page
    Then User sees Doctor's name on Doctor team page

  Scenario: Validating default number of Doctor names on first Doctor Team Page
    Given User is on Dietician Website
    When User lands on Teams page
    Then User should see 3 default Doctor names on first Page

  Scenario: Validating the next page (>) button on the first page of Team
    Given User is on Team page
    When User clicks on next button (>)  
    Then User should be directed to next Doctor on Team Page

  Scenario: Validating the previous button (<) when there are previous pages to display
    Given User is on Team page
    When User clicks on previous button (<) 
    Then User should be directed to previous page of Team
    
    
    
    