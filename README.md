## What is in this project

For this project I built web services using Spring, created project using Spring Boot. I have stored json entries from Dublin Bikes to h2 in-memory database and accessed them via using JPA.

To run: 
```sh
  /mvnw clean spring-boot:run
```

When the app start we can access using:
```sh
curl -v localhost:8080/schema
```

I have overriden the `findAll` method of JPA interface to constumize returned JSON to have data fields as explained in the question

Also you can find specific id entry by typing:

```sh
curl -v localhost:8080//data/{id}
```
