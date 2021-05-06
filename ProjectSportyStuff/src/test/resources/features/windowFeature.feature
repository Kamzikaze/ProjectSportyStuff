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

@windowtest
Feature: Testing window functions

 	Background: Window is initialized
	Given I run the program

	Scenario: pressing login
	Given I press login
	Then A new window opens

	Scenario: pressing sign up
	Given I press sign up
	Then A new window opens
	
	
	Scenario: Athlete logs in
Given the athlete is on the ‘’User type’’-page
When the athlete clicks login
And the program is showing the login display
* the athlete is asked to fill in their unique ID
*the athlete clicks on ‘’Login’’
Then depending on which event the athlete is competing in, the athlete can fill in their results
	
	Scenario: Cancel login
Given the athlete is on the ‘’User type’’- page
When the athlete clicks ‘’Login’’
And the athlete wants to undo the login, the athlete clicks ‘’Cancel’’
Then the athlete gets redirected to the ‘’User type’’-page 
	
	Scenario: Register athlete
Given the athlete is on the User type page
When the athlete clicks ‘’Sign up’’
And clicks on the radiobutton depending on which event the registration is for
* the athlete fills in their firstname in the first textbox
*the athlete fills in their lastname in the second textbox
*the athlete clicks on next
Then the athlete has been successfully registered
When the athlete clicks on ‘’register result’’
Then depending on which event the athlete is competing in, the athlete can fill in their results
	
Scenario: More than 40 competitors 
Given the athlete is on the ‘’User type’’- page
When the athlete clicks ‘’Sign up’’
And clicks on the radiobutton depending on which event the registration is for
* the athlete fills in their firstname in the first textbox
*the athlete fills in their lastname in the second textbox
*the athlete clicks on next
Then the program should display an E-message

Scenario: Cancel registration
Given the athlete is on the ‘’User type’’- page
When the athlete clicks ‘’Signup’’
And the athlete wants to undo the signup, the athlete clicks ‘’Cancel’’
Then the athlete gets redirected to the ‘’User type’’-page 

	