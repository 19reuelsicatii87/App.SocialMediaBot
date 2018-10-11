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
Feature: [TAA-302] [SEOReseller]: Lead Generator Smoke/Regression TestSuite

  #Scenario Description:
  #Given I'm a User
	#When I enter a website
	#And I click "Run New Audit(Beta)" Button
	#Then my report will generated using the web audit tool 
	#And I can view the report
  @SRSSMOKETEST @LeadGen @LeadGen_TS01 @TAA-302
  Scenario Outline: TAA-302
    Given Im an existing Partner
		When I navigate to "Login"
		And I populate the SEOE6_EmailAddress textfield with <email>
		And I populate the SEOE6_Password textfield with <password>
		And I click the SEO06_LoginToYourDashBoard button
		Then I see the SEO01_Home Page
		
		When I click the SEO01_LeadGenQuickAccess icon
		And I populate SEO15_Location textfield with US location coming from the test data file
		And I populate SEO15_Keyword textfield with <keyword>
		And I click the the SEO15_GenerateLeads button
		And I click the SE014_ViewLeads button of <keyword> in location from the test data file
		Then Ill see the SE014_LeadGen table
		And Ill see that SEO15_TotalLeadsFound is equal to the row count returned
		And Ill see that the Company Name is available per row

    Examples: 
      | email                | password  |           keyword       |
      | tlosrnd321@gmail.com | happy123  |      veterinary clinic  |
