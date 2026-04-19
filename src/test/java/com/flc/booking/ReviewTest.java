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
public class ReviewTest {
    
    public ReviewTest() {
    }
    
     @Test
    public void testReviewCreation() {

        Member member = new Member(1, "Raju");
        Review review = new Review(member, 5, "Very Satisfied");

        assertNotNull(review);
        assertEquals(5, review.getRating());
        assertEquals("Very Satisfied", review.getComment());
        assertEquals(member, review.getMember());
    }
    
    @Test
    public void testGetRating() {

        Review review = new Review(new Member(2, "Raju"), 4, "Impressive");

        assertEquals(4, review.getRating());
    }
    
     @Test
    public void testGetComment() {

        Review review = new Review(new Member(3, "Nirjona"), 3, "Average");

        assertEquals("Average", review.getComment());
    }
    
     
}
