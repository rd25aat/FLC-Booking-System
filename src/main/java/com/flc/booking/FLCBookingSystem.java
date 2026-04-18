
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author rd25aat
 */
package com.flc.booking;

import java.util.*;

public class FLCBookingSystem {

    private ArrayList<Member> members;
    private Timetable timetable;
    private Scanner scanner;
    private Report report;

    public FLCBookingSystem() {
        members = new ArrayList<>();
        timetable = new Timetable();
        scanner = new Scanner(System.in);
        initializeData();
        report = new Report(timetable);
    }

    private void initializeData() {

        Exercise yoga = new Exercise("Yoga", 10);
        Exercise zumba = new Exercise("Zumba", 12);
        Exercise aquacise = new Exercise("Aquacise", 15);
        Exercise boxfit = new Exercise("Box Fit", 14);

        Exercise[] exercises = {yoga, zumba, aquacise, boxfit};
        String[] days = {"Saturday", "Sunday"};
        String[] times = {"Morning", "Afternoon", "Evening"};

        int id = 1;

        for (int weekend = 1; weekend <= 8; weekend++) {
            for (String day : days) {
                for (String time : times) {

                    Exercise ex = exercises[new Random().nextInt(exercises.length)];
                    timetable.addLesson(new Lesson(id++, ex, day, time, weekend));
                }
            }
        }

        // Create members
        for (int i = 1; i <= 10; i++) {
            members.add(new Member(i, "Member" + i));
        }
    }

    

    public static void main(String[] args) {

        
        System.out.println("FLC Booking Management System");


        FLCBookingSystem system = new FLCBookingSystem();
    
    }
}