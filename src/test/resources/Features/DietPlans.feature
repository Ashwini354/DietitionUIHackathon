
Feature: Diet Plans Page
  
 Background: User is logged on to Dietician website
    Given User is on signin page
    When User clicks the signin button by entering the valid credentials
    Then User should land on Dietician Home page    
    
 Scenario: Validating the heading of the Diet plans page
    When User is on View Recent Diets Page
    Then User should see the heading Generated Diet Plans on the page
    
 Scenario: Validating the tabs on the menu bar of Diets page
    When User is on View Recent Diets Page
    Then User should see that Diet Plans tab on the menu bar is selected    
    
 Scenario: Validation of "View PDF" option
    When User is on View Recent Diets Page
    Then View PDF button is available for the generated diet plans 
    
 Scenario: Validating the visibility of next page button
    When User is on View Recent Diets Page
    Then User should see a next page button shown as > on the page
    
 Scenario: Validating the visibility of previous page button
    When User is on View Recent Diets Page
    Then User should see a next page button shown as < on the page
    
 Scenario: Validating the default number of records displayed per page
    When User is on View Recent Diets Page
    Then User should see five records per page  
    
 Scenario: Validation of traversing next page button
    Given User is viewing first page of records in the View Recent Diets Page 
    When User selects the next page button (>)   
    Then User should see the second page 
     
 Scenario: Validation of traversing previous page button
    Given User is viewing second page of records in the View Recent Diets Page 
    When User selects the previous page button (<)   
    Then User should see the first page
    
 Scenario: Validation of generated PDF for a diet plan
    Given User is on View Recent Diets Page 
    When User selects the View PDF button for a generated diet plan
    Then User should see the headings Patient details, Doctor details, Patient health details, 7-day menu, warnings, commentsin the pdf 
 		
 Scenario: Validation of download PDF option for a diet plan
    Given User is on View Recent Diets Page 
    When User selects the View PDF button for a generated diet plan
    Then User should see download button for the PDF