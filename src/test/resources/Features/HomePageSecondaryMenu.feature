Feature: Home-Secondary Menu Bar

  Scenario: Validating the tab About visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text About on the bottom menu bar of the Home page

  Scenario: Validating the tab Featured visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text Featured on the bottom menu bar of the Home page

  Scenario: Validating the tab Blog visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text Blog on the bottom menu bar of the Home page

  Scenario: Validating the tab Contact us visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text Contact us on the bottom menu bar of the Home page

  Scenario: Validating the visibility of search option on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a search option symbol on the bottom menu bar of the Home page

  Scenario: Validating the visibility of Signin option on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a Signin option next to the search button on the bottom menu bar of the Home page

  Scenario: Validating the About Link on Home Page
    Given User is on  Home Page
    When User clicks on About Link on Home page 
    Then User is directed to About Page

  Scenario: Validating the Feature Link on Home Page
    Given User is on  Home Page
    When User clicks on Featured link 
    Then User is directed to Featured content page

  Scenario: Validating the Blogs link on Home page
    Given User is on  Home Page
    When User clicks on Blogs link 
    Then User is directed to Blogs Page

  Scenario: Validating the Contact us link on Home page
    Given User is on  Home Page
    When User clicks on Contact us link 
    Then User is directed to Contact us Page
    
    