Feature: System Configuration

  Background:

  Scenario Outline: Add System Configuration


    Given Login To CMS Page Login
    When Click On System Configuration Icon
    And Click To Select Country
    And Click On Add Country Button
    And Click To Delete Country
    And Click On Notification Setting
    And Insert Delete Notification Days
    And Insert Show up to Message
    And Click On Save Changes Button
    And Click On ACL Management
    And Click On Add Access Level Button
    And Click On User Reject Reason
    And Insert User Reject Reason EN
    And Save User Reject Reason
    And Delete User Reject Reason
    And Click On Customer Management
    And Insert Customer Profile Reject Reason
    And Save Customer Profile Reject Reason
    And Delete Customer Profile Reject Reason
    And Click On Customer User Reject Reason
    And Insert Customer User Reject Reason
    And Save Customer User Reject Reason
    And Delete Customer User Reject Reason



    Examples:
      ||
      ||
