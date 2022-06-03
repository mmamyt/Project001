@TR337

Feature: Verifying the cart functionality

  @TR344
  Scenario: Verifying if user sees correct message when cart is empty
    Given I am at home page
    And I don’t have a products selected yet
    When I open the cart
    Then I see message : “ Your shopping cart is empty.”
    And message will be highlighted with orange color

  @TR345
  Scenario: Verify if the user can see the specific product inside of the cart

    Given I am at home page
    And I have added one product to cart
    Then the cart will show 1 Product
    When I open the cart after adding
    Then I want to see the that specific product inside of the card

  @TR346
  Scenario: Verify  user can see information about the product inside of the cart

    Given I am at home page
    And I have added one product to cart
    When I hoverover the cart
    Then I see information about the product inside of the cart