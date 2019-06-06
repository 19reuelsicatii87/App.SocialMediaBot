#Author: reuelsicatii@yahoo.cpm.ph
Feature: [Facebook]: SharePost Bot

  #Scenario Description:
  #Given Im a Facebook User
  #When I share a post
  #Then I'll see that I've successfully share it
  @SharePost @SharePost_TS01
  Scenario Outline: COMSMOKETEST_TS01
    Given Im a Facebook User
    When I navigate to "Login"
    And I populate FB01_Username textfield with <Username>
    And I populate FB01_Password textfield with <Password>
    And I click FB01_LogIn button
    Then Ill see that Ive login successfully

    Examples: 
      | Username             | Password   |   |
      | awingsicat@gmail.com | @w1ng12345 | 1 |
