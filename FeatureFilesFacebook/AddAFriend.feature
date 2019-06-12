#Author: reuelsicatii@yahoo.cpm.ph
Feature: [Facebook]: AddAFriend Bot

  #Scenario Description:
  #Given Im a Facebook User
  #When I navigate to a Group
  #And I add a Friend
  #Then I'll see that Ive successfully add a Friend
  @AddAFriend @AddAFriendFromGroup_TS01
  Scenario Outline: AddAFriendFromGroup_TS01
    Given Im a Facebook User
    When I navigate to "Login"
    And I populate FB01_Username textfield with <Username>
    And I populate FB01_Password textfield with <Password>
    And I click FB01_LogIn button
    Then Ill see that Ive login successfully
    When I navigate to the application exact <GroupPageMembers>
    And I add the first "30" profiles

    Examples: 
      | Username                     | Password     | GroupPageMembers                                          |
      | RizIngco@protonmail.com      | @dmin74Ingco | https://web.facebook.com/groups/1602258126692097/members/ |
      | RizzieIngco@protonmail.com   | @dmin81Ingco | https://web.facebook.com/groups/1602258126692097/members/ |
      | RizziemeIngco@protonmail.com | @dmin79Ingco | https://web.facebook.com/groups/1602258126692097/members/ |
      | RizIngco@protonmail.com      | @dmin74Ingco | https://web.facebook.com/groups/589347057906708/members/  |
      | RizzieIngco@protonmail.com   | @dmin81Ingco | https://web.facebook.com/groups/589347057906708/members/  |
      | RizziemeIngco@protonmail.com | @dmin79Ingco | https://web.facebook.com/groups/589347057906708/members/  |
      | RizIngco@protonmail.com      | @dmin74Ingco | https://web.facebook.com/groups/122100765022512/members/  |
      | RizzieIngco@protonmail.com   | @dmin81Ingco | https://web.facebook.com/groups/122100765022512/members/  |
      | RizziemeIngco@protonmail.com | @dmin79Ingco | https://web.facebook.com/groups/122100765022512/members/  |
      | RizIngco@protonmail.com      | @dmin74Ingco | https://web.facebook.com/groups/330315220465556/members/  |
      | RizzieIngco@protonmail.com   | @dmin81Ingco | https://web.facebook.com/groups/330315220465556/members/  |
      | RizziemeIngco@protonmail.com | @dmin79Ingco | https://web.facebook.com/groups/330315220465556/members/  |
      | RizIngco@protonmail.com      | @dmin74Ingco | https://web.facebook.com/groups/940257732776880/members/  |
      | RizzieIngco@protonmail.com   | @dmin81Ingco | https://web.facebook.com/groups/940257732776880/members/  |
      | RizziemeIngco@protonmail.com | @dmin79Ingco | https://web.facebook.com/groups/940257732776880/members/  |
      | RizIngco@protonmail.com      | @dmin74Ingco | https://web.facebook.com/groups/546622122144317/members/  |
      | RizzieIngco@protonmail.com   | @dmin81Ingco | https://web.facebook.com/groups/546622122144317/members/  |
      | RizziemeIngco@protonmail.com | @dmin79Ingco | https://web.facebook.com/groups/546622122144317/members/  |
