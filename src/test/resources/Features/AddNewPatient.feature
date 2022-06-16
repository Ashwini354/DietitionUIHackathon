Feature: Add New Patient Page

  Scenario: Add New Patient Details
    Given User is on the Add New Patient Page
    When User wants to enter New Patient details
    Then Patient Data From is visible
    
    
  Scenario: Empty Form submission For Add New Patient Details
    Given User is on the Add New Patient page
    When User attempts to submit the form without filling up mandatory fields
    Then Unable to update and show Please fillup all the mandatory fields error message
    
  Scenario: Full Name Field Space Validation
    Given User is on the Add New Patient page
    When User does not put space in between First Name and Last Name for Full Name field
    Then Unable to enter and show First and Last Name should have space in between error message
    
  
  Scenario Outline: Add New Patient Enteries
	    Given User is on the Add New Patient page
	    When User enters Full Name "<Full Name>", Address1 "<Address1>", Address2 "<Address2>", Country "<Country>", City "<City>", State "<State>", Postal Code <Postal Code>, Email "<Email>" and Phone Number "<Phone Number>"
	    Then User can see the error message
	    Examples:
	    |Full Name 		|Address1  		  |Address2     	|Country    |City   |State        |Postal Code |Email              |Phone Number|
	    |Fname Lname123 |Test Address1    |Test Address2    |Canada     |City   |State Name   |1111        |s.misra17@gmail.com|9632587410  | 
	    |Fname Lname    |Test Address1    |Test Address2    |Canada     |City123|State Name   |1111        |s.misra17@gmail.com|9632587410  |
	    |Fname Lname    |Test Address1    |Test Address2    |Canada     |City4  |State Name123|1111        |s.misra17@gmail.com|9632587410  |
	    |Fname Lname    |Test Address1    |Test Address2    |Canada     |City5  |State Name   |11ss        |s.misra17@gmail.com|9632587410  |
	    |Fname Lname    |Test Address1    |Test Address2    |Canada     |City6  |State Name   |1111        |1234@gmail.com     |9632587410  |
	    |Fname Lname    |Test Address1    |Test Address2    |Canada     |City6  |State Name   |1111        |s.misra17@gmail.com|96325       |    
    	
    
   Scenario: Add New Patient Successfully
    Given User is on the Add New Patient page
    When User enters correct patient details
    Then User lands on My Patients page   
    
    
        
        
    
     