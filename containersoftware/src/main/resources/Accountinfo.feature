#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Update account information

  @tag1
  Scenario: Update basic info (Name, Surname, email)
    Given a client with a valid account
    And login status is true
    When Entered new account info
    Then Displays message about updated account info

  Scenario: Track my container info
    Given a client with a valid account
    And login status is true
    And account has valid shipments
    When access container info
    Then Displays message about basic container logistic information
    
   Scenario: Client has no current shipments
    Given a client with a valid account
    And login status is true
    And account has no valid shipments
    When access container info
    Then Displays message about no valid shipments