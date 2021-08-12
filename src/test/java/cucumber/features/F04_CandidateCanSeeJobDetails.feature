@Candidate4
Feature: F04 - Candidate can see the job's details.

  Background:
    Given user is on the jobs listing in Main screen

  @TC04-001
  Scenario Outline: TC04-001 Candidate opens a job's page and see its details.
    When user opens a job which has index of <index> in Main screen
    Then verify user should see info in Jobs Details screen
    Examples: First and Second jobs
      | index |
      | 0     |
      | 1     |

  @TC04-002
  Scenario: TC04-002 Candidate opens a job's page and see its details.
    When user opens a job which has index of 0 in Main screen
    Then verify user should see info in Jobs Details screen


  @TC03-003
  Scenario: TC04-003 Candidate opens a job's page and see its details.
    When user opens a job which has index of 1 in Main screen
    Then verify user should see info in Jobs Details screen
