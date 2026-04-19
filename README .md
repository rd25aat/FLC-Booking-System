### **FLC BOOKING MANAGEMENT SYSTEM**



**Overview**: A Java-based program called the FLC Booking System was created to handle bookings for group exercise classes at a fitness and leisure facility. Members can view lessons that are available, make reservations, write reviews, and generate reports.



**Features**: 

* View lesson timetable (day, time, exercise, price)
* Book lessons with capacity and time conflict checks
* Add reviews with ratings and comments
* View member details (ID and name)
* Generate reports:
* Lesson report (members, ratings, price)
* Highest income exercise



**Assumptions**

* Maximum 4 members per lesson
* Members cannot book overlapping lessons
* Each lesson has one exercise type
* Data is stored in memory (no external database)
* Ratings are between (1 and 5)



**System Structure**



The system is built using object-oriented principles with the following main classes:



* FLCBookingSystem – Main controller and menu handling
* Member – Stores member information and bookings
* Lesson – Represents a scheduled class
* Booking – Links members to lessons
* Exercise – Stores exercise name and price
* Review – Stores ratings and comments
* Timetable – Manages all lessons
* Report – Generates reports



**Testing**: JUnit 5 is used for testing key classes.



* LessonTest
* MemberTest
* BookingTest
* ExerciseTest



**Author**

Raju Dey

Software Engineering Student, University of Hertfordshire



**This project is developed for academic purposes.**



