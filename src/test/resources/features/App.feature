Feature: pramerica Life Speedbiz

#  @First_Time_Login
  Scenario: Launch Product Page
    Given Login to the app
    When Terminate the session
    When Enter the Employee code
    When Enter the otp
    And Login to the app
    When Click on the Application Form
    And Fill the Application Form
    When Click on Next Button
    And Click on Finish Button
    When Choose from a wide range of products



#    @After_Multiple_Login
#    Scenario: Launch product page
#      Given Enter the "420420"
#      When Click on the Application Form
#      And Fill the Application Form




