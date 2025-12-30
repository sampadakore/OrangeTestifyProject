Feature: Check login functionality of orangehrm pages

Scenario Outline: verify login functionality with different username and password combinations
Given browser is opened and app url is launched
When user enter username as "<username>"
And user enter password as "<password>"
And click on submit
Then user should see "<message>"
Examples:
    | username | password  | message                     |
    | Admin    | admin123  | Dashboard should be visible |
    | Wrong    | test123   | Invalid credentials         |
    | Admin    | wrongPass | Invalid credentials         |
    |Wrong     | wrongPass | Invalid credentials         |
    |          | admin123  | Required         |
    | Admin    |           | Required         |
    |          |           | Required          |
Scenario: Verify forgot password functionality on login page
Given browser is opened and app url is launched
When user click on forgot password option
And type username as "Admin" in username field on password reset page
And click on reset password button
Then user should get reset password link sent successful message
Scenario: Verify OrangeHrm Inc Page Navigation
Given browser is opened and app url is launched
When user click on OrangeHrm Inc Hyperlink
Then user should navigate to page showing title Human Resource Management
Scenario: Verify Company branding image
Given browser is opened and app url is launched
Then Application logo should be visible on home page of application
Scenario: Verify OrangeHrm logo 
Given browser is opened and app url is launched
Then OrangeHrm logo should be visible on home page of application

