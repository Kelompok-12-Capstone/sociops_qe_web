Feature: Manage News

  Scenario: Verify admin writes news
    Given I am on the web browser page
    When I log in as an admin
    And I click on "Manage News"
    And I click on the "Write News" or "Create New News" button
    And I enter the title, news content, and news author
    And I click on the "Save" or "Publish" button
    Then the news article should be successfully created and published

  Scenario: Check the news list view that has been created
    Given I am on the web browser page
    When I log in as an admin
    And I click on "Manage News"
    And I click on the "News List" button
    Then the list of news articles should be displayed