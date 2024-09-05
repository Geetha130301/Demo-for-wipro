Feature: CRUD Operation on Jsonplaceholder application

  Scenario: Get all posts
    Given I have a base URI of "https://jsonplaceholder.typicode.com"
    When I send a Get request to "/posts"
    Then the response status code should be 200

  Scenario: Get One posts
    Given I have a base URI of "https://jsonplaceholder.typicode.com"
    When I send a Get request to "/posts/1"
    Then the response status code should be 200

  Scenario Outline: Create post
    Given I have a base URI of "https://jsonplaceholder.typicode.com"
    When I send a POST request to "/posts" with body as "<RequestBody>"
    Then the response time is less than 5000

    Examples: 
      | RequestBody                                                        |
      | { \\"title\\": \\"foo\\", \\"body\\": \\"bar\\", \\"userId\\": 1 } |

  Scenario Outline: Update a post
    Given I have base URI of "https://jsonplaceholder.typicode.com"
    When I send a PUT request to "/posts/1" with "<RequestBody>"
    Then the response status code should be 200
    And the response time is less than 5000

    Examples: 
      | RequestBody                                                                                                |
      | { \\"id\\": 1, \\"title\\": \\"Updated Title\\", \\"body\\": \\"Updated body content\\",\\"userId\\": 1  } |

  Scenario: Delete a post
    Given I have a base URI of "https://jsonplaceholder.typicode.com"
    When I send a DELETE request to "/posts/1"
    Then the response status code should be 200
    And the response time is less than 5000

  Scenario Outline: Patch post
    Given I have base URI of "https://jsonplaceholder.typicode.com"
    When I send a PATCH request to "/posts/ 1" with "<RequestBody>"
    Then the response status code should be 200
    And the response time is less than 5000

    Examples: 
      | RequestBody                                                               |
      | { \\"title\\": \\"foo patched\\" \\"body\\": \\"bar\\", \\"userId\\": 1 } |
