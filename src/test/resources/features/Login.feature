Feature: Login to Sociops Admin Account

    As an admin
    I want to login to sociops admin account
    So that I can manage sociops users

    Scenario: Login with correct credentials
        Given I am on the sociops login page
        And I type correct email
        And I type correct password
        When I click on the login button
        Then I should redirected to sociops dashboard

    Scenario: Login with incorrect password
        Given I am on the sociops login page
        And I type correct email
        And I type incorrect password
        When I click on the login button
        Then I should see incorrect alert notification

    Scenario: Login with incorrect email
        Given I am on the sociops login page
        And I type incorrect email
        And I type correct password
        When I click on the login button
        Then I should see incorrect alert notification

    Scenario: Verify email input must be valid value
        Given I am on the sociops login page
        And I type invalid email
        And I type correct password
        When I click on the login button
        Then I should see invalid warning email

    Scenario: Admin login without fill password
        Given I am on the sociops login page
        And I type correct email
        And I type nothing in password field
        When I click on the login button
        Then I should see empty warning password

    Scenario: Admin login without fill email
        Given I am on the sociops login page
        And I type nothing in email field
        And I type correct password
        When I click on the login button
        Then I should see empty warning email
        
    Scenario: Admin login with email less than 2 char
        Given I am on the sociops login page
        And I type email less than 2 char
        And I type correct password
        When I click on the login button
        Then I should see warning char email

    Scenario: Admin login with password less than 8 char
        Given I am on the sociops login page
        And I type correct email
        And I type password less than 8 char
        When I click on the login button
        Then I should see warning char password
