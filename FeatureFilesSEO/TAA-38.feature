#Author: reuel@truelogic.com.ph, lorraine@truelogic.com.ph
#Version 1.0 06.27 2018 - Initial creation of file
Feature: [TAA-38] [SEOReseller]: Registration

  #Covered Ticket : SRS-2544, SRS-2690, SRS-3160, SRS-2545, SRS-2546, SRS-4157
  #Scenario Description:
  #Given I'm a new Partner
  #When I Manual Sign-Up successfully
  #Then I'll be directed to Welcome Page
  #When I verify the email
  #And Finish the Company Profile Set up
  #Then I'll see the Home Page of the Dashboard
  @SRSSMOKETEST @Registration @Registration_TS01 @TAA-88
  Scenario Outline: TAA-88
    Given Im a new Partner
    And I check if <Email> should not exist as pre condition
    When I navigate to "SEOSTG_Login"
    Then Ill see the SEO06_SeoReseller Banner
    When I click SEO06_SignUp link
    Then Ill see the SEO010_SignUp Page
    And Ill see "2 minute setup to get started with SEOReseller right away. Grow your agency by outsourcing your SEO, Web Design, Social Media, Link Building and more!"
    And Ill see the SEO010_SignInWithGoogle button
    And Ill see the SEO010_FirstName textfield
    And Ill see the SEO010_LastName textfield
    And Ill see the SEO010_EmailAddress textfield
    And Ill see the SEO010Password textfield
    And Ill see the SEO010_TermsAndPrivacy text
    And Ill see "Already have an account"
    And Ill see the Create Account button
    When I populate the SEO010_FirstName textfield with <FirstName>
    And I populate the SEO010_LastName textfield with <LastName>
    And I populate the SEO010_Email textfield with <Email>
    And I populate the SEO010_Password textfield with <Password>
    And I click SEO010_CreateAccount button
    When I click the SEO011_GoToMailbox button for my <Domain> Account
    And I login using my <Email> and <Password> for my <Domain> Mailbox
    And Ill see the email with Subject <Subject> for my <Domain> Mailbox
    When I select email with Subject <Subject> for my <Domain> Mailbox
    Then Ill see the Email_SeoReseller logo
    And Ill see the Email_ThankYouForRegistering message
    And Ill see the Email_GoToDashboard button
    And Ill see the Email_RegistrationConfirm link
    When I click the Email_Redirect <MailRedirect>
    Then Ill see that Im redirected to SEO06_DashboardHome Page
    And Ill see the SEO01_SuccessAccountVerifyMessage message
    When I click the User Avatar
    And I click the Logout
    And I enter <Email> in the Email Address Field
    And I enter <Password> in the Password Field
    And I click the Log in to your Dashboard button
    Then Ill see the SEO01_CompanySetup popup
    And Ill see SEO01_CompanyProfile verbiage
    And Ill see that the SEO01_PhoneCountry icon is based on <Country>
    When I click SEO01_CompleteProfile button
    And Ill see that the SEO01_UploadLogo button is removed
    And Ill see the SEO01_CompanyWebsite globe
    And I populate SEO01_CompanyName textfield with <CompanyName>
    And I select <CompanyProfile> in SEO01_CompanyProfile dropdown
    And I select <ExistingClients> in SEO01_ExistingClient dropdown
    And I populate SEO01_CompanyWebsite textfield with <CompanyWebsite>
    And I populate SEO01_BusinessPhone textfield with <BusinessPhone>
    And I populate SEO01_Address textfield with <Address> returned by Google
    And Ill see that SEO01_State and SEO01_Country fields are auto-populated
    And I click SEO01_FinishSetup Button
    Then Ill not see the SEO01_CompanySetup popup

    Examples: 
      | FirstName | LastName   | Email                         | Password  | Domain | MailRedirect                | Country     | CompanyName    | CompanyProfile                | ExistingClients    | CompanyWebsite | BusinessPhone | Address | Subject                           |
      | RND       | Automation | RNDAutomationTest12@gmail.com | happy123$ | google | Go to my dashboard button   | Philippines | This is a test | I have more than 30 employees | Exceeds 20 clients | www.test.com   |    9171111111 | Makati  | Please Confirm Your Email Address |
      | RND       | Automation | RNDAutomationTest12@gmail.com | happy123$ | google | Dashboard Confirmation Link | Philippines | This is a test | I have more than 30 employees | Exceeds 20 clients | www.test.com   |    9171111111 | Makati  | Please Confirm Your Email Address |
      | RND       | Automation | RNDAutomationTest12@zoho.com  | happy123$ | zoho   | Go to my dashboard button   | Philippines | This is a test | I have more than 30 employees | Exceeds 20 clients | www.test.com   |    9171111111 | Makati  | Please Confirm Your Email Address |
      | RND       | Automation | RNDAutomationTest12@zoho.com  | happy123$ | zoho   | Dashboard Confirmation Link | Philippines | This is a test | I have more than 30 employees | Exceeds 20 clients | www.test.com   |    9171111111 | Makati  | Please Confirm Your Email Address |

  #Covered Ticket : SRS-2544, SRS-2690, SRS-3160, SRS-2545, SRS-2546, SRS-4157
  #Scenario Description:
  #Given I'm a new Partner,
  #When I Google Sign-Up successfully
  #Then I'll see the Dashboard
  @SRSSMOKETEST @Registration @Registration_TS02 @TAA-96
  Scenario Outline: TAA-96
    Given Im a new Partner
    And I check if <Email> should not exist as pre condition
    When I navigate to "SEOSTG_Login"
    Then Ill see the SEO06_SeoReseller Banner
    When I click SEO06_SignUp link
    Then Ill see the SEO010_SignUp Page
    And Ill see "2 minute setup to get started with SEOReseller right away. Grow your agency by outsourcing your SEO, Web Design, Social Media, Link Building and more!"
    And Ill see the SEO010_SignInWithGoogle button
    And Ill see the SEO010_FirstName textfield
    And Ill see the SEO010_LastName textfield
    And Ill see the SEO010_EmailAddress textfield
    And Ill see the SEO010Password textfield
    And Ill see the SEO010_TermsAndPrivacy text
    And Ill see "Already have an account"
    And Ill see the Create Account button
    When I click the SEO010_SignInWithGoogle button
    Then Ill see the Google Pop up
    When I populate google email field with <Email>
    And I click google next button
    And I populate google password field with <Password>
    And I click google next button
    Then Google sign in window will close
    And Ill see the Dashboard Page
    When I click the User Avatar
    And I click the Logout
    And I click the Sign in with Google button
    Then Ill see the SEO01_CompanySetup popup
    And Ill see SEO01_CompanyProfile verbiage
    And Ill see that the SEO01_PhoneCountry icon is based on <Country>
    When I click SEO01_CompleteProfile button
    And Ill see that the SEO01_UploadLogo button is removed
    And Ill see the SEO01_CompanyWebsite globe
    And I populate SEO01_CompanyName textfield with <CompanyName>
    And I select <CompanyProfile> in SEO01_CompanyProfile dropdown
    And I select <ExistingClients> in SEO01_ExistingClient dropdown
    And I populate SEO01_CompanyWebsite textfield with <CompanyWebsite>
    And I populate SEO01_BusinessPhone textfield with <BusinessPhone>
    And I populate SEO01_Address textfield with <Address> returned by Google
    And Ill see that SEO01_State and SEO01_Country fields are auto-populated
    And I click SEO01_FinishSetup Button
    Then Ill not see the SEO01_CompanySetup popup

    Examples: 
      | FirstName | LastName   | Email                         | Password  | Domain | MailRedirect              | Country     | CompanyName    | CompanyProfile                | ExistingClients    | CompanyWebsite | BusinessPhone | Address | Subject                           |
      | RND       | Automation | RNDAutomationTest14@gmail.com | happy123$ | google | Go to my dashboard button | Philippines | This is a test | I have more than 30 employees | Exceeds 20 clients | www.test.com   |    9171111111 | Makati  | Please Confirm Your Email Address |

  #Covered Ticket : SRS-2544,SRS-2690,SRS-3160,SRS-2545,SRS-2546,SRS-4157
  #Scenario Description:
  #Given I'm a new Partner,
  #When I Manual Sign-Up successfully
  #And I resend the verification link
  #Then I see the Dashboard
  @Registrations @Registration_TS03 @TAA-104
  Scenario Outline: TAA-104
    Given Im a new Partner
    And I check if <Email> should not exist as pre condition
    When I navigate to "SEOSTG_Login"
    Then Ill see the SEO06_SeoReseller Banner
    When I click SEO06_SignUp link
    Then Ill see the SEO010_SignUp Page
    And Ill see "2 minute setup to get started with SEOReseller right away. Grow your agency by outsourcing your SEO, Web Design, Social Media, Link Building and more!"
    When I populate the SEO010_FirstName textfield with <FirstName>
    And I populate the SEO010_LastName textfield with <LastName>
    And I populate the SEO010_Email textfield with <Email>
    And I populate the SEO010_Password textfield with <Password>
    And I click SEO010_CreateAccount button
    Then Ill be redirected to Welcome page
    And I see the message "Welcome! Congratulations, You are just one step away to access all features of your free account. Please verify your account by clicking on the confirmation link sent to your email."
    When I click the SEO011_GoToMailbox button for my <Domain> Account
    And I login using my <Email> and <Password> for my <Domain> Mailbox
    And Ill see the email with Subject <Subject> for my <Domain> Mailbox
    When I select email with Subject <Subject> for my <Domain> Mailbox
    Then Ill see the Email_SeoReseller logo
    And Ill see the Email_ThankYouForRegistering message
    And Ill see the Email_GoToDashboard button
    And Ill see the Email_RegistrationConfirm link
    When I navigate back to "SEOSTG_Welcome"
    Then Ill be redirected to Welcome page
    And I click the SEO11_resend link
    When I click the SEO011_GoToMailbox button for my <Domain> Account
    Then Ill see the email with Subject <Subject> for my <Domain> Mailbox
    When I select email with Subject <Subject> for my <Domain> Mailbox
    Then Ill see the Email_SeoReseller logo
    And Ill see the Email_ThankYouForRegistering message
    And Ill see the Email_GoToDashboard button
    And Ill see the Email_RegistrationConfirm link
    When I click the Email_Redirect <MailRedirect>
    Then Ill see that Im redirected to SEO06_DashboardHome Page
    And Ill see the SEO01_SuccessAccountVerifyMessage message
    When I click the User Avatar
    And I click the Logout
    And I enter <Email> in the Email Address Field
    And I enter <Password> in the Password Field
    And I click the Log in to your Dashboard button
    Then Ill see the SEO01_CompanySetup popup
    And Ill see SEO01_CompanyProfile verbiage
    And Ill see that the SEO01_PhoneCountry icon is based on <Country>
    When I click SEO01_CompleteProfile button
    And Ill see that the SEO01_UploadLogo button is removed
    And Ill see the SEO01_CompanyWebsite globe
    And I populate SEO01_CompanyName textfield with <CompanyName>
    And I select <CompanyProfile> in SEO01_CompanyProfile dropdown
    And I select <ExistingClients> in SEO01_ExistingClient dropdown
    And I populate SEO01_CompanyWebsite textfield with <CompanyWebsite>
    And I populate SEO01_BusinessPhone textfield with <BusinessPhone>
    And I populate SEO01_Address textfield with <Address> returned by Google
    And Ill see that SEO01_State and SEO01_Country fields are auto-populated
    And I click SEO01_FinishSetup Button
    Then Ill not see the SEO01_CompanySetup popup

    Examples: 
      | FirstName | LastName   | Email                         | Password  | Domain | MailRedirect              | IP | CompanyName    | CompanyProfile                | ExistingCLients    | CompanyWebsites | BusinessPhone | Address | Subject                           |
      | RND       | Automation | RNDAutomationTest15@gmail.com | happy123$ | google | Go to my dashboard button | PH | This is a Test | I have more than 30 employees | Exceeds 20 Clients | www.test.com    |    9171111111 | Makati  | Please Confirm Your Email Address |
