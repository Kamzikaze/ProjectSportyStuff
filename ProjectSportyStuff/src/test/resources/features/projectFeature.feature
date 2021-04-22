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
Feature: Title of your feature
  I want to use this template for my feature file

Background: Choosing sport type
Given the user enters the program

Scenario: Choosing one of the options
Given the two alternatives is displayed(Decathlon or heptathlon)
When User chooses one of the programs
Then the program displays the different sports depending on the option

Scenario: The user inputs values
Given User has a value to enter
When User inputs values
Then The values is saved


