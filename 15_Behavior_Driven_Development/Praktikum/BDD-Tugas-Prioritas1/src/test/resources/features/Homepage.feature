@LinkedIn
Feature: LinkedIn Home Page for Non-Premium Users
  As a user
  I want to verify the functionality of various features on the LinkedIn home page
  So that I can ensure a seamless experience as a non-Premium member

  Scenario:   Jobs feature
    When I clicks on "Jobs"
    Then I should be taken to the "Jobs" page
    And I should be able to search for job listings
    And I should be able to view job details and apply for jobs

  Scenario:   Messaging feature
    When I clicks on "Messaging"
    Then I should be taken to the "Messaging" page
    And I should be able to send and receive messages to and from connections
    And I should be able to start new conversations

  Scenario:   Notifications feature
    When I clicks on "Notifications"
    Then I should be taken to the "Notifications" page
    And I should see notifications related to their network and activity

  Scenario:   My Profile feature
    When I clicks on the profile picture
    Then I should be taken to their own profile page
    And I should be able to edit their profile information

  Scenario:   Try Premium feature
    When I clicks on "Try Premium"
    Then I should be taken to the Premium upgrade page
    And I should see information about Premium features and pricing
    And I should have the option to upgrade to LinkedIn Premium

