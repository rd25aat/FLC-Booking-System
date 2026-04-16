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

public class Member {

    private int memberId;
    private String name;
    private ArrayList<Booking> bookings;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.bookings = new ArrayList<>();
    }

    public boolean hasTimeConflict(Lesson lesson) {
        for (Booking booking : bookings) {
            Lesson bookedLesson = booking.getLesson();

            if (bookedLesson.getWeekendNumber() == lesson.getWeekendNumber() &&
                bookedLesson.getDay().equals(lesson.getDay()) &&
                bookedLesson.getTimeSlot().equals(lesson.getTimeSlot())) {

                return true;
            }
        }
        return false;
    }

    public boolean bookLesson(Lesson lesson) {

        if (lesson.isFull()) return false;

        if (hasTimeConflict(lesson)) return false;

        if (lesson.addMember(this)) {
            bookings.add(new Booking(this, lesson));
            return true;
        }
        return false;
    }

    public void cancelBooking(Lesson lesson) {

        bookings.removeIf(b -> b.getLesson().equals(lesson));
        lesson.removeMember(this);
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    @Override
    public String toString() {
        return memberId + " - " + name;
    }
}
