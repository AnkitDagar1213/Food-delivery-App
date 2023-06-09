# Food-Delivery-App

## Frameworks and Language Used:

-Java

-Spring Boot

-Spring Data JPA

-MySQL

-Swagger UI

## Data Flow:

### Controllers:

UserController: Handles creating user and fetching data about user by its id and fetching all users.

AdminController: Handles creating admin and doing CRUD operations for FoodItem. Only admin role can perform CRUD operations on FoodItems.

RestaurantController: Handles creating restaurant and fetching data about restaurant by its id and fetching all restaurants.

OrderController: Handles creating order and fetching data about order by user id and fetching all orders.

### Services:

UserService: Handles User data to make order.

AdminService: Handles Admin power to create,delete,update and get fooditems data.

RestaurantService: Handles Restaurant-related business logic.

OrderService: Handles Order made by user business logic.

FoodItemService: Handles FoodItem-related business logic.

### Repository:

UserRepository: Communicates with the database for user-related operations.

AdminRepository: Communicates with the database for Admin-related operations.

RestaurantRepository: Communicates with the database for Restaurant-related operations

OrderRepository: Communicates with the database for Order-related operations.

FoodItemRepository: Communicates with the database for FoodItem-related operations.

## Database Design:

User table: Contains user details such as user_id, name, email, address, and phone number.

Admin table: Contains Admin details such as Admin_id, username, password, email, phone number, food list and orderList.

Restaurant table: Contains the Restaurant details such as name, address and fooditems.

Order table: Contains the order details such as Order_id, FoodItem_id and User_id.

FoodItem table: Contains the FoodItem details such as FoodItem_id, name and description.

## Data Structure:

List - Used for returning a list of products.

## Project Summary:
This project is Food Delivery that allows users to make order from restaurant. Users can also fetch the order history. Admin has the power of CRUD operation on food items. The project is built using Java and Spring Boot, with a MySQL database to store data. 
The Swagger UI is used to provide an interactive API documentation. 

The project is deployed on EC2 instance and can be accessed through the following link:[http://13.233.118.191:8080/swagger-ui/index.html#/]
