Feature: Check Various Dashboard functionalities
Scenario: Verify Assign Leave page navigation from dashboard page
Given browser is opened and app url is launched
When user enter username as "Admin"
And user enter password as "admin123"
And click on submit
Then user should see "Dashboard"
When user click on Assign Leave tab
Then Assign leave page should open successfully
Scenario: Verify Assign Leave functionality on dashboard page
Given browser is opened and app url is launched
When user enter username as "Admin"
And user enter password as "admin123"
And click on submit
Then user should see "Dashboard"
When user click on Assign Leave tab
When user enter employee name as "joh"
And select leave type
And select from date
And select to date
And select partial days
And Add comments "not feeling well"
And click on Assign
And click ok on modal popup
Then it will show success message
Scenario: Verify Logout Functionality
Given browser is opened and app url is launched
When user enter username as "Admin"
And user enter password as "admin123"
And click on submit
Then user should see "Dashboard"
When user click on userdropdown
And click on logout option
Then user should navigate to login page successfully
Scenario: Verify about functionality
Given browser is opened and app url is launched
When user enter username as "Admin"
And user enter password as "admin123"
And click on submit
Then user should see "Dashboard"
When user click on userdropdown
And click on about option
Then About modal popup should open
Scenario: Verify Support functionality
Given browser is opened and app url is launched
When user enter username as "Admin"
And user enter password as "admin123"
And click on submit
Then user should see "Dashboard"
When user click on userdropdown
And click on support
Then user should navigate to support page successfully
Scenario: Verify Change Password Page Navigation
Given browser is opened and app url is launched
When user enter username as "Admin"
And user enter password as "admin123"
And click on submit
Then user should see "Dashboard"
When user click on userdropdown
And click on Change Password
Then user should navigate to update password page successfully
Scenario: Verify Update Password Functionality
Given browser is opened and app url is launched
When user enter username as "Admin"
And user enter password as "admin123"
And click on submit
Then user should see "Dashboard"
When user click on userdropdown
And click on Change Password
Then user should navigate to update password page successfully
When user click on Current Password
And enter text on Current Password as "admin123"
And click On Password
And enter text on Password as "Sam@123"
And click on Confirm Password
And enter text on Confirm Password as "Sam@123"
And click on Save button
Then user should see Success message