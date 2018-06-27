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
Feature: [TAA-38] SRS Registration Smoke Test Suite v0.1

  #Scenario Description:
  #Covered Ticket : SRS-2544, SRS-2690, SRS-3160, SRS-2545, SRS-2546, SRS-4157
  #Given I'm a new Partner
  #When I Manual Sign-Up successfully
  #Then I'll be directed to Welcome Page
  #When I verify the email
  #And Finish the Company Profile Set up
  #Then I'll see the Home Page of the Dashboard
  @TAA-88 @SRSSMOKETEST @Registration @Registration_TS01
  Scenario Outline: TAA-40
		Given SEO07_Im a new Partner
		When I navigate to "SEOSTG_Login"
		Then Ill see the SEO06_SeoReseller Banner
		
		When I click the SEO06_SignUp Link
		Then Ill see the SEO010_SignUp Page
		And Ill see "2 minute setup to get started with SEOReseller right away. Grow your agency by outsourcing your SEO, Web Design, Social Media, Link Building and more!" 

		
    Examples: 
      | Email                         | Password       |
      | rndautomationtest5@gmail.com  | happy123$      |