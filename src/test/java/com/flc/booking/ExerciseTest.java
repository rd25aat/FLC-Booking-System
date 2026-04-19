/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.flc.booking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rd25aat
 */
public class ExerciseTest {
    
    public ExerciseTest() {
    }
    
    @Test
    public void testExerciseCreation(){
        Exercise exercise = new Exercise("Yoga", 10);
        
        assertNotNull(exercise);
        assertEquals("Yoga", exercise.getName());
        assertEquals(10, exercise.getPrice());
    }
    
    @Test
    public void testGetName(){
        Exercise exercise = new Exercise("Zumba", 12);
        
        assertEquals("Zumba", exercise.getName());
    }
   
    
}
