Feature: get a specific film


  Scenario Outline: retrieving a specific film from the database
    Given film exists with id <filmid>
    When i request film details
    Then webpage should show the film "<title>"
    Examples:
      | filmid  | title             |
      |    1    | ACADEMY DINOSAUR  |
      |    5    | AFRICAN EGG       |
      |    3    | BAD MOVIE         |