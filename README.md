# Food-Delivery-App

## Frameworks and Language Used:

-Java

-Spring Boot

-Spring Data JPA

-MySQL

-Swagger UI

## Data Flow:

### Controllers:

UserController: Handles requests related to user authentication and CRUD operations for users.

AdminController: Handles CRUD operations for songs. Only users with admin role can perform CRUD operations.

RestaurantController: Handles CRUD operations for playlists. Only users with user role can perform CRUD operations.

OrderController: Handles CRUD operations for playlists. Only users with user role can perform CRUD operations.

### Services:

UserService: Handles User data to make order

AdminService: Handles Admin power to create,delete,update and get fooditems data 

RestaurantService: Handles Restaurant-related business logic

OrderService: Handles Order made by user business logic

FoodItemService: Handles FoodItem-related business logic

### Repository:

UserRepository: Communicates with the database for user-related operations

AdminRepository: Communicates with the database for Admin-related operations

RestaurantRepository: Communicates with the database for Restaurant-related operations

OrderRepository: Communicates with the database for Order-related operations

FoodItemRepository: Communicates with the database for FoodItem-related operations

## Database Design:

User table: Contains user details such as name, email, password, and phone number

Admin table: Contains chat messages between users, along with the sender and receiver IDs

Restaurant table: Contains the status details such as status name and description

Order table: Contains the status details such as status name and description

FoodItem table: Contains the status details such as status name and description

## Data Structure:

List - Used for returning a list of products.

## Project Summary:
This project is Food Delivery that allows users to make order from restaurant. Users can also fetch the order history. Admin has the power of CRUD operation on food items. The project is built using Java and Spring Boot, with a MySQL database to store data. 
The Swagger UI is used to provide an interactive API documentation. 

The project is deployed on EC2 instance and can be accessed through the following link:[http://13.233.118.191:8080/swagger-ui/index.html#/]
