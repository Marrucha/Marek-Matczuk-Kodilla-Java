package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVE = "DRIVE";
    public static final String PAINT = "PAINT";
    public static final String SHOPPING = "SHOPPING";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case DRIVE:
                return new DrivingTask("Drive","home", "car");
            case PAINT:
                return new PaintingTask("Paint","red","fence");
            case SHOPPING:
                return new ShoppingTask("Buy", "food", 2);
            default:
                return null;
        }

    }

}
