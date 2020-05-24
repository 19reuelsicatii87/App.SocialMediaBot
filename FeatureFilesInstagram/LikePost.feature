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
    And I click IG03_LikePost button for 10

    Examples: 
      | Username         | Password         | PageURL                                                           |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/skincare                   |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/skincareproducts           |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/philippines                |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/travel                     |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/itsmorefuninthephilippines |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/wanderlust                 |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/photography                |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/travelgram                 |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/nature                     |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/travelphotography          |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/instagood                  |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/beach                      |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/picoftheday                |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/instagram                  |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/travelblogger              |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/makati                     |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/makaticity                 |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/makatibased                |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/makatibars                 |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/pasay                      |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/mandaluyong                |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/pasig                      |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/sanjuan                    |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/eastwood                   |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/quezoncity                 |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/makatieats                 |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/photooftheday              |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/cebu                       |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/love                       |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/travelph                   |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/adventure                  |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/instatravel                |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/manila                     |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/bohol                      |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/summer                     |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/vsco                       |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/vacation                   |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/island                     |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/palawan                    |
      | bihakupearlwhite | michaeljemah2017 | https://www.instagram.com/explore/tags/igers                      |
