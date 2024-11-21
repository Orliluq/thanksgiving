# Shared Thanksgiving Dinners API 🍽️
![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.5-brightgreen)
![Build](https://img.shields.io/github/workflow/status/your-username/halloween-trivia-api/Build%20API%20Project)
![License](https://img.shields.io/badge/license-MIT-blue.svg)
![Contributions](https://img.shields.io/badge/contributions-welcome-brightgreen.svg)
![Swagger](https://img.shields.io/badge/documented%20with-Swagger-orange.svg)

<p align="center">
    <a href="https://git.io/typing-svg">
    <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=500&pause=1000&color=C53521&vCenter=true&width=435&lines=%F0%9F%A6%83+Backend+Challenge+(Java);Thanksgiving+Dinners+API+%F0%9F%8D%BD%EF%B8%8F"/></a><br>
</p>

A RESTful API for hosting a potluck Thanksgiving dinner. This API allows users to register which dishes they will carry, see what others are carrying, update and delete records.

## 🦃 Main features:
- Register a dish: Users can add the dishes they will bring, indicating the name of the dish, type of food, cook and user name.
- List all registered dishes.
- Update an existing dish.
- Delete a saucer.
- Documentation automatically generated with Swagger/OpenAPI.

## 🥧 Technologies used
- Java 21
- SpringBoot
- PostgreSQL for the relational database.
- Swagger/OpenAPI to document the API.
- Clean Architecture and SOLID principles.

## 🍗 Project structure
```
src
├── main
│   ├── java
│   │   └── com
│   │       └── thanksgiving
│   │           ├── config         # Security and other settings
│   │           ├── domain         # Entities and domain logic
│   │           ├── application    # Application services
│   │           ├── infrastructure # Repositories and interaction with the database
│   │           ├── shared         # Utilities
│   │           └── api            # REST drivers
│   └── resources
│       └── application.properties # Database and app configuration
```
## 🍷 API endpoints
1. Register a dish
Method: POST
URL: `/api/V1/dishes`
Example bodysuit: 
```
{
  "userName": "JohnDoe"
  "name": "Pumpkin Pie",
  "type": "DESSERT",
  "chefName": "Alice"
}
```
Successful response: 201 Created
```
{
  "id": 1,
  "name": "Pumpkin Pie",
  "type": "DESSERT",
  "chefName": "Alice",
  "userName": "JohnDoe"
}
```
2. List all the dishes
Method: GET
URL: `/api/V1/dishes`
Answer:
```
[
  {
    "id": 1,
    "name": "Pumpkin Pie",
    "type": "DESSERT",
    "chefName": "Alice",
    "userName": "JohnDoe"
  },
  ...
]
```
3. Upgrade a dish
Method: PUT
URL: `/api/V1/dishes/{id}`
Example bodysuit:
```
{
  "name": "Apple Pie",
  "type": "DESSERT",
  "chefName": "Alice",
  "userName": "JohnDoe"
}
```
Successful response: 200 OK
```
{
  "id": 1,
  "name": "Apple Pie",
  "type": "DESSERT",
  "chefName": "Alice",
  "userName": "JohnDoe"
}
```
4. Delete a saucer
Method: DELETE
URL: `/api/dishes/{id}`
Successful answer: 204 No Content

## 📊 Class diagram
![Diagrama](https://github.com/user-attachments/assets/81283f3a-8123-4609-9702-16fe02b88956)

## 📈 Initial setup
### Prerequisites
- Java 21 or higher.
- Maven for dependency management.
- PostgreSQL configured and running.
  
### Steps to run the application:
1. Clone the repository:
```
git clone https://github.com/Orliluq/thanksgiving.git
cd thanksgiving
```
2. Configure the database in application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update

3. Run the application:
`mvn spring-boot:run`

## 🔥 Access the API documentation at:
`http://localhost:8080/swagger-ui/index.html`
![swagger](https://github.com/user-attachments/assets/d3e5518f-0834-485e-b468-6008b0c558b8)

## 👪🏻 Evidence
Use tools like Postman or cURL to test endpoints.
- For automated tests: `mvn test`

## 🏷️ License
This project is licensed under the MIT License. See the LICENSE file for details.

## 🍁 Contributions
Contributions are welcome! Please open a pull request or report issues in the repository.
