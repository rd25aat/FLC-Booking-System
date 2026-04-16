/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.flc.booking;

/**
 *
 * @author rd25aat
 */
import java.util.*;

public class Report {

    private Timetable timetable;

    public Report(Timetable timetable) {
        this.timetable = timetable;
    }

    // REPORT 1
    // Members per lesson and Average rating
    public void generateLessonReport() {

        System.out.println("\n===== LESSON REPORT =====");

        for (Lesson l : timetable.getAllLessons()) {

            System.out.println(
                "Lesson ID: " + l.getLessonId() +
                " | " + l.getExercise().getName() +
                " (£" + l.getExercise().getPrice() + ")" +
                " | " + l.getDay() +
                " | " + l.getTimeSlot() +
                " | Week: " + l.getWeekendNumber()
            );

            System.out.println("Members: " + l.getMembers().size());
            System.out.println("Average Rating: " + l.getAverageRating());
            System.out.println("----------------------------");
        }
    }

    // REPORT 2 
    // Highest income exercise
    public void generateHighestIncomeReport() {

        System.out.println("\n===== HIGHEST INCOME EXERCISE =====");

        HashMap<String, Double> incomeMap = new HashMap<>();

        for (Lesson l : timetable.getAllLessons()) {

            String exName = l.getExercise().getName();
            double income = l.getTotalIncome();

            incomeMap.put(exName, incomeMap.getOrDefault(exName, 0.0) + income);
        }

        String bestExercise = "";
        double maxIncome = 0;

        for (Map.Entry<String, Double> entry : incomeMap.entrySet()) {
            if (entry.getValue() > maxIncome) {
                maxIncome = entry.getValue();
                bestExercise = entry.getKey();
            }
        }

        System.out.println("Exercise: " + bestExercise);
        System.out.println("Total Income: £" + maxIncome);
    }
}