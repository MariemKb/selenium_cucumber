
@tag
Feature: Ajouter un contact d'urgence
  As a Collaborator
  I want to add an emergency contacts
  In order to manage my profile


  @tag1
  Scenario:  Add a new emergency contac
    When I fill the form <add_emergency_contact> with validation
    Then The <pending> alert is displayed with message <Ajout en attente de validation>
    And These information are displayed
      | Ben Ali, Ali   |
      | ENFANT         |
      | 55176123       |
      | 01 23 45 67 89 |


