Feature: User lihat riwayat pemeriksaan

  Scenario: User see hasil pemeriksaan
    Given User logged in as dokter
    And User is in the dashboard page
    And User clicks the riwayat pemeriksaan navigation
    And User is on the riwayat pemeriksaan page
    When User clicks the lihat hasil button
    Then User is redirected to the hasil pemeriksaan page
    And User sees the hasil pemeriksaan image
