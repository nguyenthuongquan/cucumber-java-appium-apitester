@Candidate
  Feature: F01 - Candidate can see the job's details.

    @skip_scenario @TC01-001
    Scenario Outline: TC01-001 Candidate opens a job's page and see its details.
      Given Candidate is on the jobs listing screen
      When Candidate opens a job which has index of <index>
      Then Candidate should see the jobs details
      Examples: First and Second jobs
        | index |
        | 0     |
        | 1     |

    @TC01-002
    Scenario: TC01-002 Candidate opens a job's page and see its details.
      Given Candidate is on the jobs listing screen
#      When Candidate opens a job which has index of 0
      Then Candidate should see the jobs details