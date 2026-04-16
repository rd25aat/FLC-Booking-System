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

public class Timetable {

   private ArrayList<Lesson> lessons;

    public Timetable() {
        lessons = new ArrayList<>();
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public ArrayList<Lesson> getLessonsByDay(String day) {

        ArrayList<Lesson> result = new ArrayList<>();

        for (Lesson l : lessons) {
            if (l.getDay().equalsIgnoreCase(day)) {
                result.add(l);
            }
        }
        return result;
    }

    public ArrayList<Lesson> getLessonsByExercise(String name) {

        ArrayList<Lesson> result = new ArrayList<>();

        for (Lesson l : lessons) {
            if (l.getExercise().getName().equalsIgnoreCase(name)) {
                result.add(l);
            }
        }
        return result;
    }

    public ArrayList<Lesson> getAllLessons() {
        return lessons;
    }

    public Lesson findLessonById(int id) {
        for (Lesson l : lessons) {
            if (l.getLessonId() == id) return l;
        }
        return null;
    }

    }