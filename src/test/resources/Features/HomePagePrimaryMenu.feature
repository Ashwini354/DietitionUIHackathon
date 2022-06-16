Feature: Home-Primary Menu Bar

    Scenario: Validating the title of the Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see the title of the page as Home

  Scenario: Validating the logo on the Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a logo image with the company name on the Home Page

  Scenario: Validating the tab PRODUCT visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text PRODUCT on the top menu bar of the Home page

  Scenario: Validating the tab CLIENTS visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text CLIENTS on the top menu bar of the Home page

  Scenario: Validating the tab TEAM visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text TEAM on the top menu bar of the Home page

  Scenario: Validating the tab REGISTER visibility on the menu bar of Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text REGISTER on the top menu bar of the Home page

  Scenario: Validating the Product link on Home Page
    Given User is on Home page
    When User clicks on PRODUCT Link on Home Page
    Then User is re-directed to Product Page

  Scenario: Validating the Client link on Upper Menu Bar on Home page
    Given User is on Home page
    When User clicks on Client link on Home Page
    Then User is re-directed to Client Testimonial Page

  Scenario: Validating the TEAM link on Upper Menu Bar on Home page
    Given User is on  Home Page
    When User clicks on Team Link on Home Page
    Then User is directed to Doctor Team page

  Scenario: Validating the REGISTER link on Upper Menu Bar  on Home page
    Given User is on  Home Page
    When User clicks on REGISTER Link on Home Page 
    Then User is directed to Register page
    
    
    
    