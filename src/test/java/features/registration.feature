Feature: Sign up Feature

  Scenario: First User Registration
    Given Go to sign up page
    When "1st" user filled every inputs
    Then Registration is successful

  Scenario: Second User Registration
    Given Go to sign up page
    When "2nd" user filled every inputs
    Then Registration is successful

  Scenario: Third User Registration
    Given Go to sign up page
    When "3rd" user filled every inputs
    Then Registration is successful

  Scenario: Fourth User Registration
    Given Go to sign up page
    When "4th" user filled every inputs
    Then Registration is successful