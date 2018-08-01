#Author: reuel@truelogic.com.ph, lorraine@truelogic.com.ph
#Version 1.0 06.27 2018 - Initial creation of file
Feature: [TAA-37] SRS Forgot Password Smoke Test Suite v0.1

  #Scenario Description:
  #Covered Tickets : SRS-2493, SRS-3106
  #Given I'm a existing Partner
  #When I Click Forgot Password
  #And Successfully Changed the Password
  #Then I'll see the Dashboard Page
  @SRSSMOKETEST @ForgotPassword @ForgotPassword_TS01 @TAA-43
  Scenario Outline: TAA-43
    Given Im an existing Partner
    When I navigate to "SEOSTG_Login"
    And I click the SEO06_ForgotPassword link
    Then Ill see the SEO08_ForgotPassword page
    And Ill see the SEO08_SRS banner
    When I enter <Email> in the SEO08_EnterEmail textfield
    And I click the SEO08_Submit button
    Then Ill see the SEO08_Message div with 'You are almost in your account'
    When I navigate to GMAIL
    And I click the GMAIL01_GoogleHomeSignIn link
    And I populate the GMAIL01_GoogleEmail textField with <Email>
    And I click the GMAIL01_GoogleNext button
    And I populate the GMAIL01_GooglePassword textField with <Password>
    And I click the GMAIL01_GoogleNext button
    And I click the GMAIL01_EmailSubject with <Subject>
    Then Ill see the GMAIL01_Message div with "Hi Partner, To reset your password please click on the button below. Link will only be valid for 24 hours:"
    And Ill see the GMAIL01_ResetYourPassword <ElementName>
    When I click the GMAIL01_ResetYourPassword <ElementName>
    Then Ill see the SEO09_ResetPassword page
		And Ill see the SEO09_Message input with "Should be at least 8 characters"
    And Ill see the SEO09_Toggle button
    And Ill see the SEO09_BacktoLoginpage link
    When I populate SEO09_Password textfield with <NewPassword>
    And I click the SEO09_Submit button
    Then Ill see the SEO00_Dashboard page    
    When I navigate to ParentWindow
    And I click the GMAIL01_EmailSubject with <Subject>
    Then Ill see the GMAIL01_Message div with "Hello,This message is to confirm that you changed your password."
    

    Examples: 
      | Email                        | Password  | Domain | Subject                        | Condition           | NewPassword | PasswordUpdated                       |
      | RNDAutomationTest8@gmail.com | happy123$ | google | Reset Account Password Request | Reset Your Password | happy123    | Account Password successfully updated |
      | RNDAutomationTest8@gmail.com | happy123$ | google | Reset Account Password Request | Reset Your Password | happyabc    | Account Password successfully updated |
      | RNDAutomationTest8@gmail.com | happy123$ | google | Reset Account Password Request | Reset Your Password |    12345678 | Account Password successfully updated |
      | RNDAutomationTest8@gmail.com | happy123$ | google | Reset Account Password Request | Reset Password Link | happy123    | Account Password successfully updated |
      | RNDAutomationTest8@gmail.com | happy123$ | google | Reset Account Password Request | Reset Password Link | happyabc    | Account Password successfully updated |
      | RNDAutomationTest8@gmail.com | happy123$ | google | Reset Account Password Request | Reset Password Link |    12345678 | Account Password successfully updated |

  #Scenario Description:
  #Covered Tickets : SRS-2493, SRS-3106
  #Given I'm a existing Partner
  #When I Click Forgot Password
  #And Unsuccessfully Changed the Password
  #Then I'll not see the Dashboard Page
  @SRSSMOKETEST @ForgotPassword @ForgotPassword_TS02 @TAA-44
  Scenario Outline: TAA-44
    Given Im an existing Partner
    When I navigate to "SEOSTG_Login"
    And I click the SEO06_ForgotPassword link
    Then Ill see the SEO08_ForgotPassword page
    And Ill see the SEO08_SRS banner
    When I enter <Email> in the SEO08_EnterEmail textfield
    And I click the SEO08_Submit button
    Then Ill see the SEO08_Message div with 'You are almost in your account'
    When I navigate to GMAIL
    And I click the GMAIL01_GoogleHomeSignIn link
    And I populate the GMAIL01_GoogleEmail textField with <Email>
    And I click the GMAIL01_GoogleNext button
    And I populate the GMAIL01_GooglePassword textField with <Password>
    And I click the GMAIL01_GoogleNext button
    And I click the GMAIL01_EmailSubject with <Subject>
    Then Ill see the GMAIL01_Message div with "Hi Partner, To reset your password please click on the button below. Link will only be valid for 24 hours:"
    And Ill see the GMAIL01_ResetYourPassword <ElementName>
    When I click the GMAIL01_ResetYourPassword <ElementName>
    Then Ill see the SEO09_ResetPassword page
    And Ill see the SEO09_Message input with "Should be at least 8 characters"
    And Ill see the SEO09_Toggle button
    And Ill see the SEO09_BacktoLoginpage link
    When I populate SEO09_Password textfield with <NewPassword>
    And I click the SEO09_Submit button
    Then Ill see the SEO09_Message div with "The Password field must be at least 8 characters in length."
    And Ill see the SEO09_ResetPassword page
    

    Examples: 
      | Email                        | Password  | NewPassword | Subject                        | Domain | Condition           |
      | RNDAutomationTest9@gmail.com | happy123$ |         123 | Reset Account Password Request | google | Reset Your Password |
      | RNDAutomationTest9@gmail.com | happy123$ |         123 | Reset Account Password Request | google | Reset Password Link |

  #Scenario Description:
  #Covered Tickets : SRS-2493, SRS-3106z
  #Given I'm a existing Partner
  #When I Click Forgot Password
  #And did not change the Password
  #Then I'll see the Dashboard Page
  @SRSSMOKETEST @ForgotPassword @ForgotPassword_TS03 @TAA-45
  Scenario Outline: TAA-45
    Given Im an existing Partner
    When I navigate to "SEOSTG_Login"
    And I click the SEO06_ForgotPassword link
    Then Ill see the SEO08_ForgotPassword page
    And Ill see the SEO08_SRS banner
    When I enter <Email> in the SEO08_EnterEmail textfield
    And I click the SEO08_Submit button
    Then Ill see the SEO08_Message div with 'You are almost in your account'
    #===================================
    When I navigate to GMAIL
    And I click the GMAIL01_GoogleHomeSignIn link
    And I populate the GMAIL01_GoogleEmail textField with <Email>
    And I click the GMAIL01_GoogleNext button
    And I populate the GMAIL01_GooglePassword textField with <Password>
    And I click the GMAIL01_GoogleNext button
    And I click the GMAIL01_EmailSubject with <Subject>
    Then Ill see the GMAIL01_Message div with "Hi Partner, To reset your password please click on the button below. Link will only be valid for 24 hours:"
    And Ill see the GMAIL01_ResetYourPassword <ElementName>
    When I click the GMAIL01_ResetYourPassword <ElementName>
    #===================================
    Then Ill see the SEO09_ResetPassword page
    And Ill see the SEO09_Message input with "Should be at least 8 characters"
    And Ill see the SEO09_Toggle button
    And Ill see the SEO09_BacktoLoginpage link
    When I click the SEO09_BacktoLoginpage link
    Then Ill see the SEO00_LogIn page
    When I enter <Email> in the SEO06_EmailAddress textfield
    And I enter <Password> in the SEO06_Password textfield
    And I click the SEO06_LoginToYourDashBoard button
    Then Ill see the SEO00_Dashboard page
    

    

    Examples: 
      | Email                         | Password  | Domain | ElementName | Subject                        |
      | RNDAutomationTest10@gmail.com | happy123$ | google | button      | Reset Account Password Request |
      | RNDAutomationTest10@gmail.com | happy123$ | google | link        | Reset Account Password Request |
