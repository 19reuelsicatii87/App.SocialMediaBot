#Author: Prashanth Veldandi <prashanth.veldandi@gqaustralia.edu.au>
#[PV 12.13.16]
## (Comments-)
#Sample Feature Definition Template
Feature: GQ Web Freeskills Review Validation
  As QE I want to validate,User is able to sumbit the skills assessment

  @DEBUG
  Scenario Outline: COMSMOKETEST_TS07
    Given Im an Account Manager
    When I navigate to "COMDEV_Login"
    And I populate COM01_Username with "rv.villanueva@truelogic.com.ph"
    And I populate COM01_Password with "qwerty"
    And I click COM01_LogIn button
    Then Ill see that Ive login successfully
    When I navigate to "COMDEV_Client"
    And I click COM02_Campaigns tab
    And I click COM03_CreateCampaign button
    And I populate COM04_CampaignName with "www.seleniumhq.org/projects/"
    And I populate COM04_BrandName with "www.seleniumhq.org/projects/"
    And I populate COM04_CampaignURL with "http://www.seleniumhq.org/projects/"
    And I populate COM04_Description textfield with "Test Automation Description"
    And I select "IT & Tech (deleted)" over COM04_Category dropdown
    And I populate COM04_ProductandServiceOverview textfield with "Test Automation ProductandServiceOverview"
    And I click COM04_Submit button
    Then Ill see campaign successfully created
   

     Examples: 
      | Category            | Product                        |
      | Website Development | Basic Web Design               |
