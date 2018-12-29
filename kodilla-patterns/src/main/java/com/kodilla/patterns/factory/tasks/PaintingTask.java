package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    String taskName ;
    String color ;
    String whatToPaint ;
    private boolean taskSheet = false;
    private boolean taskDone = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }


    @Override
    public void executeTask() {
        if (!taskSheet && color != "white" && whatToPaint == "fence") {
            taskDone = true;
            taskSheet = true;}
        else
            taskDone = false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskDone;
    }
}
