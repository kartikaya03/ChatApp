# ChatApp

# ChatApp Backend

## Overview
The backend of **ChatApp** is a robust and scalable server-side application built using **Spring Boot**. It provides real-time messaging, user authentication, and chat room management, ensuring a seamless communication experience.

## Features
- User authentication and authorization
- Real-time messaging using WebSockets
- Chat room creation and management
- Message history storage
- Secure data handling with JWT authentication
- **New Feature: Typing Indicator** - Real-time user typing status updates

## Tech Stack
- **Language:** Java
- **Framework:** Spring Boot
- **Database:** MongoDB 
- **Communication:** WebSockets

## Installation & Setup
### Prerequisites
- Java 23
- Maven
- MongoDB 

### Steps to Run Locally
1. **Clone the repository:**
   ```sh
   git clone https://github.com/kartikaya03/ChatApp.git
   cd ChatApp/backend
   ```
2. **Configure Environment Variables**
   - Set up `application.properties` or `application.yml` for database and JWT settings.

3. **Build and Run the Application:**
   ```sh
   mvn spring-boot:run
   ```

4. **Access the API**
   - The backend will be available at `http://localhost:8081`

## API Endpoints
### Messaging
-  @MessageMapping("/sendMessage/{roomId}")// /app/sendMessage/roomId
-  @SendTo("/topic/room/{roomId}")//subscribe

### Chat Rooms
- **POST** ` @PostMapping("/Id")` - Create a new chat room
- **GET** `@GetMapping("/Id/{roomId}")` - Get user-specific chat rooms
- **GET** `@GetMapping("/Id/{roomId}/message")` - Get chatroom message


## Contributing
1. Fork the repository
2. Create a new branch (`feature-branch`)
3. Commit changes
4. Open a Pull Request

## License
This project is licensed under the **MIT License**.

## Contact
For any queries, reach out to **[reachoutkartikaya@gmail.com]** or create an issue in the repository.

