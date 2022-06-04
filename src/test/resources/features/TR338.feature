@TR338
  Feature: As a user I want to be able to buy a product

    @TR357
    Scenario: As a user I want to be navigated to SHOPPING-CART SUMMARY page upon checkout
      Given user is on home page
      And user adds one product to cart
      When user clicks checkout
      Then the user will be navigated to SHOPPING-CART SUMMARY page

    @TR358
    Scenario: As a user I want to be brought to sign in page
      Given user is on summary page
      When the user clicks on Proceed to checkout
      Then user should be brought to sign in page

    @TR359
    Scenario: As a user I want to be able to register a new account upon proceeding to checkout with selected items
      Given user is on sign in page
      When user inputs a valid email in the create an account block
      Then user will be navigated to a page that asks to enter personal information
      And user completes the page
      When user clicks on Register button
      Then user will be navigated to Address page
      And by default checkmark for: Use the delivery address as the billing address will be selected
      When user click next
      Then user will see Shipping page
      And user need to agree with terms (by default agreement checkmark should not be selected)
      And user navigates to next page
      Then user will be on payment page
      And shipment cost of 2$ will be included
      And user should see two payment options: Pay by bank wire or Pay by check
      When user selects by bank wire
      Then user will see the confirmation button
      When user clicks on confirm order
      Then the text “Your order on My Store is complete.” will be displayed

    @TR
    Scenario: (Positive Login Scenario) As a user I want to be able to login upon entering valid credentials
      Given user is on sign in page
      When user enters valid credentials in Already registered block
      Then user should be able to login without issues

    @TR
    Scenario: (Negative Login Scenario) User should not be able to login with incorrect credentials
      Given user is on sign in page
      When user enters invalid credentials in Already registered block
      Then user should NOT be able to login
      And user should see warning message