@connexion
Feature: Connexion
  As a user 
  I want to connect to the Orange App

  @connexion
  Scenario: I want to connect to Orange application
    Given Login page is opened 
    When the user set the login "Admin"
    And the user set the pwd "admin123"
    And the user click on the login button
    Then the user is redirected to Dashboard "Dashboard" 


      
