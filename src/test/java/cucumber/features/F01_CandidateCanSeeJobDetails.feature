@Candidate
  Feature: F01 - Candidate can see the job's details.

    Background:
      Given Candidate is on the jobs listing screen

#    @skip @TC01-001
#    Scenario Outline: TC01-A Candidate opens a job's page and see its details.
#      When Candidate opens a job which has index of <index>
#      Then verify candidate should see the jobs details
#      Examples: First and Second jobs
#        | index |
#        | 0     |
#        | 1     |

    @TC01-001
    Scenario: TC01 Candidate opens a job's page and see its details.
      When Candidate opens a job which has index of 0
      Then verify candidate should see the jobs details


#    @TC01-002
#    Scenario: TC02 Candidate opens a job's page and see its details.
#      When Candidate opens a job which has index of 0
#      Then verify candidate should see the jobs details
#
#
#    @TC01-003
#    Scenario: TC03 Candidate opens a job's page and see its details.
#      When Candidate opens a job which has index of 0
#      Then verify candidate should see the jobs details