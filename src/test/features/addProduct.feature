Feature: Add Product

  As a user
  I should add the product

  Scenario: Validate add product to bag

    Given I'm on Home Page "http://www.next.co.uk"
    When I search for a product "T-Shirt"
    When I choose the product "White Slim Fit Crew Neck T-Shirt"
    When I select the size "S"
    When I click Add to Bag button
    Then I should see the appropriate product in the bag "White Slim Fit Crew Neck T-Shirt"