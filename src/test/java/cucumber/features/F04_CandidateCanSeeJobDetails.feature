@Candidate4
Feature: F04 - Candidate can see the job's details.

  Background:
    Given Candidate is on the jobs listing screen

  @TC04-001
  Scenario Outline: TC04-001 Candidate opens a job's page and see its details.
    When Candidate opens a job which has index of <index>
    Then verify candidate should see the jobs details
    Examples: First and Second jobs
      | index |
      | 0     |
      | 1     |

  @TC04-002
  Scenario: TC04-002 Candidate opens a job's page and see its details.
    When Candidate opens a job which has index of 0
    Then verify candidate should see the jobs details


  @TC03-003
  Scenario: TC04-003 Candidate opens a job's page and see its details.
    When Candidate opens a job which has index of 1
    Then verify candidate should see the jobs details
