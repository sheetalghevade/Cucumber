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
  I want to use this template for my Login feature file

  @test
  Scenario: Validate login with correct credentials.
    Given User lands on Login page
    When user enters valid username
    And enters valid password
    And click on login button
    Then user should see homepage
    
|AccountStatus | Price|
|Active| 15|
|Free| 0|
|Expired| 23|
    

  @smoke
  Scenario Outline: Validate login with incorrect credentials.
    Given User lands on Login page
    When I check for the  <username> 
    And for the  <password>
    And click on login button
    Then I verify the <error> 

    Examples: 
      | username  | password | error  |
      | sheetal@tek.com |  test1234 | Please check your username and password. If you still can't log in, contact your Salesforce administrator. |
      | sheetalg@tek.com |  test123 | Please check your username and password. If you still can't log in, contact your Salesforce administrator.    |
      | sheetal@tek.com |  test123 | Please check your username and password. If you still can't log in, contact your Salesforce administrator. |
