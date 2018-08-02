#Author: lorraine@truelogic.com.ph
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
Feature: [TAA-39] [SEOReseller] Login/Logout

  #Scenario Description:
  #Covered Ticket : SRS-4968
  #Given I'm a  Partner
  #When I Manual log in Successfully
  #And Click Log Out
  #Then I'll see the Log in Page
  @SRSSMOKETEST @LoginLogout @LoginLogout_TS01 @TAA-40
  Scenario Outline: TAA-40
		Given Im an existing Partner
		When I navigate to "Login"
		Then Ill see the Email Address Field
		And Ill see the Password Field
		And Ill see the Log In to you Dashboard button
		And Ill see the Sign in with Google button
		And Ill see the Terms of Use and Privacy Policy Verbiage
		
		When I enter <Email> in the Email Address Field
		And I enter <Password> in the Password Field
		And I click the Log in to your Dashboard button
		Then Ill see the Dashboard Page
		
		When I click the User Avatar
		And I click the Logout
		Then Ill see the Log In Page
		
    Examples: 
      | Email                         | Password       |
      | rndautomationtest5@gmail.com  | happy123$      |
      
  #Scenario Description:
  #Covered Ticket : SRS-4968
  #Given I'm a  Partner
  #When I Manual log in unsuccessfully
  #Then I'll not be redirected to the Dashboard
  @SRSSMOKETEST @LoginLogout @LoginLogout_TS02 @TAA-41 
  Scenario Outline: TAA-41
		Given Im an existing Partner
		When I navigate to "Login"
		Then Ill see the Email Address Field
		And Ill see the Password Field
		And Ill see the Log In to you Dashboard button
		And Ill see the Sign in with Google button
		And Ill see the Terms of Use and Privacy Policy Verbiage
				
		When I enter <Email> in the Email Address Field
		And I enter <Password> in the Password Field
		And I click the Log in to your Dashboard button
		Then Ill see the Error <Message>
		And Ill not be redirected to the Dashboard
		
    Examples: 
      | Email                        | Password     |  Message   | 
      | rndautomationtest6@gmail.com |              | Incorrect  |
      |                              |  happy123$   | Blank      | 
      |                              |              | Blank      | 
      
  #Scenario Description:
  #Covered Ticket : SRS-4968
  #Given I'm a  Partner
  #When I Google log in Successfully
  #And Click Log Out
  #Then I'll see the Log in Page
  @SRSSMOKETEST @LoginLogout @LoginLogout_TS03 @TAA-42 
    Scenario Outline: TAA-42
		Given Im an existing Partner
		When I navigate to "Login"
		Then Ill see the Email Address Field
		And Ill see the Password Field
		And Ill see the Log In to you Dashboard button
		And Ill see the Sign in with Google button
		And Ill see the Terms of Use and Privacy Policy Verbiage
		
		When I click the Sign in with Google button
    Then Ill see the Google Pop up
		
		When I populate google email field with <Email> 
		And I click google next button
		And I populate google password field with <Password> 
		And I click google next button
		Then Google sign in window will close
		And Ill see the Dashboard Page
		
		When I click the User Avatar
		And I click the Logout
		Then Ill see the Log In Page
		
	  Examples:
      | Email                        | Password     |
      | RNDAutomationTest7@gmail.com | happy123$    |
		