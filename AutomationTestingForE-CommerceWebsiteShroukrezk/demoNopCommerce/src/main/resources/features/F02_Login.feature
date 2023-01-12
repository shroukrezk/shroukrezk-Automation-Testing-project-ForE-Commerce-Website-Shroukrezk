@smoke
Feature: users could login with registered valid email and password

  Scenario: User could log in with registered credentials

    Given user navigate to home page
    And user click on log in
    And user fill his or her email "shroukrezk@gmail.com"
    And user fill his or her password "P@ssw0rd"
    And user click on log in button
    Then user should login successfully and see log out appears at the top right
    Then user click on log out button

    Scenario: user could login with invalid email and password
      Given user navigate to home page
      And user click on log in
      And user fill his or her email "wrongemail@gmail.com"
      And user fill his or her password "P@ssw0rd"
      And user click on log in button
      Then user could not login to the system
