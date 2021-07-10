Feature: Sing In

  Scenario: I sign in to page test
    Given Savita on create account page
    And Enter email id for sign in
    And Enter personal information on sign up form and clicks on Register button
    Then She get registered successfully

  Scenario: Verify validation when she clicks on Create An Account button without entering email id
    Given Savita on create account page
    And clicks on Create An Account Button
    Then validation error message should be shown

  Scenario: Verify all validations on Create An Account Page when she clicks on Register without entering anything.
    Given Savita on create account page
    And Enter email id for sign in
    And she clicks on Register button
    Then all validation messages for that page should be shown