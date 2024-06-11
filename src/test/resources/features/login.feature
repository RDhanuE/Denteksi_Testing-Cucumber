Feature: User Login

  Scenario: Successful login with admin credentials
    Given User is in the login page
    When User submit admin credentials
    Then User should be redirected to admin dashboard

  Scenario: Successful login with dokter credentials
    Given  User is in the login page
    When User submit dokter credentials
    Then User should be redirected to dokter dashboard
