Feature: Reset Password Feature
  Scenario: Enter existing email or phone no for the verification code
    Given Go to reset feature
    When Enter "input" no in the field
    Then SuccessFull
