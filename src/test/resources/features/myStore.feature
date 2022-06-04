@searchTest
Feature: Verify MyStore Webapp Search Functionality

  @searchTest1
  Scenario Outline: As a user I want to use search to find existing products
    Given user is on home page
    When user search for any "<existing product>"
    Then user to see the result

    Examples:
      | existing product |
      | top              |
      | blouse           |
      | t-shirt          |
      | t shirt          |
      | shirt            |
      | dress            |

  #note: user should be able to use search button and well Enter key from keyboard

  @searchTest2
  Scenario Outline: As a user I want to see error message when I use search to find non-existing products
    Given user is on home page
    When user search for "<non-existing product>"
    Then user should see the message : “No results were found for your search"
    And message highlighted with orange color

    Examples:
      | non-existing product |
      | swimsuit             |
      | pants                |
      | jacket               |
      | coat                 |
    #  | shoes                |
      | umbrella             |

  @searchTest3
  Scenario Outline: As a user I want to see dropdown list of products when I search
    Given user is on home page
    When user puts in search line "<new product>" and waits a few seconds
   # And before user click enter
    Then user see the filtered results under the search bar

    Examples:
      | new product |
      | top              |
      | blouse           |
      | t-shirt          |
      | t shirt          |
      | shirt            |
      | dress            |