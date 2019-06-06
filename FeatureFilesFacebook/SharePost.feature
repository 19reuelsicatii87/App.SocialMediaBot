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
    When I populate FB02_Search textfield with <PageName>
    And I click FB02_Search button
    And I click FB02_Secondary header whose text is <SecondaryHeader>
    And I click FB02_Page Result whose text is <PageName>
    And I click FB03_SharePost button whose position is "1"
    And I click FB03_SharePost dropdown whose text is <SharePostdropdown>

    Examples: 
      | Username             | Password   | PageName                     | SecondaryHeader | SharePostdropdown   |
      | awingsicat@gmail.com | @w1ng12345 | KB White Gluta Plus - Makati | Pages           | Share Now (Friends) |
