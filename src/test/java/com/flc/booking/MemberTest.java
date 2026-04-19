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
public class MemberTest {
    
    public MemberTest() {
    }
    
     @Test
    public void testMemberCreation() {

        Member member = new Member(1, "Raju");

        assertNotNull(member);
        assertEquals(1, member.getMemberId());
        assertEquals("Raju", member.getName());
   
    }
    
     @Test
    public void testBookLessonSuccess() {

        Member member = new Member(2, "Nirjona");
        Lesson lesson = new Lesson(1, new Exercise("Yoga", 10), "Saturday", "Morning", 1);

        boolean result = member.bookLesson(lesson);

        assertTrue(result);
        assertEquals(1, member.getBookings().size());
    }
    
    @Test
    public void testTimeConflictBooking() {

        Member member = new Member(4, "Raju");

        Lesson l1 = new Lesson(3, new Exercise("Yoga", 10), "Saturday", "Morning", 1);
        Lesson l2 = new Lesson(4, new Exercise("Zumba", 12), "Saturday", "Morning", 1);

        member.bookLesson(l1);
        boolean result = member.bookLesson(l2);

        assertFalse(result); 
        assertEquals(1, member.getBookings().size());
    }
    
    @Test
    public void testDifferentTimeBookingAllowed() {

        Member member = new Member(5, "Steven");

        Lesson l1 = new Lesson(5, new Exercise("Yoga", 10), "Saturday", "Morning", 1);
        Lesson l2 = new Lesson(6, new Exercise("Zumba", 12), "Saturday", "Evening", 1);

        boolean r1 = member.bookLesson(l1);
        boolean r2 = member.bookLesson(l2);

        assertTrue(r1);
        assertTrue(r2);
        assertEquals(2, member.getBookings().size());
    }
    
    
    @Test
    public void testBookingsArray() {

        Member member = new Member(6, "Test");

        Lesson l1 = new Lesson(7, new Exercise("Yoga", 10), "Sunday", "Morning", 2);
        Lesson l2 = new Lesson(8, new Exercise("Box Fit", 14), "Sunday", "Afternoon", 2);

        member.bookLesson(l1);
        member.bookLesson(l2);

        Booking[] expected = member.getBookings().toArray(new Booking[0]);
        Booking[] actual = member.getBookings().toArray(new Booking[0]);

        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testBookingContainsCorrectLesson() {

        Member member = new Member(8, "Check");

        Lesson lesson = new Lesson(9, new Exercise("Aquacise", 15), "Sunday", "Evening", 3);

        member.bookLesson(lesson);

        Booking booking = member.getBookings().get(0);
        assertEquals(lesson, booking.getLesson());
        
    }  
}
