/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.flc.booking;

/**
 *
 * @author ASUS
 */
public class Booking {
    private Member member;
    private Lesson lesson;
    
    public Booking (Member member, Lesson lesson){
        this.member = member;
        this.lesson = lesson;
    }
    public Member getMember(){
        return member;
    }
    public Lesson getLesson(){
        return lesson;
    }
}

