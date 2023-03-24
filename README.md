# CompositePrimaryKeys using JPA

 ###Run cmd:
 
 
 mvn spring-boot:run

In this example, the OrderDetails entity has a composite primary key made up of the orderId and productId columns. We use the @IdClass annotation to indicate that this is a composite key, and we create an OrderDetailsId class to represent the composite key:

With this setup, we can use Spring Data JPA's repository functionality to perform CRUD (create, read, update, delete) operations on the OrderDetails table. For example, we can create a repository interface like this:

This repository interface allows us to perform database operations on the OrderDetails table using the standard Spring Data JPA methods, such as save(), findById(), findAll(), and delete(). We can also define custom query methods if needed.