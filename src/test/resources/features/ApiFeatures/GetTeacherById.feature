@ApiGetTeacher
Feature: Get_Teacher

  @admin
  Scenario: TC01_Validate_Teacher
    Given  send get request to get teacher
    Then validate body


  @admin
  Scenario: TC01_Validate_Teacher_Post
    Given Set the Url teacher_post
    And   Set the expected data teacher_post
    When  Send the request and get the response teacher_post
    Then  Do assertion teacher_post

