Feature: User Periksa Sekarang

#  positif
  Scenario: User add data from pemeriksaan form
    Given User logged in as dokter
    And User is in the dashboard page
    And User click the button periksa
    And User is in the pemeriksaan page
    When User fill the form
    Then Pemeriksaan page should be refresh

  Scenario: User click cancel in pemeriksaan form
    Given User logged in as dokter
    And User is in the dashboard page
    And User click the button periksa
    And User is in the pemeriksaan page
    When User click cancel
    Then Redirect to dahsboard page

#    negatif
  Scenario: User add data except nama
    Given User logged in as dokter
    And User is in the dashboard page
    And User click the button periksa
    And User is in the pemeriksaan page
    When User fill form except name
    Then Field shows error message



