@Regression
@TR337

Feature: Verifying the cart functionality

  @TR344
  Scenario: Verifying if user sees correct message when cart is empty
    Given user is on home page
    And user does not have a products selected yet
    When user opens the cart
    Then user sees message : “ Your shopping cart is empty.”
    And message will be highlighted with orange color


  @TR345
  Scenario: Verify if the user can see the specific product inside of the cart

    Given user is on home page
    And user adds one product to cart
    Then the cart will show 1 Product
    When user opens the cart after adding
    Then user sees that specific product inside of the cart

  @TR346
  Scenario: Verify  user can see information about the product inside of the cart

    Given user is on home page
    And user adds one product to cart
    When user hovers over the cart
    Then user sees information about the product inside of the cart