Feature: Log in feature

  Scenario Outline: Sign in with valid credentials
    Given Go to sign in page
    When valid <email> and <password> entered
    Then Welcome to your profile

    Examples:
      | email                        | password     |
      | mujibur.rahman.sqa@gmail.com | mujibur@0000 |