Feature: GO AUTO

  Scenario: As a user i want to validate a price on cuci mobil
    Given I go to goauto subsection
    And I choose Cuci Mobil
    And I choose Cuci Eksterior
    When I tap Lanjut Button
    Then The price cuci mobil should same as estimate price

  Scenario: As a user i want to validate a price on cuci motor
    Given I go to goauto subsection
    And I choose Cuci Motor
    When I tap Lanjut Button
    Then The price cuci motor should same as estimate price
