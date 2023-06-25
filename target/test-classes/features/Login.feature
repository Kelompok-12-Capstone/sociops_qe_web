#Feature: User be able to login
#  As user
#  I want to see home page
#  So that I can buy product
#
#
#  Scenario: While i am not a user, i cannot be able to login
#    Given I am on the landing page
#    When I input invalid email
#    And I input invalid password
#    And I click signin button
#    Then I still on landing page
#
#  Scenario: As user, I have be able to success login
#    Given I am on the landing page
#    When I input valid email
#    And I input valid password
#    And I click signin button
#    Then I am success log in