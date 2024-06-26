Feature: User Periksa Sekarang

  Background:
    Given User logged in as dokter
    And User is in the dashboard page
    And User click the button periksa
    And User is in the pemeriksaan page

#  positif
  Scenario: User add data from pemeriksaan form
    When User fill the form
    Then Pemeriksaan page should be refresh

  Scenario: User add data from pemeriksaan except photos
    When User fill the form except photos
    Then Form Pemeriksaan should be added

  Scenario: User add data except whatsapp and orangtua
    When User fill the form except whatsapp and orangtua
    Then Pemeriksaan page should be refresh


#    negatif
  Scenario: User add data except nama
    When User fill form except name
    Then Field shows error message



