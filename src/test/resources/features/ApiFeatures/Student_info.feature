@studentInfo
Feature: Add_Student_info
  Scenario: TC17_Add_Student_info_POST
    Given teacher sends the student info data_POST
    Then teacher gets the student info data and assert_POST


  Scenario: TC17_Add_Student_info_GET
    Given teacher sends the student info data_GET
    Then teacher gets the student info data and assert_GET

  Scenario: TC17_Add_Student_info_PUT
    Given teacher sends the student info data_PUT
    Then teacher gets the student info data and assert_PUT

  Scenario: TC17_Add_Student_info_PUTGET
    Given teacher sends the student info data_PUTGET
    Then teacher gets the student info data and assert_PUTGET


  Scenario: TC17_Add_Student_info_DELETE
    Given teacher sends the student info data_DELETE
    Then teacher gets the student info data and assert_DELETE

  Scenario: TC17_Add_Student_info_GETDELETE
    Given teacher sends the student info data_GETDELETE
    Then teacher gets the student info data and assert_GETDELETE