
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
    
    private Member findMember(int id){
        for(Member m : members){
            if(m.getMemberId() == id)
                return m;
        }
        return null;
    }
    
    private void viewMembers(){
        System.out.println("**MEMBER LIST**");
        for(Member m : members){
            System.out.println("ID:" + m.getMemberId() +
                    " | Name: " + m.getName());
        }
    }
    
     private void viewReports() {
        report.generateLessonReport();
        report.generateHighestIncomeReport();
    }
     
     private void bookLesson() {

        System.out.print("Enter Member ID: ");
        int mId = scanner.nextInt();

        Member member = findMember(mId);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        System.out.print("Enter Lesson ID: ");
        int lId = scanner.nextInt();

        Lesson lesson = timetable.findLessonById(lId);

        if (lesson == null) {
            System.out.println("Lesson not found.");
            return;
        }

        if (member.bookLesson(lesson)) {
            System.out.println("Booking successful!");
        } else {
            System.out.println("Booking failed (Full/Time Conflict).");
        }
    }
     
     private void addReview() {

        System.out.print("Enter Member ID: ");
        int mId = scanner.nextInt();
        Member member = findMember(mId);

        System.out.print("Enter Lesson ID: ");
        int lId = scanner.nextInt();
        Lesson lesson = timetable.findLessonById(lId);

        scanner.nextLine();
        System.out.print("Enter Rating (1-5): ");
        int rating = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Comment: ");
        String comment = scanner.nextLine();

        lesson.addReview(new Review(member, rating, comment));
        System.out.println("Thank you for your review");
    }
     
     private void menu() {

        while (true) {

            System.out.println("\n1. View Timetable");
            System.out.println("2. Book Lesson");
            System.out.println("3. Add Review");
            System.out.println("4. View Members");
            System.out.println("5. View Reports");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    for (Lesson l : timetable.getAllLessons()) {
                        System.out.println(
                            "Lesson ID: " + l.getLessonId() +
                            " | " + l.getExercise().getName() +
                            " (" + l.getExercise().getPrice() + "pounds)" +
                            " | " + l.getDay() +
                            " | " + l.getTimeSlot() +
                            " | Week: " + l.getWeekendNumber()
                        );
                    }
                    break;

                case 2:
                    bookLesson();
                    break;

                case 3:
                    addReview();
                    break;

                case 4:
                    viewMembers();
                    break;

                case 5:
                    viewReports();
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }



    public static void main(String[] args) {

        
        System.out.println("FLC Booking Management System");


        FLCBookingSystem system = new FLCBookingSystem();
        system.menu();
    
    }
}