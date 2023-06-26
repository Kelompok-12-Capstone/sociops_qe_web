Feature: As an user I want to see volunteer

  Scenario: I want to see volunteer page
    Given I on the login page
    When I click volunteer field
    Then I on the volunteer page

  Scenario: I want to see permintaan pengejuan on the volunteer page
    Given I on the login page
    When I click volunteer field
    Then I on the volunteer page
    And I click permintaan pengajuan program field
    And I on the permintaan pengajuan page

  Scenario: I want to see detail permintaan pengejuan on the volunteer page
    Given I on the login page
    When I click volunteer field
    And I click permintaan pengajuan program field
    And I on the permintaan pengajuan page
    And I on the volunteer page
    And I click detail field
    Then I on the detail permintaan pengajuan page


  Scenario: I want to see list program on the volunteer page
    Given I on the login page
    When I click volunteer field
    Then I on the volunteer page
    And I click list program field
    And I on the list program page

  Scenario: I want to see riwayat program on the volunteer page
    Given I on the login page
    When I click volunteer field
    Then I on the volunteer page
    And I click riwayat program field
    And I on the riwayat program page