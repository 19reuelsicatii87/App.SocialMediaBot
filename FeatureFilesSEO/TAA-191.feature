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
Feature: [TAA-191] SRS Web Audit Smoke Test Suite v0.1

  #Scenario Description:
  #Given I'm a User
	#When I enter a website
	#And I click "Run New Audit(Beta)" Button
	#Then my report will generated using the web audit tool 
	#And I can view the report
  @TAA-277 @SRSSMOKETEST @WebAuditDashboardPage @WebAuditDashboardPage_TS01
  Scenario Outline: TAA-277
    Given Im an existing Partner
		When I navigate to "SEOSTG_Login"
		And I enter <email> in the Email Address Field
		And I enter <password> in the Password Field
		And I click the Log in to your Dashboard button
		Then Ill see the Dashboard Page
		
		When I populate SEO01_website textfield with <website>
		And I click SEO01_RunNewAuditBeta button
		Then I will be notified <websiteText> is now ready!
		And Ill see the SEO01_click here link of <websiteText>
		
		When I click SEO01_ClickHere link of <websiteText>
		Then Ill be redirected to Web Audit Report Preview
		And Ill see the SEO13_Audit report

    Examples: 
      | email                | password  |           website             |      websiteText       |
      | tlosrnd321@gmail.com | happy123  | https://www.jollibee.com.ph/  |       jollibee         |
      
 
  #Scenario Description:
	#	Given I'm a User
	#And I click add competitors link
	#When I Run Audit a valid website
	#Then a report will generated using the web audit tool 
	#And I will be notified "<website> is now ready!"
	#And see the results
  @TAA-278 @SRSSMOKETEST @WebAuditDashboardPage @WebAuditDashboardPage_TS02
  Scenario Outline: TAA-278
    Given Im an existing Partner
		When I navigate to "SEOSTG_Login"
		And I enter <email> in the Email Address Field
		And I enter <password> in the Password Field
		And I click the Log in to your Dashboard button
		Then Ill see the Dashboard Page
		
		When I populate SEO01_website textfield with <website>
		And I click SE01_AddCompetitors link
		Then Ill see SE01_CompetitorOne textfield
    And Ill see SE01_CompetitorTwo textfield
    And Ill see SE01_CompetitorThree textfield
    
		When I populate SE01_CompetitorOne textfield with <compWebOne>
		And I populate SE01_CompetitorTwo textfield with <compWebTwo>
		And I populate SE01_CompetitorThree textfield with <compWebThree>
		And I click SEO01_RunNewAuditBeta button
		Then I will be notified <websiteText> is now ready!
		And Ill see the SEO01_click here link of <websiteText>
		
		When I click SEO01_ClickHere link of <websiteText>
		Then Ill be redirected to Web Audit Report Preview
		And Ill see the SEO13_Audit report
		And Ill see Competitor <compWebOneText>
		And Ill see Competitor <compWebTwoText>
		And Ill see Competitor <compWebThreeText>

    Examples: 
      | email                | password  |           website             |      websiteText      |  compWebOne             |  compWebOneText    | compWebTwo              | compWebTwoText  |  compWebThree              |  compWebThreeText |
      | tlosrnd321@gmail.com | happy123  |     http://www.posh.com/      |      www.posh.com     |  https://www.yondu.com/ |   www.yondu.com    | https://www.google.com/ | www.google.com  |  https://www.yugatech.com/ |  www.yugatech.com |
      | tlosrnd321@gmail.com | happy123  |     http://www.posh.com/      |      www.posh.com     |  https://www.yondu.com/ |   www.yondu.com    | https://www.google.com/ | www.google.com  |  blank                     |  blank            |
			| tlosrnd321@gmail.com | happy123  |     http://www.posh.com/      |      www.posh.com     |  https://www.yondu.com/ |   www.yondu.com    | blank                   | blank           |  https://www.yugatech.com/ |  www.yugatech.com |
		  | tlosrnd321@gmail.com | happy123  |     http://www.posh.com/      |      www.posh.com     |  blank                  |   blank            | https://www.google.com/ | www.google.com  |  https://www.yugatech.com/ |  www.yugatech.com |
		  | tlosrnd321@gmail.com | happy123  |     http://www.posh.com/      |      www.posh.com     |  https://www.yondu.com/ |   www.yondu.com    | blank                   | blank           |  blank                     |  blank            |
		  | tlosrnd321@gmail.com | happy123  |     http://www.posh.com/      |      www.posh.com     |  blank                  |   blank            | https://www.google.com/ | www.google.com  |  blank                     |  blank            |
		  | tlosrnd321@gmail.com | happy123  |     http://www.posh.com/      |      www.posh.com     |  blank                  |   blank            | blank                   | blank           |  https://www.yugatech.com/ |  www.yugatech.com |        