Feature: Verify if the user can see the specific product inside of the cart

@TR345
Scenario: Verifying the cart functionality 2

Given I am at home page
And I have added one product to cart
Then the cart will show 1 Product
When I open the cart after adding
Then I want to see the that specific product inside of the card