
Feature: Generate New Diet Plan

Background: User is logged on to Dietician website
    Given User is on signin page
    When User clicks the signin button by entering the valid credentials
    Then User should land on Dietician Home page


Scenario: Validating the heading of the Create New Diet plan page
    When User lands on Confirm conditions and Create Plan page
    Then User sees the heading Confirm Health Conditions and Generate a new Diet Plan on the page 

Scenario: Validating the Browse button visibility
    When User lands on Confirm conditions and Create Plan page
    Then User should see a button with name Browse on the page 

Scenario: Validating the Upload button visibility
    When User lands on Confirm conditions and Create Plan page
    Then User should see a button with name Upload on the page 

Scenario: Validating option 1 menu visibility
    When User lands on Confirm conditions and Create Plan page
    Then User should see heading with text option 1 to update the health conditions 
    
Scenario: Validating visibility of Confirm button on option 1 menu 
    When User lands on Confirm conditions and Create Plan page
    Then User should see a button with text CONFIRM in option 1 menu     
   
Scenario: Validating the option 1 menu interaction
    When User lands on Confirm conditions and Create Plan page
    Then User can update the health conditions in option 1 menu 
           
Scenario: Validating that the option 1 menu cannot be modified after confirming
    When User clicks the CONFIRM button in option 1 menu
    Then User cannot update the health conditions in option 1 menu
    
Scenario: Validating option 2 menu visibility
    When User lands on Confirm conditions and Create Plan page
    Then User should see heading with text option 2 to update the health conditions 

Scenario: Validating visibility of Confirm button on option 2 menu 
    When User lands on Confirm conditions and Create Plan page
    Then User should see a button with text CONFIRM in option 2 menu     
     
Scenario: Validating the option 2 menu interaction
    When User lands on Confirm conditions and Create Plan page
    Then User can update the health conditions in option 2 menu 
           
Scenario: Validating that the option 2 menu cannot be modified after confirming
    When User clicks the CONFIRM button in option 2 menu
    Then User cannot update the health conditions in option 2 menu   
    
Scenario: Validating the Generate Menu button visibility
    When User lands on Confirm conditions and Create Plan page
    Then User should see a button with text GENERATE MENU  at the bottom of the page  
    
Scenario: Validating the Generate Menu button operation
    When User clicks the GENERATE MENU button
    Then User should land on View Recent Diets page  
    
        
    
      

