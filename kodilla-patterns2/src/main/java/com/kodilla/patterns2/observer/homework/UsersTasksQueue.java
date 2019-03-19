package com.kodilla.patterns2.observer.homework;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersTasksQueue implements CourseUserTaskObservable {

        private List<MentorObserver> observers;
        private Map<String, TaskInfo> taskInfo;
        private String userName;

        UsersTasksQueue(String userName) {
            observers = new ArrayList<>();
            this.userName = userName;
            taskInfo = new HashMap<>();
            for (TaskList taskList : TaskList.values()) {
                taskInfo.put(taskList.getTaskName(), new TaskInfo("", TaskStatus.NEW));
            }
        }
        void sendTask(TaskList taskName, String taskUrl) {
            taskInfo.get(taskName.getTaskName()).setTaskUrl(taskUrl);
            taskInfo.get(taskName.getTaskName()).setTaskStatus(TaskStatus.PENDING);
            notifyMentors();
        }

        @Override
        public void registerMentor(MentorObserver mentorObserver) {
            observers.add(mentorObserver);
        }

        @Override
        public void notifyMentors() {
            for (MentorObserver observer : observers) {
                observer.changeTaskStatus(this);
            }
        }

        @Override
        public void removeMentor(MentorObserver mentorObserver) {
            observers.remove(mentorObserver);
        }
    }
