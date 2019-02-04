#Author: reuel@truelogic.com.ph, lorraine@truelogic.com.ph
#Version 1.0 01.28 2019 - Initial creation of file
Feature: [TAA-519] [SEOReseller] Manage Users Menu Smoke/Regression TestSuite

  #Scenario Description:
	#Given I am a Partner
	#When I hover to the support menu
	#And I click the Getting Started Link
	#Then see the Getting Started Blog
  @SRSSMOKETEST @ManageUsers @ManageUsers_TS01 @TAA-535
  Scenario Outline: TAA-535
		Given Im a new Partner
    When I navigate to "Login"
    And I populate the SEOE6_EmailAddress textfield with <email>
    And I populate the SEOE6_Password textfield with <password>
    And I click the SEO06_LoginToYourDashBoard button
    And I wait for page to load
    Then Ill see the SEO00_Dashboard page
    
    When I click the SEO01_UserAvatar button
		And I click the SEO01_ManageUsers list
		Then Ill be able to see the SEO22_ManageUsers Page
		
		When I click the SEO22_AddNewUser button
		Then Ill see the SEO22_AddNewUser Modal
		And Ill see the SEO22_EmailAddress textfield
		And Ill see the SEO22_Username textfield
		And Ill see the SEO22_Role dropdown
		And Ill see the SEO22_Password textfield
		And Ill see that the Password textfield contains a SEO22_Toggle icon
		And Ill see the SEO22_Save button
		And Ill see the SEO22_Close button
		And Ill see the SEO22_Xclose button of Add New User Modal
    
    Examples: 
			| FirstName | LastName   | email                     | password  |
      | RND       | Automation | lorraine@truelogic.com.ph | 123456789 |