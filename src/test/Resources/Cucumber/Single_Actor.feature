Feature: get a specific actor


  Scenario Outline: retrieving a specific actor from the database
    Given actor exists with id <actorid>
    When i request an actors details
    Then webpage should show the actors "<firstname>" and "<lastname>"
    Examples:
      | actorid | firstname | lastname    |
      |    1    | PENELOPE  | GUINESS     |
      |    5    | JOHNNY    | LOLLOBRIGIDA|
      |    3    | BORIS     | JOHNSON     |