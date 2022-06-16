
Feature: Signin Page

 Scenario: Validating the title of "Sign In"
   Given User is on the Dietician website
   When  User clicks on icon symbol on Sign In Page
   Then  User should see title of page as Sign In
   
 Scenario: Validating the Sign In form heading
   Given User is on the Dietician website
   When User clicks on Sign In link from the Home Page
   Then User should see a form with heading Sign In form
    
 Scenario: Validating the Sign In button for the option "Sign In form" on  Sign In Page.
    Given User is on the Dietician website
    When User clicks on Sign In link from the Home Page
    Then User should see a button with text Sign In form in the Sign In
    
    Scenario Outline: Validating the Sign In with different credentials
    Given User is on Sign In Page
    When User enters "<Usrname>","<Passwrd>" and "<Err>"
    Then User should be logged in successfully
    
    Examples:
    |Usrname    |Passwrd    |Err                   |
    | null      |  null     |Please fill fields    |
    |Adri111    |bubbly     |only alphabets allowed|
    |Adriti     |bub123     |Only alphabets allowed|
    |Adri222    |bub9999    |Invalid both fields   |
    |Adriti     |bubbly     |Sign In successful    |
    
  Scenario: Validating Sign In with Forgot Password link
    Given User is on Sign In Page
    When  User clicks on Forgot Password button
    Then  User is directed to Reset password link
    
 Scenario: Validating Sign In with Not member Yet link
    Given User is on Sign In Page
    When  User clicks on Not member Yet
    Then  User is directed to Register Page
    
 Scenario: Validating the heading Login with your email in Sign In page
   Given User is on the Dietician website
   When User is on the Sign in Page
   Then User should see a form with heading Login with your email
   
 Scenario: Validating login button on Login with your email form
   Given User is on the Dietician website
   When User is on the Sign in Page
   Then User should see a button with text Log In in Sign In form 
    
  Scenario Outline: Validating with different login credentials
  Given User is on Sign In Page
  When User enters "<mailid>","<Pwrd>" and then "<Emsg>"
  Then User should be able to log in
  
    Examples:
    |mailid              |Pwrd       |Emsg                       |
    |null                |null       |Please fill fields         |
    |m_sunita20@.com     |bubbly     |Invalid entry              |
    |m_sunita20@yahoo.com|bub888     |Only alphabets allowed     |
    |m_sunita20@.co      |bub9999    |Invalid both fields        |
    |m_sunita20@yahoo.com|bubbly     |Sign In successful         |
  
 Scenario: Validating Log In Process with Facebook
    Given User is on Sign In Page
    When User clicks Facebook button in the Sign In with Email form
    Then User is directed to Facbook sign in page
    
 Scenario: Validating Sign In Process with Google
    Given User is on Sign In Page
    When User clicks Google button in the Sign In with Email form
    Then User is directed to Gogle login page  
    
 Scenario: Validating Sign Up Here link
    Given User is on Sign In Page
    When User clicks Sign Up Here link
    Then User is directed to Register page 
    
      
   
    
    
    
    
    
    
    
    