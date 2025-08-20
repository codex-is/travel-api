# 🌍 Travel API  

This is a simple **Spring Boot CRUD REST API** for managing tour packages.  

---

## 🚀 Features
- ➕ Create a new tour package  
- 📄 Fetch all tour packages  
- 🔍 Search tours by location  
- 🆔 Fetch a tour package by ID  

---

## 🛠️ Tech Stack
- **Java 21**  
- **Spring Boot 3.x**  
- **Spring Web** (REST API)  
- **Spring Data JPA**  
- **H2 / MySQL** (configurable)  
- **Maven**  

---

## 📡 API Endpoints

**Base URL:**  
http://localhost:8080/tours


---
```json
Create Tour Package  
POST/tours

Request Body:

{
  "image": "https://images.unsplash.com/photo-1598275277521-1885382d523a",
  "discountInPercentage": "17%",
  "title": "Himalayan Trek Adventure",
  "description": "14-day trek through the Himalayas",
  "duration": "14Days/13Nights",
  "actualPrice": "$1200",
  "discountedPrice": "$1000",
  "location": "Leh"
}
Response (201 Created):

{
  "id": 1,
  "title": "Himalayan Trek Adventure",
  "location": "Leh",
  "discountedPrice": "$1000"
}
 
```
```json
Get All Tour Packages
GET /tours

Response (200 OK):


[
  {
    "id": 1,
    "title": "Himalayan Trek Adventure",
    "location": "Leh",
    "discountedPrice": "$1000"
  }
]
```
```json
Search Tour Packages by Location
GET /tours?location=Leh

Response (200 OK):

[
  {
    "id": 1,
    "title": "Himalayan Trek Adventure",
    "location": "Leh",
    "discountedPrice": "$1000"
  }
]
```
```json
Get Tour Package by ID
GET /tours/{id}

Example:


GET /tours/1
Response (200 OK):


{
  "id": 1,
  "image": "https://images.unsplash.com/photo-1598275277521-1885382d523a",
  "discountInPercentage": "17%",
  "title": "Himalayan Trek Adventure",
  "description": "14-day trek through the Himalayas",
  "duration": "14Days/13Nights",
  "actualPrice": "$1200",
  "discountedPrice": "$1000",
  "location": "Leh"
}
If not found → 404 Not Found
```

 **Status Codes**
200 OK – Successful request

201 Created – Successfully created a new tour

404 Not Found – Tour not found

📌 Notes
Authentication/Security is disabled for simplicity.

Database can be configured via application.properties.


👨‍💻 Author
Harsh Pardeshi

