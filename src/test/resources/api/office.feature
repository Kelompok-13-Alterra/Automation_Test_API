Feature: office
  @office
  Scenario: GET As an admin I can see List Office
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for all office
    
    Scenario: GET As an admin I can see details office
      Given I set GET endpoints by id
      When I send GET HTTP request by id
      Then I receive valid HTTP response code 200 for get id detail office
      And I receive valid data for id office