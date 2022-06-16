
Feature:
 Scenario:  Verify that each patient has Cust ID
    Given User has searched patients
    When Patients records are displayed with cus ID
    Then Customer Id is shown in column 'Cust ID' column
    
    Scenario:  Verify that each patient has name
    Given User has searched patients
    When Patients records are displayed
    Then Patient's name is displayed in 'Name' column
    
    
    Scenario: Verify detail column
    Given User has searched patients
    When Patients records are displayed
    Then Details column shows patient's email or phone number or address
    
   
    Scenario: Verify last visit column
    Given User has searched patients
    When Patients records are displayed
    Then Last visit date is shown in valid date format
    
     Scenario: Verify format of email address
    Given User has searched patients
    When Patients records are displayed
    Then Verify that email address is in valid format in details cloumn.
    
     Scenario: View pateints previous diet plans
    Given Patients records are displayed
    When User clicks on button 'View Previous Diet Plans'
    Then It redirects user to 'Generated Diet Plans' page
    
     Scenario: Create new diet plan
    Given Patients records are displayed
    When User clicks on button User clicks on button 'Create New Report/Plan'
    Then It redirects user to 'Confirm Health Conditions and Generate a New Diet plan' page
    
     Scenario: Create View patients previous test reports
    Given Patients records are displayed
    When User clicks on button 'View Previous Test Reports'
    Then It redirects user to 'View Patient Test Reports' page
    
      Scenario: Verify my patient tab on test report page
    Given User has searched patients after login
    When User is on 'View Patient Test Reports' page
    Then My Patients tab is selected highlighted
    
      Scenario: Verify title
    Given User has searched patients after login
    When User is on 'View Patient Test Reports' page
    Then Title is displayed as 'View Patient Test Reports
    
     Scenario: Verify user's primary info
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then It displays primary information like patient Id  number, name, email address, Phone number, Address
    
     Scenario: Verify table heading
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then It shows column heading as Record number, Doc-ID, File Uploaded time, File/Report name, Identified health conditions
    
    
      Scenario: Verify presence of pdf file for each report
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then Every record shows 'view PDF' option
    
     Scenario: Verify presence of doc id
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then Every report has Doc Id
    
    Scenario: Verify presence of uploaded time 
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then Every report shows file upload time
    
    Scenario: Verify age of uploaded time
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then Every report has its name
    
    Scenario: Verify identified conditions
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then Every report shows identified conditions from its test report file
    
    Scenario: Verify pagination
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then More than 3 records should be displayed on different pages through pagination
    
    Scenario: Verify next link
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then Pagination has 'Next' link
    
     Scenario: Verify previous link
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then Pagination has 'Previous' link
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   