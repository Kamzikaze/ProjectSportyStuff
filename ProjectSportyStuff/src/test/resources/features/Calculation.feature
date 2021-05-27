Feature: Calculation
@test
Scenario Outline: Calculation Decathlon
Given I have chosen <event>
When I enter the <result> for decathlon
Then I get the <score> for <result> and <event>

Examples:
| event |  result | score |
| "100m" | 15 | 185 |
| "long jump" | 500 | 382 |
| "shot put" | 20 | 1100 |
| "high jump" | 200 | 803 |
| "400m" | 50 | 815 |
| "110m hurdles" | 9 | 1722 |
| "discus throw" | 71 | 1317 |
| "pole vault" | 490 | 880 |
| "javelin throw" | 90 | 1198 |
| "1500m" | 358 | 968 |
| "pole vault" | 490 | 880 |
| "javelin throw" | 90 | 1198 |
| "1500m" | 358 | 968 |

@test
Scenario Outline: Calculation Heptathlon
Given I have chosen <event>
When I enter the <result> for heptathlon
Then I get the <score> for <result> and <event>

Examples:
| event |  result | score |
| "200m" | 23.30 | 1049 | 
| "800m" | 2.06 | 3659 | 
| "100m hurdles" |  13.20 | 1094 | 
| "high jump" | 200 | 1237 |
| "long jump" | 710 | 1206 |
| "shot put" | 1730 | 1016 |
| "javelin throw" | 65 | 1152 |
