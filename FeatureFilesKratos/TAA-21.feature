#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Givecondition step
#When: Sen: Some prome key actions
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
Feature: [TAA-21] Kratos Smoke Test Suite v0.1

  @KRATOSSMOKETEST @SeoDomainredirect @SeoDomainredirect_TS01
  Scenario Outline: SeoDomainredirect_TS01
    Given Im an Account Manager
    When I draft RequestSpecBuilder
    And I set baseURI for KratosDEVURL
    And I set basePath to <BasePath>
    And I add parameter Key as "url" and Value as <URL>
    And I build RequestSpecification
    And I execute a GET method
    Then I receive a response with StatusCode <StatusCode> over SeoDomainredirect
    And I see that response JSON is equal to <ExpectedJSON> over SeoDomainredirect

    Examples: 
      | BasePath              | URL                          | StatusCode | ExpectedJSON                |
      | /seo/domain_redirect  | https://www.truelogic.com.ph |        200 | SeoDomainredirect_TS01_TC01 |
      | /seo/domain_redirect | BadURLInput                  |        400 | SeoDomainredirect_TS01_TC02 |
