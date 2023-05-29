Feature: authentication

@authentication
    Scenario: Successful login
      Given I have valid credentials
      When I submit a POST request to "/auth/login" with email "riskash123@gmail.com" and password "Riskaya123"
      Then I receive valid HTTP response code Login 200
