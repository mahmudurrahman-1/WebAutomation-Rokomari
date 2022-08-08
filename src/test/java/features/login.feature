Feature: Log in feature

  Scenario Outline: Sign in with valid credentials
    Given Go to sign in page
    When valid <email> and <password> entered
    Then Welcome to your profile

    Examples:
      | email                         | password      |
      | mahmudur.rahman.sqa@gmail.com | mahmudur@0000 |