Feature: Pramerica App

  Background:
    Given Application is launched

  @test
  Scenario Outline: Login Page automation
    Then Login in the application with "<username>" and "<password>"
    When Click on terminate button
    Then enter employee code "<username>"
    When Click on submit button
    Then enter OTP
    And  Click on submit button
    Then Login in the application with "<username>" and "<password>"
    Examples:
      | username | password |
      | 70028763 | 420420   |

  @appForm
  Scenario Outline: Application form automation
    Then Login in the application with "<username>" and "<password>"
    When Click on terminate button
    Then enter employee code "<username>"
    When Click on submit button
    Then enter OTP
    And  Click on submit button
    Then Login in the application with "<username>" and "<password>"
    Then Add details in Application form of "<gender>" and "<sameAsProposer>"
    When Choose Product
    Then Plan the policy
    And  Allocate funds
    Examples:
      | username | password | gender | sameAsProposer |
      | 70028763 | 420420   | female | true           |
