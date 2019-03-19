package com.kodilla.patterns2.observer.homework;

public class Mentor implements MentorObserver {
    private String firstName;
    private String lastName;
    private int mentorTaskNumber = 0;

    Mentor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    int getMentorTaskNumber() {
        return mentorTaskNumber;
    }

    @Override
    public void changeTaskStatus(UsersTasksQueue userTasksQueue) {
        mentorTaskNumber++;
        System.out.println(firstName + " " + lastName + ": New tasks is waiting. Total tasks: "
                + mentorTaskNumber + "; Sent info.");
    }
}