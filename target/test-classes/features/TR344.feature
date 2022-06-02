Feature: Verifying the cart functionality 1

  @TR344
Scenario: Verifying the cart functionality 1
Given I am at home page
And I don’t have a products selected yet
When I open the cart
Then I see message : “ Your shopping cart is empty.”
And message will be highlighted with orange color