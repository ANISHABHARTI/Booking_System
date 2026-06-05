Global Class Offering Booking System
        Tech Stack
Java
Spring Boot
PostgreSQL
        Features
Teacher Management
Parent Management
Course Management
Offering Management
Session Management
Booking Management
Time Conflict Detection
Timezone Support
      APIs
Teacher APIs
POST /teachers
GET /teachers
Parent APIs
POST /parents
GET /parents
Course APIs
POST /courses
GET /courses
Offering APIs
POST /offerings
GET /offerings
Session APIs
POST /sessions
Booking APIs
POST /bookings
GET /bookings/parent/{id}
    Concurrency Handling

Implemented using Spring Transaction Management (@Transactional).

Conflict Detection

A parent cannot book an offering if any session overlaps with sessions from previously booked offerings.
