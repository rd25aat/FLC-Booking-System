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
public class TimetableTest {
    
    public TimetableTest() {
    }
    
    @Test
    public void testAddLesson() {

        Timetable timetable = new Timetable();

        Exercise exercise = new Exercise("Yoga", 10);
        Lesson lesson = new Lesson(1, exercise, "Saturday", "Morning", 1);

        timetable.addLesson(lesson);
        assertEquals(1, timetable.getAllLessons().size());
    }
    
    @Test
    public void testFindLessonById() {

        Timetable timetable = new Timetable();

        Lesson lesson = new Lesson(2, new Exercise("Zumba", 12), "Sunday", "Evening", 1);
        timetable.addLesson(lesson);

        Lesson found = timetable.findLessonById(2);

        assertNotNull(found);
        assertEquals(2, found.getLessonId());
    }
    
    @Test
    public void testFindLessonByIdNotFound() {

        Timetable timetable = new Timetable();

        Lesson found = timetable.findLessonById(56);

        assertNull(found);
    }
    
    @Test
    public void testMultipleLessons() {

        Timetable timetable = new Timetable();

        timetable.addLesson(new Lesson(3, new Exercise("Yoga", 10), "Saturday", "Morning", 1));
        timetable.addLesson(new Lesson(4, new Exercise("Box Fit", 14), "Sunday", "Afternoon", 1));

        assertEquals(2, timetable.getAllLessons().size());
    }
    
    @Test
    public void testLessonListNotNull() {

        Timetable timetable = new Timetable();

        assertNotNull(timetable.getAllLessons());
    }
  
}
