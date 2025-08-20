# 🌍 Travel API (MapMyTour Internship Assignment)

This is a simple **Spring Boot CRUD REST API** for managing tour packages.  
It was developed as part of the **MapMyTour internship assignment**.  

---

## 🚀 Features
- Create a new tour package  
- Fetch all tour packages  
- Search tours by location  
- Fetch tour package by ID  

---

## 🛠️ Tech Stack
- **Java 21**  
- **Spring Boot 3.x**  
- **Spring Web** (REST API)  
- **Spring Data JPA**  
- **H2 / MySQL** (configurable)  
- **Maven**  

---



http://localhost:8080/tours
📡 API Endpoints
1. Create Tour Package
POST /tours
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
Response: 201 Created

{
  "id": 1,
  "title": "Himalayan Trek Adventure",
  "location": "Leh",
  "discountedPrice": "$1000"
}
2. Get All Tour Packages
GET /tours
Response: 200 OK


[
  {
    "id": 1,
    "title": "Himalayan Trek Adventure",
    "location": "Leh",
    "discountedPrice": "$1000"
  }
]
3. Search Tour Packages by Location
GET /tours?location=Leh
Response: 200 OK


[
  {
    "id": 1,
    "title": "Himalayan Trek Adventure",
    "location": "Leh",
    "discountedPrice": "$1000"
  }
]
4. Get Tour Package by ID
GET /tours/{id}
Example:


GET /tours/1
Response: 200 OK (if found)


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
If not found: 404 Not Found

✅ Status Codes
200 OK – Successful request

201 Created – Successfully created a new tour

404 Not Found – Tour not found

📌 Notes
For simplicity, authentication/security has been disabled.

Database can be configured via application.properties.

📧 Author
Harsh Pardeshi


