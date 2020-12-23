#Author: thamizh


Feature: Addcustomerlogin validation

@userprofile
  Scenario: AddcustomerLogin Validation
    Given start the quote using insurance type with zip code 
    And check ration button enable or not
    When Fill the all those detail about yourself
    Then finish and click the start the quote button
    
    
		
  