#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: [TAA-15] Luemn Smoke Test Suite v0.1

  @LUMENSMOKETEST @LoginAuthenticate_TS01
  Scenario Outline: LoginAuthenticate_TS01
    Given Im an Account Manager
    When I set baseURI to <BaseURI>
    And I set basePath to  <BasePath>
    And I add parameter Key as "email" and Value as <Email>
    And I add parameter Key as "password" and Value as <Password>
    And I add parameter Key as "site_id" and Value as <SiteID>
    And I build RequestSpecification
    And I execute a POST method
    Then I receive a response with StatusCode <StatusCode> over LoginAuthenticate

    Examples: 
      | BaseURI                 | BasePath            | Email                  | Password | SiteID | StatusCode |
      | http://192.168.10.5/api | /login/authenticate | bordy@truelogic.com.ph | Abcd1234 |      8 |        200 |

  @LUMENSMOKETEST @SignUp_TS01
  Scenario Outline: LoginAuthenticate_TS01
    Given Im an Account Manager
    When I set baseURI to <BaseURI>
    And I set basePath to  <BasePath>
    And I add parameter Key as "password" and Value as <Password>
    And I add parameter Key as "confirmPassword" and Value as <ConfirmPassword>
    And I add parameter Key as "site_id" and Value as <SiteID>
    And I add parameter Key as "email" and Value from randomgenerator over SignUp
    And I build RequestSpecification
    And I execute a POST method
    Then I receive a response with StatusCode <StatusCode> over SignUp
    And I see that response JSON is equal to <ExpectedJSON> over SignUp

    Examples: 
      | BaseURI                 | BasePath | Email                            | Password  | ConfirmPassword | SiteID | StatusCode | ExpectedJSON     |
      | http://192.168.10.5/api | /signup  | randomgenerator@truelogic.com.ph | Abcd1234  | Abcd1234        |      1 |        200 | SignUp_TS01_TC01 |
      #| http://192.168.10.5/api | /signup% | randomgenerator@truelogic.com.ph | Abcd1234 | Abcd1234        |      1 |        400 | SignUp_TS01_TC02 |
      | http://192.168.10.5/api | /signup  | randomgenerator@truelogic.com.ph | Abcd12346 | Abcd12345       |      1 |        422 | SignUp_TS01_TC03 |
      | http://192.168.10.5/api | /signup  | randomgenerator@truelogic.com.ph | Abcd123   | Abcd12345       |      1 |        422 | SignUp_TS01_TC04 |
      | http://192.168.10.5/api | /signup  | randomgenerator@truelogic.com.ph | Abcd1234  | Abcd1234        |        |        422 | SignUp_TS01_TC05 |
