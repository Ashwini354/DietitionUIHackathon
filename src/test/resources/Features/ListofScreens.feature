
Feature: List Of Screens
  

  Scenario: Validating the visibility of List of screens link on Home page
    When User is on Dietician website
    Then User should see a link with three horizontal lines on the Home page

  Scenario: Validating the visibility of List of screens link on Home page
    Given User is on Dietician website
    When User selects the link with three horizontal lines on top right corner
    Then User should see a menu with list of clickable links is displayed
 
  Scenario: Validating the name of List of screens menu
    Given User is on Dietician website
    When User selects the link with three horizontal lines on top right corner
    Then User should see name on the list of screens as Screens
    
  Scenario: Validating the Public section on list of screens
    Given User is on Dietician website
    When User selects the link with three horizontal lines on top right corner
    Then User should see a heading with text Public in the menu  
     
  Scenario: Validating the Dietician section on list of screens
    Given User is on Dietician website
    When User selects the link with three horizontal lines on top right corner
    Then User should see a heading with text Dietician in the menu 
    
  Scenario Outline: Validating the text of links in the Screens menu
    Given User is on Dietician website
    When User selects the link with three horizontal lines on top right corner
    Then User should see a link with text "<LinkName>" in the Screens menu
	Examples:
	|LinkName         |
	|User Sign In     |		
	|Register         |	
	|Team             | 
	|Testimonials     |  
	|Forgot Password  |   
	|Product Features | 
	|Contact          | 
	|Blogs            | 
	|Featured Content | 
	|Home             | 
	|View Recent Diets|
	|View Recent Test Reports|
	|Add New Patient         | 
	|Dietician Home          | 
	|My Patients             |   
	|Confirm Conditions and Create Plan| 
	
	
	Scenario Outline: Validating the functionality of links in the Public menu of screens
    Given User is on Dietician website
    When User selects the link "<PublicLink>" from the Public menu of Screens
    Then User is re-directed to the public page "<PublicLink>"
  Examples:
	|PublicLink       |
	|User Sign In     |		
	|Register         |	
	|Team             | 
	|Testimonials     |  
	|Forgot Password  |   
	|Product Features | 
	|Contact          | 
	|Blogs            | 
	|Featured Content | 
	|Home             | 	
	
 Scenario Outline: Validating the functionality of links in the Dietician menu when User is not signedin
    Given User is on Dietician website
    When User selects the link "<DieticianLink>" from the Dietician menu of Screens
    Then User is re-directed to SignIn page
  Examples:
	|DieticianLink       							 |
	|View Recent Diets								 |
	|View Recent Test Reports					 |
	|Add New Patient         					 | 
	|Dietician Home         					 | 
	|My Patients            					 |   
	|Confirm Conditions and Create Plan| 

	Scenario Outline: Validating the functionality of links in the Dietician menu when User is signedin
    Given User is signed into Dietician website
    When User selects the link "<DieticianLink>" from the Dietician menu of Screens
    Then User is re-directed to the Dietician page "<DieticianLink>"
  Examples:
	|DieticianLink       							 |
	|View Recent Diets								 |
	|View Recent Test Reports					 |
	|Add New Patient         					 | 
	|Dietician Home         					 | 
	|My Patients            					 |   
	|Confirm Conditions and Create Plan| 