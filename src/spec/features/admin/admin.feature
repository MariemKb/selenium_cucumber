
@admin
Feature: navigation in admin module
  as a user
  I want to be able to ckeck fonctionnality

  Background: 
  Scenario: I want to connect to Orange application
    Given Login page is opened 
    When the user set the login "Admin"
    And the user set the pwd "admin123"
    And the user click on the login button
    Then the user is redirected to Dashboard "Dashboard" 

    And the user is redirected to Dashboard "Dashboard"
    And the user click on admin module

  @admin_account_creation
  Scenario: I want to create an Admin
    When the user select a user Role "<userRole>"
    And the user select a status "<status>"
    And the user enter an employee name "<employeeNameInput>"
    And the user enter a username "<userNameInput>"
    And the user enter a password "<pwdInput>"
    And the user confirm a password "pwdInput>"
    Then an admin account is created 


 
