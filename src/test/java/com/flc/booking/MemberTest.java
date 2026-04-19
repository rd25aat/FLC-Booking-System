/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.flc.booking;

import java.util.ArrayList;
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
public class MemberTest {
    
    public MemberTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of hasTimeConflict method, of class Member.
     */
    @Test
    public void testHasTimeConflict() {
        System.out.println("hasTimeConflict");
        Lesson lesson = null;
        Member instance = null;
        boolean expResult = false;
        boolean result = instance.hasTimeConflict(lesson);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bookLesson method, of class Member.
     */
    @Test
    public void testBookLesson() {
        System.out.println("bookLesson");
        Lesson lesson = null;
        Member instance = null;
        boolean expResult = false;
        boolean result = instance.bookLesson(lesson);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelBooking method, of class Member.
     */
    @Test
    public void testCancelBooking() {
        System.out.println("cancelBooking");
        Lesson lesson = null;
        Member instance = null;
        instance.cancelBooking(lesson);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMemberId method, of class Member.
     */
    @Test
    public void testGetMemberId() {
        System.out.println("getMemberId");
        Member instance = null;
        int expResult = 0;
        int result = instance.getMemberId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Member.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Member instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookings method, of class Member.
     */
    @Test
    public void testGetBookings() {
        System.out.println("getBookings");
        Member instance = null;
        ArrayList<Booking> expResult = null;
        ArrayList<Booking> result = instance.getBookings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Member.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Member instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
