Feature: Title of your feature
Scenario: Login Page
Given user is on login Page
 When user enter the valid "pranavee54@gmail.com"
And user enter "pranavee54#"
And user click login button
Then user get the tittle of the page
And Page Title shoud be "My account - My Storeee"

  