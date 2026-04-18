/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.flc.booking;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rd25aat
 */
public class BookingTest {
    
    public BookingTest() {
    }
    
    @Test
    public void testBookingCreation(){
        Exercise exercise = new Exercise("Yoga",10);
        Lesson lesson = new Lesson(1, exercise, "Saturday", "Morning", 1);
        Member member = new Member(1, "Raju");
        Booking booking = new Booking(member, lesson);
        assertNotNull(booking);
        assertEquals(member, booking.getMember());
        assertEquals(lesson, booking.getLesson());
    }
    
    @Test
    public void testBookingMemberLink(){
        Exercise exercise = new Exercise("Zumba", 12);
        Lesson lesson = new Lesson(2, exercise, "Sunday", "Evening", 1);
        Member member = new Member(2, "David");
        
        Booking booking = new Booking(member, lesson);
        
        assertEquals("David", booking.getMember().getName());
        assertEquals(2, booking.getMember().getMemberId());
        
    }
    
    @Test
    public void testBookingLessonDetails(){
        Exercise exercise = new Exercise("Box Fit", 14);
        Lesson lesson = new Lesson(3, exercise, "Saturday", "Afternoon", 2);
        Member member = new Member(3, "Nirjona");

        Booking booking = new Booking(member, lesson);

        assertEquals("Box Fit", booking.getLesson().getExercise().getName());
        assertEquals(14, booking.getLesson().getExercise().getPrice());
        assertEquals("Saturday", booking.getLesson().getDay());
        
    }
    
    @Test
     public void testMultipleBookingsAllowed() {

        Exercise exercise = new Exercise("Yoga", 10);
        Lesson lesson1 = new Lesson(4, exercise, "Saturday", "Morning", 1);
        Lesson lesson2 = new Lesson(5, exercise, "Sunday", "Morning", 1);

        Member member = new Member(4, "Raju");

        Booking b1 = new Booking(member, lesson1);
        Booking b2 = new Booking(member, lesson2);

        assertNotEquals(b1.getLesson(), b2.getLesson());
    }
    
}
