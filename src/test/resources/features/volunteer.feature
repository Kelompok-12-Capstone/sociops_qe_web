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

  Scenario: I want to see detail permintaan pengejuan
    Given I on the login page
    When I click volunteer field
    And I click permintaan pengajuan program field
    And I on the permintaan pengajuan page
    And I on the volunteer page
    And I click detail field
    Then I on the detail permintaan pengajuan page

  Scenario: I want to see video permintaan pengejuan
    Given I on the login page
    When I click volunteer field
    And I click permintaan pengajuan program field
    And I on the permintaan pengajuan page
    And I on the volunteer page
    And I click detail field
    Then I on the detail permintaan pengajuan page
    And I click video promosi field to see video

  Scenario: I want to accept permintaan pengejuan
    Given I on the login page
    When I click volunteer field
    And I click permintaan pengajuan program field
    And I on the permintaan pengajuan page
    And I on the volunteer page
    And I click detail field
    Then I on the detail permintaan pengajuan page
    And I click diterima field to accept program

  Scenario: I want to reject permintaan pengejuan
    Given I on the login page
    When I click volunteer field
    And I click permintaan pengajuan program field
    And I on the permintaan pengajuan page
    And I on the volunteer page
    And I click detail field
    Then I on the detail permintaan pengajuan page
    And I click ditolak field to reject program



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