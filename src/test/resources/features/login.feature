Feature: User Login
  Background:
    Given User is in the login page

  Scenario: Successful login with admin credentials
    When User submit admin credentials
    Then User should be redirected to admin dashboard

  Scenario: Successful login with dokter credentials
    When User submit dokter credentials
    Then User should be redirected to dokter dashboard

  Scenario: Login with empty credentials
    When User submits empty credentials
    Then User should see an error message "Email tidak boleh kosong" and "Password tidak boleh kosong"

  Scenario: Login with wrong credentials
    When User submits wrong credentials
    Then User should see an error message "Email atau kata sandi salah!"



