
Feature: Register Page

   Scenario: Validating the title of "Register Page"
   Given User is on Dietician website
   When  User clicks on REGISTER link from the Home Page
   Then   User should see title of page as Register
   

    Scenario: Validating the Sign Up form heading
    Given User is on Dietician website
    When User clicks on REGISTER link from the Home Page
    Then User should see a form with heading Sign Up form
    
    
    Scenario: Validating the Sign Up button for the option "Sign Up form" on  Register page.
    Given User is on Dietician website
    When User clicks on REGISTER link from the Home Page
    Then User should see a button with text SIGN UP in the Sign Up form

    Scenario: Validating the Sign Up with different credentials.
    Given User is on Register Page
    When User does not enter any value in fields
    Then User should see message"Fields are empty"
    
    Scenario Outline: Successful Sign Up with enteries
    Given User is on Register Page
    When User enters "<First Name>","<Last Name>",<Mobile Number>,"<Any other Fields>","<Email>","<Password>" and "<Error>"
    Then User should be on Sign In Page
    
    Examples:
    |First Name|Last Name|Mobile Number|Any other fields|Email               |Password |Error                   |
    |Ayu345    |Mishra   |987654321    | USA            |m.sunita20@gmail.com|mishra   |Only characters allowed|
    |Ayushi    | Mis345  |987654321    |USA             |m.sunita20@gmail.com|mishra   |Only characters allowed|
    |Ayushi    |Mishra   |98765        |USA             |m.sunita20@gmail.com|mishra   |Invalid entry| 
    |Ayushi    |Mishra   |987654321    |USA             |1234@gmail.com      |mishra   |Invalid mail id|
    |Ayushi    |Mishra   |987654321    |USA             |m.sunita20@gmail.com|1234    |Invalid password|
    |Ayushi    |Mishra   |987654321    |USA            |m.sunita20@gmail.com|mishra  |Successful Sign up|
     
  Scenario Outline: Sign Up with second option
  Given User is on Register Page
  When User gives "<Name>","<L Name>","<Username>","<Email address>","<Pword>","<Confirm Pword>" and "<Error>"
  Then User should be able to Sign In Page 
  
  Examples:
    |Name  |L Name |Username|Email address       |Pword    |Confirm Pword|Error                   |
    |Ayu345|Mishra |Rijul   |m.sunita20@gmail.com|mishra   |mishra          |Only characters allowed|
    |Ayushi|Mis345 |Rijul   |m.sunita20@gmail.com|mishra   |mishra          |Only characters allowed|
    |Ayushi|Mishra |4567    |m.sunita20@gmail.com|mishra   |mishra          |Invalid entry          | 
    |Ayushi|Mishra |Rijul   |1234@gmail.com      |mishra   |mishra          |Invalid mail id        |
    |Ayushi|Mishra |Rijul   |m.sunita20@gmail.com|1234     |mishra          |Invalid password       |
    |Ayushi|Mishra  |Rijul   |m.sunita20@gmail.com|mishra   |4568           |Invalid Confirm Password| 
    |Ayushi|Mishra  |Rijul   |m.sunita20@gmail.com|mishra   |mishra         |Sign up success         |
    
    Scenario: Validating Sign Up Process with Facebook
    Given User is on Register Page
    When User clicks Facebook button in the Sign Up with Email form
    Then User is directed to Facebook login page
    
    Scenario: Validating Sign Up Process with Google
    Given User is on Register Page
    When User clicks Google button in the Sign Up with Email form
    Then User is directed to Google login page  
    
 Scenario: Validating Log In Here link
    Given User is on Register Page
    When User clicks Log In Here link
    Then User is directed to SignIn page  