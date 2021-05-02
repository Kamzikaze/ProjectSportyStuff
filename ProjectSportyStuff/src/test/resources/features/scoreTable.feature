Feature: As a user, I want the score to be prepared with the IAAF score table, so that the score is updated and relevant to the competition.

@scoreTable
Scenario Outline: The user tries to add/edit a score of an athlete
Given That I am logged in with <unique_id> as unique ID
When I enter a <value> value
And I am on the results page
And I press the save button
Then I should receive a <message> message

Examples:
    | unique_id | value      | message                                            |
    | 1         | ""         | "A value is required. Please try again."           |
    | 1         | "asdf"     | "A numerical value is required. Please try again." |
    | 1         | "!%#€"     | "A numerical value is required. Please try again." |
    | 1         | "-1"       | "A positive value is required. Please try again."  |
    | 1         | "-100"     | "A positive value is required. Please try again."  |
    | 1         | "0"        | "Results were successfully added!"                 |
    | 1         | "100"      | "Results were successfully added!"                 |
    | 1         | "1.5"      | "Results were successfully added!"                 |
    | 1         | "15.8"     | "Results were successfully added!"                 |
    
@scoreTable
Scenario Outline: The user tries to fetch the score in IAAF format
Given That I am logged in with <unique_id> as unique ID
When I am on the results page
Then I should receive the result in IAAF format

Examples:
    | unique_id | 
    | 1         |
    | 2         |
    | 3         |
    