Feature: Reset Password Feature

  Scenario: Enter existing email or phone no for the verification code
    Given Go to reset feature
    When Inputs in the field is given
    Then Successful
