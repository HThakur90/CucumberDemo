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
Feature: Login

  @tag1
  Scenario: :Login Functionality exists
    Given I have open the browser
    When I Open Gmail Homepage
    Then Login Should Exist
    
Feature: Login with Credentials
Scenario: User Log in
Given I have open the browser
And I Open Gmail Homepage
When User log in as username as "uname" and Password as "pswd"
Then Home Page should be displayed


  