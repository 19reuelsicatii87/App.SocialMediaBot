#Author: reuelsicatii@yahoo.cpm.ph
Feature: [Facebook]: CopyCreatePost Bot

  #Scenario Description:
  #Given Im a Facebook User
  #When I copy a post from a Facebook page
  #And I create a post from copied post
  #Then I'll see that I've created a post successfully
  @CopyCreatePost @CopyCreatePost_TS01
  Scenario Outline: CopyCreatePost_TS01
    Given Im a Facebook User
    When I navigate to "Login"
    And I populate FB01_Username textfield with <Username>
    And I populate FB01_Password textfield with <Password>
    And I click FB01_LogIn button
    Then Ill see that Ive login successfully
    When I navigate to the application exact <FromPageURL>
  

    Examples: 
      | Username             | Password   | FromPageURL                                  |
      | jenelle1210@yahoo.com | babyjanelle | https://web.facebook.com/pg/KB-White-Glutathione-Plus-302442080471105/posts/     |


  
