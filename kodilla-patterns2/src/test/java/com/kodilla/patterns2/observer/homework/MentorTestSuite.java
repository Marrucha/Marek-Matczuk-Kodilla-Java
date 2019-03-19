package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class MentorTestSuite {
    @Test
    public void testStudentTaskUpdate() {
        // Given
        Mentor mentorPP = new Mentor("Paweł", "Pluta");
        Mentor mentorAJ = new Mentor("Andrzej", "Jaromin");
        UsersTasksQueue marekMatczuk = new UsersTasksQueue("Marek Matczuk");
        UsersTasksQueue janKowalski = new UsersTasksQueue("Jan Kowalski");
        UsersTasksQueue piotrNowak = new UsersTasksQueue("Piotr Nowak");

        marekMatczuk.registerMentor(mentorPP);
        piotrNowak.registerMentor(mentorAJ);
        janKowalski.registerMentor(mentorPP);
        // When
        marekMatczuk.sendTask(TaskList.INTRO, "http://example.com/marekMatczuk/kodilla-course");
        janKowalski.sendTask(TaskList.STEP2, "http://example.com/janKowalski/kodilla-course");
        piotrNowak.sendTask(TaskList.INTRO, "http://example.com/piotrNowak/kodilla-course");
        marekMatczuk.sendTask(TaskList.STEP1, "http://example.com/marekMatczuk/kodilla-course");
        janKowalski.sendTask(TaskList.STEP1, "http://example.com/janKowalski/kodilla-course");
        // Then
        Assert.assertEquals(4, mentorPP.getMentorTaskNumber());
        Assert.assertEquals(1, mentorAJ.getMentorTaskNumber());
    }
}