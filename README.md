# Spring Boot Hello World Application

This is a simple Spring Boot application that provides various endpoints to demonstrate basic REST API functionality.

## Endpoints

### 1. UC1 - GetMethod (Default Welcome Message)
**URL:** `GET http://localhost:8080/` OR `GET http://localhost:8080/home`

**Description:** Returns a simple welcome message.

```json
Hello From Abhay this is my first spring boot application! ! !
```

---

### 2. UC2 - Query Parameters
**URL:** `GET http://localhost:8080/query?name=Abhay`

**Description:** Accepts a name as a query parameter and returns a personalized greeting message.

**Example Response:**
```json
Hello Abhay Thanks for using my application
```

---

### 3. UC3 - Path Parameters
**URL:** `GET http://localhost:8080/{name}`

**Description:** Accepts a name as a path parameter and returns a personalized greeting message.

**Example Request:**
```sh
GET http://localhost:8080/Abhay
```

**Example Response:**
```json
Hello Abhay Thanks for using my application
```

---

### 4. UC4 - PostMethod (Accepts JSON Data)
**URL:** `POST http://localhost:8080/post`

**Description:** Accepts a `User` object in the request body and returns a greeting message.

**Example Request Body:**
```json
{
  "firstName": "Abhay",
  "lastName": "Kumar"
}
```

**Example Response:**
```json
Hello Abhay Kumar Thanks for using my application
```

---

### 5. UC5 - PutMethod (Update User Data)
**URL:** `PUT http://localhost:8080/put`

**Description:** Accepts a `User` object in the request body and returns an updated greeting message.

**Example Request Body:**
```json
{
  "firstName": "Abhay",
  "lastName": "Goyal"
}
```

**Example Response:**
```json
Hello Abhay Goyal Thanks for using my application
```

---

## URL

- The application will start on `http://localhost:8080/`

---

## Requirements
- Java 8 or higher
- Maven
- Spring Boot

---

