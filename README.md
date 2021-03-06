# Liv2Traincenter
First API
? Create a POST api to create and save a new training center with the following
fields.
? CenterName (text)* (less than 40 characters)
? CenterCode (text)* (exactly 12 character alphanumeric)
? Address (object)*
¦ Detailed Address
¦ City
¦ State
¦ Pincode
? Student Capacity (number)
? Courses Offered (List<text>)
? CreatedOn (Epoch time generated by System, not by user)
? ContactEmail (text) (If present, email should be validated)
? ContactPhone (text)* (Phone number validation )
? Api should accept data in json.
? Validations for mandatory fields should be done, along with phone, email and size
validations wherever mentioned in the aforementioned fields should be done
? As mentioned above with the fields, createdOn field should be populated from the
server based on the server timestamp, and the user’s input if present for this field
should be discarded.
? On validation failure, an appropriate error message should be shown. This should
be handled by Spring ExceptionHandler.
? On success, the api should return the newly saved TraningCenter information in
json format
Second API
? Create a GET api to get list of all stored training centers information.
? Api should return the result in json format.
? In the absence of any training centers, we need to return an empty list in response.

step 1: using spring initializer create a project using dependencies

Dependencies: Lombok - To avoid manually writing getter and setter 
	      Spring web - to export REST api
	      mySQL Driver - MySQL JDBC and R2DBC driver
	      Spring Data JPA - data in SQL with java API
	      Validation - validation with hibernate validator

step 2: create a schema in MySQL workbench and get the schema name for later use. 
Note: if local server is not responding use XXAMP control panel and start MySQL and restart the MySQL workbench, connection is established successfully with the local server.

step 3: run the application after creating packages and run the java application along with the workbench running in the background.

Application properties to note:
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/traincenter
spring.datasource.username=root
spring.datasource.password=
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
server.port=9191

traincenter is the database name.

the applicaiton should run successfully with the database connected.

step 4: open Insomnia for API testing.

Post: http://localhost:9191/addTrainDetail
Get:  http://localhost:9191/trainDetails

json body:

{
	"id": 123434,
	"CenterName":"naveennaveen",
	"Email":"naveenkumawat.3599@gmail.com",
	"capacity":34,
	"code":21,
	"date":"august 2021",
	"phone":9082166102,
	"address": [],
	"course": []
}
