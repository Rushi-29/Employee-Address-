Employee_Address
================

> ### [](https://github.com/Rushi-29/Employee-Address#prerequisites)Prerequisites

-   [![MySql](https://camo.githubusercontent.com/ba7cdc426003905af438f0938e0890b3437e590d2c249d671115d19ca32b5df6/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f44424d532d4d5953514c253230352e372532306f722532304869676865722d726564)](https://camo.githubusercontent.com/ba7cdc426003905af438f0938e0890b3437e590d2c249d671115d19ca32b5df6/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f44424d532d4d5953514c253230352e372532306f722532304869676865722d726564)

-   [![SpringBoot](https://camo.githubusercontent.com/a6677a4ec12bd03f835c62db09a8db96a6d726afe3985c8fbf5c43db9b6cb8ad/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4672616d65776f726b2d537072696e67426f6f742d677265656e)](https://camo.githubusercontent.com/a6677a4ec12bd03f835c62db09a8db96a6d726afe3985c8fbf5c43db9b6cb8ad/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4672616d65776f726b2d537072696e67426f6f742d677265656e)

-   [![Java](https://camo.githubusercontent.com/be815b7d90eac640a950b5ef6e2bd93f30cab6ac1cd9ace277bc560e3e6fc11c/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4c616e67756167652d4a617661253230382532306f722532306869676865722d79656c6c6f77)](https://camo.githubusercontent.com/be815b7d90eac640a950b5ef6e2bd93f30cab6ac1cd9ace277bc560e3e6fc11c/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4c616e67756167652d4a617661253230382532306f722532306869676865722d79656c6c6f77)

> [](https://github.com/Rushi-29/Employee-Address#getting-started)Getting started
> -----------------------------------------------------------------------------------------------

-   Clone the repository to your local machine.
-   Create a MySQL database and update the application.properties file with the database credentials and connection details.
-   Build the project using Maven: mvn clean install
-   Run the application using java -jar target/employee-management-system-0.0.1-SNAPSHOT.jar
-   Access the APIs using any HTTP client such as Postman or cURL.

> [](https://github.com/Rushi-29/Employee-Address#data-flow)Data flow
> -----------------------------------------------------------------------------------

In this project, we have four layers-

-   Controller - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
-   Service -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
-   Repository - This layer mainatains the h2-database thing on which CRUD operations are performed
-   Model - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

> [](https://github.com/Rushi-29/Employee-Address#api-documentation)API Documentation
> ---------------------------------------------------------------------------------------------------

The following APIs are provided by the application:

Employee APIs

-   GET /employees - get all employees
-   GET /employees/{id} - get an employee by id
-   POST /employees - create a new employee
-   PUT /employees/{id} - update an employee by id
-   DELETE /employees/{id} - delete an employee by id

Address APIs

-   GET /addresses - get all addresses
-   GET /addresses/{id} - get an address by id
-   POST /addresses - create a new address
-   PUT /addresses/{id} - update an address by id
-   DELETE /addresses/{id} - delete an address by id

### [](https://github.com/Rushi-29/Employee-Address#request-and-response-formats)Request and Response Formats

The APIs expect and return data in JSON format.

> [](https://github.com/satyam1459/EmployeeAddressOneToOneMapping#project-summary)Project Summary
> -----------------------------------------------------------------------------------------------

This project demonstrates the basic usage of Spring Boot and Hibernate to build a RESTful API for managing employees and addresses. Further enhancements can be made to add authentication and authorization, error handling, pagination, etc.
