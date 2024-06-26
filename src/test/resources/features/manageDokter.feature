Feature: Managing Dokter Account
  This feature can only be done by an Admin

  Background:
    Given User is in the login page
    And User submit admin credentials
    And User open dokter page

  Scenario: Add new Dokter Account
    When User open tambah data form
    And Fill out the form for adding Dokter account
    Then Dokter account should be added to dokter list

  Scenario: Edit existing Dokter Account
    When User press the edit button of one of the dokter account
    And Change the data for that Dokter
    Then The dokter account should be changed

  Scenario: Delete existing Dokter Account
    When User press the delete button of one of the dokter account
    And Confirm the deletion
    Then The dokter account should be removed