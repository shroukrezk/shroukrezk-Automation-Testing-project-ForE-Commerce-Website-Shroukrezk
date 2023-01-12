@smoke
  Feature: usingCurrencies
    Scenario: Logged User could switch between currencies
      Given user navigate to home page
      Given user navigate to home page
      And user click on log in
      And user fill his or her email "shroukrezk"
      And user fill his or her password "P@ssw0rd"
      And user click on log in button
      Then user has to be logged In successfully and see log out appears at the top right
      Given user change current currency to EURO
      Then user should found all products prices in EURO
      Given user change current currency to US Dollar
      Then user should found all products prices in US Dollar

