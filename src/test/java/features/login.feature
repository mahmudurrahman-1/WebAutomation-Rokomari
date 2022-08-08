Feature: Log in feature

  Scenario Outline: Sign in with valid credentials
    Given Go to sign in page
    When valid <email> and <password> entered
    Then Welcome to your profile

    Examples:
      | email                        | password     |
      | tabiur.rahman.sqa@gmail.com | tabiur@0000 |