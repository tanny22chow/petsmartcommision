Feature: Search for content

  Scenario: Commision1
    Given I am on commision landing page
    Then navigate to Titles page
    And click on filter icon
    And filter with
      |Job Code (GA1)|equals|2048|
    And verify groom pay value


  Scenario: Commision2
    Given I am on commision landing page
    Then navigate to transaction page
    And click on filter icon
    And filter with
      |Event Type|equals|Hours|
    And select row with
    |Salon_03|
    And verify hourly avg value

  @smoke
  Scenario: Commision3
    Given I am on commision landing page
