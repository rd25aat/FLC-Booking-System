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
public class LessonTest {
    
    public LessonTest() {
    }
    
    @Test
    public void testLessonCreation() {

        Exercise exercise = new Exercise("Yoga", 10);
        Lesson lesson = new Lesson(1, exercise, "Saturday", "Morning", 1);

        assertNotNull(lesson);
        assertEquals(1, lesson.getLessonId());
        assertEquals("Yoga", lesson.getExercise().getName());
        assertEquals(10, lesson.getExercise().getPrice());
        assertEquals("Saturday", lesson.getDay());
        assertEquals("Morning", lesson.getTimeSlot());
        assertEquals(1, lesson.getWeekendNumber());
    }
    
    @Test
    public void testAddMemberSuccess() {

        Lesson lesson = new Lesson(2, new Exercise("Zumba", 12), "Sunday", "Evening", 1);
        Member m = new Member(1, "Raju");

        boolean added = lesson.addMember(m);

        assertTrue(added);
        assertNotNull(lesson.getMembers());
        assertEquals(1, lesson.getMembers().size());
        assertTrue(lesson.getMembers().contains(m));
    }
    
    @Test
    public void testLessonCapacityLimit() {

        Lesson lesson = new Lesson(3, new Exercise("Box Fit", 14), "Saturday", "Afternoon", 2);

        lesson.addMember(new Member(1, "A"));
        lesson.addMember(new Member(2, "B"));
        lesson.addMember(new Member(3, "C"));
        lesson.addMember(new Member(4, "D"));

        boolean added = lesson.addMember(new Member(5, "E"));

        assertFalse(added);
        assertEquals(4, lesson.getMembers().size());
    }
    
     @Test
     public void testDuplicateMemberNotAllowed() {

        Lesson lesson = new Lesson(4, new Exercise("Yoga", 10), "Sunday", "Morning", 2);
        Member m = new Member(1, "Same");

        lesson.addMember(m);
        boolean addedAgain = lesson.addMember(m);
        
        assertFalse(addedAgain);
        assertEquals(1, lesson.getMembers().size());
    }
     
     @Test
    public void testAddReviewAndAverageRating() {

        Lesson lesson = new Lesson(5, new Exercise("Aquacise", 15), "Saturday", "Evening", 3);

        Member m1 = new Member(1, "A");
        Member m2 = new Member(2, "B");

        lesson.addReview(new Review(m1, 5, "Very Satisfied"));
        lesson.addReview(new Review(m2, 3, "Okay"));

        double avg = lesson.getAverageRating();

        assertEquals(4.0, avg);
        assertTrue(avg >= 1 && avg <= 5);
    }
    
}
