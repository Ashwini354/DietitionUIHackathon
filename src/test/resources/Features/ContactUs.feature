
Feature: Contact Us page

  Scenario: Validating the heading of Contact us page
    Given User is on Contact Us Page
    Then User should see a heading with text Contact Us on the page
    
  Scenario: Validating the email id field on Contact us page
    Given User is on Contact Us Page
    Then User should see an email id numpyninja@gmail.com on the page
    
  Scenario: Validating the phone number field on Contact us page
    Given User is on Contact Us Page
    Then User should see "+0 000-000-0000" as phone number  on the page
    
  Scenario: Validating the street number and name of address field on Contact us page
    Given User is on Contact Us Page
    Then User should see "123, Doctor Lane" as the street number and name of the address
    
  Scenario: Validating the city field on Contact us page
    Given User is on Contact Us Page
    Then User should see "Seattle" as the city name of the address  
    
  Scenario: Validating the state, pin and country field on Contact us page
    Given User is on Contact Us Page
    Then User should see "WA 98012, USA" as the state,pin and country field of the address 
    
  Scenario: Validating the visibility of submit button on contact us page
    Given User is on Contact Us Page
    Then User should see a button with text Submit on the bottom of the page 
    
 Scenario Outline: Validating the functionality of submit button with multiple sets of invalid data
    Given User is on Contact Us Page
    When User submits the form as <Trail> with the details "<First Name>", "<Last Name>", "<Email>", "<Subject>", "<Write your Message>"
    Then User should see a message "<Message>" on the page
  Examples:
	| Trail |   First Name  | Last Name   | 	  Email 				|		Subject			|		Write your Message		| 						Message				      |  
	|		1	  |								|							|										|								|													|	Please enter all the fields     |   
	|		2	  |		  123	  		|	   Xyz			|	abcxyz@gmail.com	|		Products		|	Need info about Products|	Please enter a valid First Name	|
	|		3	  |		  Abc		  	|	   123			|	abcxyz@gmail.com	|		Products		|	Need info about Products|	Please enter a valid Last Name  |
	|		4	  |		  Abc		  	|	   Xyz			|    	  abcxyz    	|		Products		|	Need info about Products|	Please enter a valid Email Id	  |				
	|		5	  |		  Abc		  	|	   Xyz			| abcxyz@gmail.com  |		34@57678		|	Need info about Products|	Please enter a valid Subject	  |	
	|		6	  |		  Abc		  	|	   Xyz			| abcxyz@gmail.com	|		Products  	|			5789468754578%$567	|	Your Request is Submitted   	  |																				 
	
	
  