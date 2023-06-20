Feature: Fundaraising

  Scenario: Request for program submission
    Given I am on the web browser page
    When I log in as an admin
    And I navigated to the "Manage Fundraising" or "Request Program Submission" page
    And I check the display list of submitted programs
    And I click on "Submit Program"
    And I check the list of approved program submissions
    Then the program submission should be successfully submitted

  Scenario: List of Programs
    Given I am on the web browser page
    When I log in as an admin
    And I navigate to the "Manage Fundraising" or "Program List" page
    And I click on the "Program List"
    Then the program list should be displayed

  Scenario: Transactions of users participating in this program
    Given I am on the web browser page
    When I log in as an admin
    And I navigate to the "Manage Fundraising" or "Transaction History" page
    And I select the program for which I want to see the transaction history
    And I view the transaction history of the program
    Then the transaction history for the selected program should be displayed

  Scenario: Program History after admin approves or rejects the program
    Given I am on the web browser page
    When I log in as an admin
    And I go to the "Manage Fundraising" or "Program History" page
    And I select the option to view approved or rejected programs
    Then the list of approved or rejected programs should be displayed
