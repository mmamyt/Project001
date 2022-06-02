Feature:Verify  user can see information about the product inside of the cart

  @TR346
  Scenario: Verify  user can see information about the product inside of the cart

    Given I am at home page
    And I have added one product to cart
    When I hoverover the cart
    Then I see information about the product inside of the cart