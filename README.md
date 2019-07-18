# Spring Boot with Cassandra(NoSQL) Application

## Technology Stack

1.Spring Boot
2.Spring Tool Suite
3.Cassandra (CQLSH)
4.Postman
5.Git

## Build Instructions
  Open the github link https://github.com/vishnuprasadmaruthi/WT
  
  Open Spring Tool Suite and run the project
  
  Open postman client

  GET request:
  http://localhost:8082/book/list , we get the list of all books present in Cassandra DB
  http://localhost:8082/book/id , we get book having that id
  
  POST request:
  http://localhost:8082/book/add , we save the book in Cassandra DB. We add all the details of the book in request body.
  
  PUT request:
  http://localhost:8082/book/id , we can update the book details by first fetching it through its id and then saving it after making         required changes.
  
  DELETE request:
  http://localhost:8082/book , deletes all the books from the DB
  http://localhost:8082/book/id , deletes the book having that id.
  
  
  
  
