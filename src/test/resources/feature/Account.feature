Feature: Account Page Feature
Background:
Given user loged into the application
| username  | password |
|pranavee54@gmail.com|pranavee54#|
      

Scenario: Account Page Tittle
Given user is on account page
When user get the tittle of the page
Then page tittle should be "My account - My Store"

    
  
 