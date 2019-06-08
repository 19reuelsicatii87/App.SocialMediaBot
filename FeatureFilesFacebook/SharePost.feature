#Author: reuelsicatii@yahoo.cpm.ph
Feature: [Facebook]: SharePost Bot

  #Scenario Description:
  #Given Im a Facebook User
  #When I share a post to Friends
  #Then I'll see that I've successfully share it
  @SharePost @SharePost_TS01
  Scenario Outline: SharePost_TS01
    Given Im a Facebook User
    When I navigate to "Login"
    And I populate FB01_Username textfield with <Username>
    And I populate FB01_Password textfield with <Password>
    And I click FB01_LogIn button
    Then Ill see that Ive login successfully
    When I navigate to the application exact <PageURL>
    And I wait for 5000 millisecond
    And I click FB03_SharePost button whose position is "1"
    And I click FB03_SharePost dropdown whose text is "Share Now (Friends)"
    And I wait for 3000 millisecond
    And I click FB03_SharePost button whose position is "2"
    And I click FB03_SharePost dropdown whose text is "Share Now (Friends)"

    Examples: 
      | Username             | Password   | PageURL                                  |
      | awingsicat@gmail.com | @w1ng12345 | https://web.facebook.com/kbstarskin/     |
      | awingsicat@gmail.com | @w1ng12345 | https://web.facebook.com/mcmfashionshop/ |

  #Scenario Description:
  #Given Im a Facebook User
  #When I share a post to Group
  #Then I'll see that I've successfully share it
  @SharePost @SharePost_TS02
  Scenario Outline: SharePost_TS01
    Given Im a Facebook User
    When I navigate to "Login"
    And I populate FB01_Username textfield with <Username>
    And I populate FB01_Password textfield with <Password>
    And I click FB01_LogIn button
    Then Ill see that Ive login successfully
    When I navigate to the application exact <PageURL>
    And I wait for 5000 millisecond
    And I click FB03_SharePost button whose position is "1"
    And I click FB03_SharePost dropdown whose text is "Share in a Group"
    And I wait for 2000 millisecond
    And I populate FB03_GroupName textfield with <GroupName>
    And I wait for 2000 millisecond
    And I click FB03_GroupPost button

    Examples: 
      | Username             | Password   | PageURL                              | GroupName                                                              |
      | awingsicat@gmail.com | @w1ng12345 | https://web.facebook.com/kbstarskin/ | MAKATI  BUY AND SELL                                                   |
      | awingsicat@gmail.com | @w1ng12345 | https://web.facebook.com/kbstarskin/ | Makati City Buy and Sell                                               |
      | awingsicat@gmail.com | @w1ng12345 | https://web.facebook.com/kbstarskin/ | Buy and Sell QC • Manila • Makati • Taguig • Pasay • Paranaque • Rizal |
      | awingsicat@gmail.com | @w1ng12345 | https://web.facebook.com/kbstarskin/ | Buy and Sell @ Taguig Pasay Makati Paranaque                           |
      | awingsicat@gmail.com | @w1ng12345 | https://web.facebook.com/kbstarskin/ | Pateros Pasig Taguig Makati Gadget,Etc. Buy And Sell                   |
