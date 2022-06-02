Feature: Verifying if user sees correct message when cart is empty

  @TR344
Scenario: Verifying the cart functionality 1
Given I am at home page
And I don’t have a products selected yet
When I open the cart
Then I see message : “ Your shopping cart is empty.”
And message will be highlighted with orange color