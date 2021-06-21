Feature: Compose and send the mail through gmail account
Scenario: User Login and sends email
Given There is a user who visit gmail login page
Given user enter application url "gmail.com"
And User login with username "abc123@gmail.com" 
And User login with username  password "abc123"
When User sends an email to "xyz@gmail.com" 
And User sends an email  with subject "Incubyte"
Then User sends an email with the body "Automation QA test for Incubyte"
