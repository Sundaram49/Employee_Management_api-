# employee_management_api-




##  Employee Management System API
This is a RESTful API developed using Spring framework for managing employee records. The API allows users to perform CRUD operations on employee records stored in a database.

## Technologies Used
Java 11
Spring Boot 2.5.0
MySQL 8.0.23
Prerequisites

## java 11 installed on your system
MySQL database instance
Postman (or any REST client) for testing the API endpoints
Installation and Setup
Clone this repository using the command: git clone https://github.com/your_username/employee-management-system.git


## Open the project in your favorite IDE (such as IntelliJ IDEA or Eclipse).

Modify the application.properties file with your database connection details:

bash
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=password
Build and run the application using the following command: ./mvnw spring-boot:run

The API will be available at http://localhost:8080.

## API Endpoints
GET /employees
Returns a list of all employees in the database.

## GET /employees/{id}
Returns an employee with the given ID.

## POST /employees
Creates a new employee record in the database.

## PUT /employees/{id}
Updates an employee record with the given ID.

## DELETE /employees/{id}
Deletes an employee record with the given ID.

## POST /ads
Creates a new ad record in the database.

## DELETE /ads/{id}
Deletes an ad record with the given ID.

## Testing
You can use Postman (or any REST client) to test the API endpoints. Here are some example requests:

## GET http://localhost:8085
![image](https://user-images.githubusercontent.com/86216867/235128937-c5e38fdd-c222-4761-9f82-4af95f39ce18.png)


## POST http://localhost:8085/save
![image](https://user-images.githubusercontent.com/86216867/235129116-f767b59e-95b8-451e-8087-fac6b0e220a2.png)

## PUT http://localhost:8085/update/{id}

DELETE http://localhost:8080/delete/1

POST http://localhost:8080/ads (with request body containing ad data)

DELETE http://localhost:8080/ads/1

Conclusion
That's it! You now have a basic employee management system API up and running. Feel free to modify the code and add more features as per your requirements.




