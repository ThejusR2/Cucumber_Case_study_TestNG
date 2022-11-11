Feature: To test login feature Demo99
1)valid case
2)invalid case
Background:
Given I should be in demo99 login page
Scenario Outline:
@PositiveTesting
Scenario: To test login with valid details
When Enter username "<usr>"
And Enter password "<pass>"
And Click on login button
Then I should see a message "Demo99"
Examples:
|usr|pass|
|thej1@gmail.com|123456789|
|raj|admin|
@Negativetesting
Scenario: To test login with invalid details
When Enter username "thej1@mail.com"
And Enter password "admin12"
And Click on login button
Then I should see a message "Demo99"
