#Author: lorraine@truelogic.com.ph
#Version 1.0 06.27 2018 - Initial creation of file

Feature: [TAA-131] [SEOReseller]: SafeEmail_IMAP
  #Covered Ticket : SRS-3468
	#Scenario Description:
  #Given I am an existing Partner
  #And I have not yet setup my Email Settings Wizard
  #And I have a Yahoo/Microsoft Account
  #When I set the Email Wizard Settings
  #Then I'll see the 'Oops. We currently don't support Yahoo and Microsot emails. 'Message
  @SRSSMOKETEST @SafeEmail @SafeEmail_TS01 @TAA-159
  Scenario Outline: TAA-159
    Given Im an existing Partner
		When I navigate to "SEOSTG_Login"
		And I enter <Email> in the Email Address Field
		And I enter <Password> in the Password Field
		And I click the Log in to your Dashboard button
		Then Ill see the Dashboard Page
		
		When I click the User Avatar
		And I click the SEO01_EmailSettings
		Then Ill see the Email Settings Page
		
		When I click SEO12_Update button
		Then Ill see the Email Setup Wizard Modal
		And Ill see the "SEOReseller will send its emails using your email account. Please confirm the email address you will be using."
		And Ill see the SEO12_EmailAddress textfield
		And Ill see the SEO12_Next button
		
		When I enter <SafeEmail> in the SEO12_EmailAddress textfield
		And I click SEO12_Next button
		Then Ill see the "We currently dont support Yahoo and Microsoft emails." Message
		And Ill see the SEO12_Retry button	
		
    
    Examples: 
      | Email  								| Password    | SafeEmail          | 
      | TAA159imap@gmail.com  | happy123$   | TAA159@yahoo.com   |
      | TAA159imap@gmail.com  | happy123$   | TAA159@hotmail.com | 
      | TAA159imap@gmail.com  | happy123$   | TAA159@live.com    | 
      | TAA159imap@gmail.com  | happy123$   | TAA159@msn.com     | 
      | TAA159imap@gmail.com  | happy123$   | TAA159@outlook.com | 