Feature: User Periksa Sekarang

  Scenario: User add data from pemeriksaan form
    Given User logged in as dokter
    And User is in the dashboard page
    And User click the button periksa
    And User is in the pemeriksaan page
    When User fill the form
    Then Pemeriksaan page should be refresh