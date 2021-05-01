Feature: As a user, I want the score to be prepared with the IAAF score table, so that the score is updated and relevant to the competition.

Background:
Given That I start the program
And I navigate to the score page

@scoreTable
Scenario Outline: The user tries to fetch an individual athlete score in the IAAF standard
Given I am on the result page
When I enter an incorrect <value>
And I press the fetch button
Then I should receive an <error_message>

Examples:
    | value      | error_message                                      |
    | ""         | "A value is required. Please try again."           |
    | "asdf"     | "A numerical value is required. Please try again." |
    | "!"#€"     | "A numerical value is required. Please try again." |
    | "-1"       | "A positive value is required. Please try again."  |
    | "-100"     | "A positive value is required. Please try again."  |