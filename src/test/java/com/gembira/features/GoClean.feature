Feature: Go ClEAN

  Scenario: As a user i want to validate a price on regular service
    Given I go to goclean subsection
    And I choose Kategori Layanan Reguler
    And I choose Peralatan GO-CLEAN
    And I choose duration 1 hour and select gender
    When I tap Lanjut Button
    Then The price should same as estimate price


  Scenario: As a user i want to validate a price on regular service
    Given I go to goclean subsection
    And I choose Kategori Layanan Spesial
    And I choose Peralatan GO-CLEAN
    And I choose duration 1 hour and select gender
    When I tap Lanjut Button
    Then The price should same as estimate price