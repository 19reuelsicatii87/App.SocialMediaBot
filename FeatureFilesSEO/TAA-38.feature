#Author: reuel@truelogic.com.ph, lorraine@truelogic.com.ph
#Version 1.0 06.27 2018 - Initial creation of file


Feature: [TAA-38] [SEOReseller]: Registration


  #Covered Ticket : SRS-2544,SRS-2690,SRS-3160,SRS-2545,SRS-2546,SRS-4157
  #Scenario Description:
  #Given I'm a new Partner,
  #When I Manual Sign-Up successfully
  #And I resend the verification link
  #Then I see the Dashboard
  
  @SRSSMOKETEST @Registration @Registration_TS03 @TAA-104
  Scenario Outline: TAA-104
    Given Im a new Partner
    When I navigate to the SRS Dashboard
    Then I see the SEO01_SeoReseller banner
    
    When I click the SEO01_SignUp link
    Then I see the SEO10_SignUp page
    And I see "2 minute setup to get started with SEOReseller right away. Grow your agency by outsourcing your SEO, Web Design, Social Media, Link Building and more!"
    
    #We'll wait for Lorraine Gherkins and StepDef
    #=============================================================
    #When I populate the SEO10_FirstName textfield with <FirstName>
    #And I populate the SEO10_LastName textfield with <LastName>
    #And I populate the SEO10_Email textfield with <Email>
    #And I populate the SEO10_Password textfield with <Password>
    #And I click SEO10_CREATEACCOUNT button
    #Then I be redirected to Welcome page
    #And I see the message "Welcome! Congratulations, You are just one step away to access all features of your free account. Please verify your account by clicking on the confirmation link sent to your email."
    
    #We'll wait for Lorraine Gherkins and StepDef
    #=============================================================
  	#When I click the SEO011_GoToMailbox button
  	#And I login using my <Email> and <Password> for my <Domain> Mailbox
    #Then I see the Verification Email
    #And I see that all text left-aligned; Logo and CTA center-aligned
    #And I see the "Thank you for registering at seoreseller.com There's just one more step to get you started" message was displayed
    
    When I navigate back to SRS Welcome page
    And I click the SEO11_resend link
    And I navigate back to my Mailbox
    Then I see the new email verification
    
    #We'll wait for Lorraine Gherkins and StepDef
    #=============================================================
    #When I click the <MailRedirect>
    #Then I see that I'm redirected to Dashboard Home Page
    #And I see the 'Congratulations! You have successfully verified your email address.' message
    
    #When I click the Avatar
    #And I click Logout
    #And I enter <Email> in the Email Address Field
    #And I enter <Password> in the Password Field
    #And I click the Login to your dashboard Button
    #Then I see the Company Setup popup
    #And I see Company Profile verbiage
    #And I see that the Upload Logo button is removed
    #And I see that Company website icon is globe
    #And I see that the Phone Country icon is based on <IP>
    
    #When I click Complete Profile button
    #And I populate Company Name Field with <CompanyName>
    #And I select <CompanyProfile> in Company Profile Dropdown
    #And I select <ExistingClients> in Existing Client Dropdown
    #And I populate Company Website Field with <CompanyWebsite>
    #And I populate Busimess Phone Field with <BusinessPhone>
    #And I populate Address field with <Address> returned by Google
    #And I see that City, State, ZIPCode and Country fields are auto-populated
    #And I click Finish Setup Button
    #Then I not see the Company Setup popup

    Examples: 
      | FirstName | LastName   | Email                         | Password | Domain | MailRedirect              | IP | CompanyName    | CompanyProfile                | ExistingCLients    | CompanyWebsites | BusinessPhone | Address |
      | RND       | Automation | RNDAutomationTest15@gmail.com | happy123 | Gmail  | Go to my dashboard button | PH | This is a Test | I have more than 30 employees | Exceeds 20 Clients | www.test.com    |    9171111111 | Makati  |


