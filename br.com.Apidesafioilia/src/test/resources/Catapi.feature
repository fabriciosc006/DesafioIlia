Feature: Actions in Api The Cat Api
  I want to make some actions inside Api

  @vote1
  Scenario: Make a vote 
    Given acess to The Cat Api
    When give a POST to vote with token "00000"
    Then receive request status
  
   @remove
  Scenario: Remove a vote 
    Given acess to The Cat Api
    When remove a vote with received id
    Then receive remove status

  
