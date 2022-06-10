
Feature: Register Page

  Scenario: Validating the Sign Up form heading
    Given User is on Dietician website
    When User clicks on REGISTER link from the Home Page
    Then User should see a form with heading Sign Up form
    
    
  Scenario: Validating the Sign Up button for the option "Sign Up form" on  Register page.
    Given User is on Dietician website
    When User clicks on REGISTER link from the Home Page
    Then User should see a button with text SIGN UP in the Sign Up form
