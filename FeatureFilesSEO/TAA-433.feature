#Author: reuel@truelogic.com.ph, lorraine@truelogic.com.ph
#Version 1.0 06.27 2018 - Initial creation of file
Feature: [TAA-433] [SEOReseller] Onboarding Smoke/Regression TestSuite

  #Scenario Description:
  #Covered Ticket : SRS-6974
	#Given I am a User 
	#And I already finished the sign up process 
	#And I received the "Please confirm your email address email" 
	#When I <EmailAction> in the confirmation email
	#Then I will be redirected to the "Hey there!" page 
	#And I will see that the "Hey there!" page is aligned with the Mock-up
  @SRSSMOKETEST @Onboarding @OnboardingNonFunc_TS01 @TAA-434
  Scenario Outline: TAA-434
		Given Im a new Partner
    And I ensure that <Email> does not exist
    When I navigate to "Login"
    Then Ill see the SEO06_SeoReseller Banner
    
    When I click SEO06_SignUp link
    And I wait for page to load
    And I populate the SEO010_FirstName textfield with <FirstName>
    And I populate the SEO010_LastName textfield with <LastName>
    And I populate the SEO010_Email textfield with <Email>
    And I populate the SEO010_Password textfield with <Password>
    And I click SEO010_CreateAccount button
    And I wait for page to load
    Then Ill be redirected to SEO11_Welcome page
    And I see the SEO11_Congratulations div with "Congratulations! You are just one step away to access all features of your free account."
    
    When I navigate to GMAIL
    And I click the GMAIL01_GoogleHomeSignIn link
    And I populate the GMAIL01_GoogleEmail textField with <Email>
    And I click the GMAIL01_GoogleEmailNext button
    And I populate the GMAIL01_GooglePassword textField with <Password>
    And I click the GMAIL01_GooglePasswordNext button
    Then I see the GMAIL01_EmailSubject div with "Please Confirm Your Email Address"
   
		When I click the GMAIL01_EmailSubject div with "Please Confirm Your Email Address"
    Then Ill see the GMAIL01_ThankYouForRegistering div with "Thank you for registering at SEOReseller.com There's just one more step to get you started. To confirm your email address, please click on the button below."

    When I click the GMAIL01_GotoMyDashboard <ElementName>
    And I navigate to ChildWindow
    And I wait for page to load
    Then Ill be redirected to the SEO16_HeyThere Page
    And Ill be able to see a SEO16_StepCounter with numbers 1 to 3
		And Ill see the SEO16_SearchGiantQuote div with "By far the best SEO reseller provider we've worked with. Their plans are reasonably priced and staff is phenomenal. I highly recommend them."
		And Ill see the SEO16_Title text with "It's great to have you onboard with SEOReseller." 
		And Ill see the SEO16_SubText with "We're excited to work with you and be your partner in growth. We've helped thousands of clients improve rankings, and helped marketers build powerful digital marketing agencies." 
    And Ill see the SEO16_LetsGetStarted button
     
    Examples: 
			| FirstName | LastName   | Email                         | Password  | ElementName |
      | RND       | Automation | RNDAutomationTest12@gmail.com | happy123$ | button      |
      | RND       | Automation | RNDAutomationTest12@gmail.com | happy123$ | link        |
  
  
  #Scenario Description:
  #Covered Ticket : SRS-6974
	#	Given I am a User 
	#	And I already finished the sign up process 
	#	And I received the "Please confirm your email address email" 
	#	When I click on the "Let's get started" button 
	#	Then I will be able to see the "Getting to know you" first page  
	#	And I will see that the "Getting to know you" first page is aligned with the Mock-up
	#	When I click on any option 
	#	Then I will be able to see that the "Proceed" button will be enabled
  @SRSSMOKETEST @Onboarding @OnboardingNonFunc_TS02 @TAA-435
  Scenario Outline: TAA-435
		Given Im a new Partner
    And I ensure that <Email> does not exist
    When I navigate to "Login"
    Then Ill see the SEO06_SeoReseller Banner
    
    When I click SEO06_SignUp link
    And I wait for page to load
    And I populate the SEO010_FirstName textfield with <FirstName>
    And I populate the SEO010_LastName textfield with <LastName>
    And I populate the SEO010_Email textfield with <Email>
    And I populate the SEO010_Password textfield with <Password>
    And I click SEO010_CreateAccount button
    And I wait for page to load
    Then Ill be redirected to SEO11_Welcome page
    And I see the SEO11_Congratulations div with "Congratulations! You are just one step away to access all features of your free account."
    
    When I navigate to GMAIL
    And I click the GMAIL01_GoogleHomeSignIn link
    And I populate the GMAIL01_GoogleEmail textField with <Email>
    And I click the GMAIL01_GoogleEmailNext button
    And I populate the GMAIL01_GooglePassword textField with <Password>
    And I click the GMAIL01_GooglePasswordNext button
    Then I see the GMAIL01_EmailSubject div with "Please Confirm Your Email Address"
    
    When I click the GMAIL01_EmailSubject div with "Please Confirm Your Email Address"
    Then Ill see the GMAIL01_ThankYouForRegistering div with "Thank you for registering at SEOReseller.com There's just one more step to get you started. To confirm your email address, please click on the button below."
    
    When I click the GMAIL01_GotoMyDashboard <ElementName>
    And I navigate to ChildWindow
    And I wait for page to load
    Then Ill be redirected to the SEO16_HeyThere Page
    
    When I click the SEO16_LetsGetStarted button
    And I click the SEO17_Myself Radio button
    Then Ill see that the SEO17_Proceed button will be enabled
    
    When I click the SEO17_InHouse Radio button
    Then Ill see that the SEO17_Proceed button will be enabled
    
    When I click the SEO17_WithFreelancer Radio button
    Then Ill see that the SEO17_Proceed button will be enabled
    
    When I click the SEO17_WithAnAgency Radio button
    Then Ill see that the SEO17_Proceed button will be enabled
    
   	When I click the SEO17_WithAnOutsource Radio button
   	Then Ill see that the SEO17_Proceed button will be enabled
   	
    When I click the SEO17_DontDoSEO Radio button
    Then Ill see that the SEO17_Proceed button will be enabled
   
   Examples: 
		| FirstName | LastName   | Email                         | Password  | ElementName |
    | RND       | Automation | RNDAutomationTest12@gmail.com | happy123$ | button      |
    
      