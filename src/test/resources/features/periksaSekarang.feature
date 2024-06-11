Feature: User Periksa Sekarang

  Scenario: Redirect to pemeriksaan form
    Given User is in the dashboard page
    When User click the button periksa
    Then User should be redirected to form pemeriksaan