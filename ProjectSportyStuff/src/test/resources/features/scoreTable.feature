Feature: As a user, I want the score to be prepared with the IAAF score table, so that the score is updated and relevant to the competition.

@scoreTable
Scenario Outline: The user tries to add a score of an athlete
Given I am on the add results page
When I enter a <value> value
And I press the save button
Then I should receive a <message> message

Examples:
    | value      | message                                            |
    | ""         | "A value is required. Please try again."           |
    | "asdf"     | "A numerical value is required. Please try again." |
    | "!%#€"     | "A numerical value is required. Please try again." |
    | "-1"       | "A positive value is required. Please try again."  |
    | "-100"     | "A positive value is required. Please try again."  |
    | "0"        | "Results were successfully added!"                 |
    | "100"      | "Results were successfully added!"                 |
    | "1.5"      | "Results were successfully added!"                 |
    | "15.8"     | "Results were successfully added!"                 |

@scoreTable
Scenario Outline: The user tries to edit a score of an athlete
Given I am on the edit results page
When I enter a <value> value
And I press the save button
Then I should receive a <message> message

Examples:
    | value      | message                                            |
    | ""         | "A value is required. Please try again."           |
    | "asdf"     | "A numerical value is required. Please try again." |
    | "!%#€"     | "A numerical value is required. Please try again." |
    | "-1"       | "A positive value is required. Please try again."  |
    | "-100"     | "A positive value is required. Please try again."  |
    | "0"        | "Results were successfully updated!"               |
    | "100"      | "Results were successfully updated!"               |
    | "1.5"      | "Results were successfully updated!"               |
    | "15.8"     | "Results were successfully updated!"               |
    
@scoreTable
Scenario: The user tries to fetch the score of an athlete in IAAF format
Given I am on the athletes page
When I press the fetch results button
Then I should receive the result in IAAF format

@scoreTable
Scenario: The user tries to fetch the score of an event in IAAF format
Given I am on the events page
When I press the fetch results button
Then I should receive the result in IAAF format

@scoreTable
Scenario: The user tries to fetch the score of the competition in IAAF format
Given I am on the home page
When I press the fetch results button
Then I should receive the result in IAAF format
