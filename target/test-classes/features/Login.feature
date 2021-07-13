Feature: Application Login

Scenario: Home page default login
Given User is on Netbanking landing page
When User login to application with "jhon" and "1234"
Then Home page is populated
And Cards displayed are "true"


Scenario: Home page default login
Given User is on Netbanking landing page
When User login to application with "jin" and "3456"
Then Home page is populated
And Cards displayed are "false"