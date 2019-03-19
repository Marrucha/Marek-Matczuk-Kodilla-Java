package com.kodilla.patterns2.observer.homework;

public enum TaskList {
    INTRO("1. INFO"),
    STEP1("2. Analyse homework"),
    STEP2("3. Remarks"),
    STEP3("4. Acceptation");

    private String taskName;

    TaskList(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }
}