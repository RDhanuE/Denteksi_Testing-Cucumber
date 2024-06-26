Feature: Data Admin

  Scenario: Add Admin Data with empty data
    Given I am on the "Tambah Admin" page
    When I leave all fields empty
    Then I should see an error message "Email wajib diisi" and "Password wajib diisi"

  Scenario: Add Admin Data with correct data
    Given I am on the "Tambah Admin" page
    When I enter valid admin details
    Then I should be redirected to the "Daftar Data Admin" page

  Scenario: Edit Admin Data with empty data
    Given I am on the "Edit Admin" page
    When I leave all fields empty
    Then I should see an error message "Field tidak boleh kosong"

  Scenario: Edit Admin Data with correct data
    Given I am on the "Edit Admin" page
    When I leave all fields empty
    Then I should be redirected to the "Daftar Data Admin" page

