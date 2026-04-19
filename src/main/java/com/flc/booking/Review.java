/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.flc.booking;

/**
 *
 * @author rd25aat
 */
public class Review {
    private Member member;
    private int rating;
    private String comment;
    
    public Review(Member member, int rating, String comment){
        if (rating < 1 || rating > 5){
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
        this.member = member;
        this.rating = rating;
        this.comment = comment;
    }
    
    public int getRating(){
        return rating;
    }
    
    public String getComment(){
        return comment;
    }
    
    public Member getMember(){
        return member;
    }
}
