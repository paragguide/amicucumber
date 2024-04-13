Feature: Amazon Project Document
  scenarios for ecommerce web site
  
  @amazon @uid
  Scenario: userid test
    Given I open browser "chrome" with url "https://www.amazon.in/"
    And i click signin button
    When I enter userid "paragguide@yahoo.co.in"
    And click continue button
    Then I validate the userid
  
  @amazon @pwd  
  Scenario: password test
    Given userid is valid
    When i enter password "RMinfotech"
    And click submit button 
    Then i should login 
   
   @amazon @search 
   Scenario Outline: Search for product 
    Given i connect "chrome" and enter url "https://www.amazon.in/"
    When i search for product <product> with range <price>
    Then results must come
    
    Examples:
    |product|price|
    |shirt| 2000|
    |pant| 5000 |
    |tie | 1000 |
    

  