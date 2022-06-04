@TR338

  Feature:
    @TR
      Scenario: As a user I want to be navigated to SHOPPING-CART SUMMARY page upon checkout
      Given the user is on home page
      And user has a product selected inside of the cart
      When the user clicks checkout
      Then the user will be navigated to SHOPPING-CART SUMMARY page

    @TR
    Scenario:
      Given the user is on summary page
      When the user clicks on Proceed to checkout
      Then user should be brought to a new page with two options:
      --> Create an account
      --> Already registered?
      When the user inputs a valid email
      Then user will be navigated to Sign in page
      And the user completes the page
      When the user clicks on Register button
      Then user will be navigated to Address page
      And by default checkmark for : Use the delivery address as the billing address. will be selected
      When user click next
      Then user will see Shipping page
      And user need to agree with terms (by default agreement checkmark should not be selected)
      And user navigate next page
      Then user will be on payment page
      And shipping cost of 2$ will be included
      And user should see two payment options:
      --> Pay by bank wire
      --> Pay by check
      When user select by bank wire
      Then user will see the confirmation button
      When user clicks on confirm order
      Then the text “ Your order on My Store is complete.” will be displayed