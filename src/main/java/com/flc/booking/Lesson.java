/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.flc.booking;

/**
 *
 * @author rd25aat
 */
import java.util.ArrayList;
public class Lesson {
    private int lessonId;
    private Exercise exercise;
    private String day;
    private String timeSlot;
    private int weekendNumber;
    private ArrayList<Member>members;
    private ArrayList<Review>reviews;
    private final int MAX_CAP = 4;
    
    public Lesson(int lessonId, Exercise exercise, String day, String timeSlot, int weekendNumber){
        this.lessonId = lessonId;
        this.exercise = exercise;
        this.day = day;
        this.timeSlot = timeSlot;
        this.weekendNumber = weekendNumber;
        
        members = new ArrayList<>();
        reviews = new ArrayList<>();
    }
    
    public boolean addMember(Member member){
        if(isFull())
            return false;
        members.add(member);
        return true;
    }
    
    public void removeMember(Member member){
        members.remove(member);
    }
    
    public boolean isFull(){
        return members.size()>= MAX_CAP;
    }
    
    public void addReview(Review review){
        reviews.add(review);
    }
    
    public double getAverageRating(){
        if(reviews.isEmpty())
            return 0;
        int sum = 0;
        for(Review r : reviews){
            sum += r.getRating();
        }
        return (double) sum / reviews.size();
    }
    
    public double getTotalIncome(){
        return members.size() * exercise.getPrice();
    }
    
    public int getLessonId(){
        return lessonId;
    }
    
    public Exercise getExercise(){
        return exercise;
    }
    
    public String getDay(){
        return day;
    }
    
    public String getTimeSlot(){
        return timeSlot;
    }
    
    public int getWeekendNumber(){
        return weekendNumber;
    }
    
    public int getNumberofMembers(){
        return members.size();
    }  
    
        public ArrayList<Member>getMembers(){
        return members;
    }
    

    
    @Override
    public String toString(){
        return "ID:" +lessonId +
                "|" + exercise.getName()+
                "|" +day +
                "|" +timeSlot +
                "|Weekend" +weekendNumber;
    }
}
