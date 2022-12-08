
Created a simple CRUD application for a `Parts` entity by following this 1-hour [Spring Boot Tutorial](https://www.youtube.com/watch?v=QuvS_VLbGko)

Features
- RestController for different CRUD operations
- Normal controller for html page where all `Parts` entity are displayed. Rather than using server-side rendering like Thymeleaf, we make javascript api call to our API to load all `Parts`
- Two `Service` objects, one that is in memory and not persistent, and the other which integrates with MySQL
- Use of Spring Data to implement a `CrudRepository`
