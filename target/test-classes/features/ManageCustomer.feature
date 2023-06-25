Feature: User be able manage customer
  As admin
  I want to manage customer data

  Scenario: As user, I have be able to success login
    Given I am on the landing page
    When I input valid email
    And I input valid password
    And I click signin button
    Then I am success log in
    When I click customer Icon
    And I click community request
    Then I can see community request list

#  Scenario: I want to see community request list
#    Given I am on the dashboard
#    When I click customer Icon
#    And I click community request
#    Then I can see community request list
#    And I click back button

  Scenario: I want to see user account list
    Given I am on the dashboard customer
    When I click User account list
    Then I can see user account list
    And I click back button

  Scenario: I want to see user fundraising list
    Given I am on the dashboard customer
    When I click user fundraising list
    Then I can see user fundraising list
    And I click back button

  Scenario: I want to see user volunteer list
    Given I am on the dashboard customer
    When I click user volunteer list
    Then I can see volunteer list
    And I click back button

