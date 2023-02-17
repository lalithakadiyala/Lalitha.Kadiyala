Feature:Home_Gain

  Scenario:“Search Home Values” form by entering various input values per field
    Given launch the browser
    When  open the url
    Then enter the zip code
    And click on go_button
    When select the Home_Values on the subsequent form
    And click on continue
    When Selected drop down
    Then enter street adress of the property
    And enter the type of the property
    Then enter number of bedrooms and bathrooms
    And enter timeframe to sell the home
    And enter the price range
    And enter the personal information
    Then check the money savings offer checkbox
    Then check the contact me about the offers checkbox
    And close the browser





