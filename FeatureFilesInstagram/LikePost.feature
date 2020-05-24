#Author: reuelsicatii@yahoo.cpm.ph
Feature: [Instagram]: LikePost Bot

  #Scenario Description:
  #Given Im a Instagram User
  #When I like a post from /Explore/Tags
  #Then I'll see that I've successfully like it
  @LikePost @LikePost_TS01
  Scenario Outline: SharePost_TS01
    Given Im a Instagram User
    When I navigate to "Login"
    And I populate IG01_Username textfield with <Username>
    And I populate IG01_Password textfield with <Password>
    And I click IG01_LogIn button
    Then Ill see that Ive login successfully
    And I wait for 10000 millisecond
    When I navigate to the application exact <PageURL>
    And I wait for 10000 millisecond
    And I click IG03_TopRecentPost button
    And I wait for 3000 millisecond
    And I click IG03_LikePost button for 100

    Examples: 
      | Username         | Password         | PageURL                                       |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/travel |
