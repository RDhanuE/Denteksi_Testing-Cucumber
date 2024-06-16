Feature: User Feature in dashBoard admin page

  Scenario: Succesful logout from admin user
    Given User is logged in as admin
    And User is in the admin dashboard page
    When User press the logout button
    Then User will be redirected to login page

