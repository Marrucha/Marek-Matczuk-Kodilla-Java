package com.kodilla.patterns2.observer.homework;

public interface CourseUserTaskObservable {
        void registerMentor(MentorObserver mentorsObserver);
        void notifyMentors();
        void removeMentor(MentorObserver mentorsObserver);
}

