package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean taskSheet = false;
    private boolean taskDone = false;

        public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        if (!taskSheet && whatToBuy.equals("food") && quantity == 2){
            taskDone = true;
            taskSheet = true;}
        else
            taskDone = false;

    }

    @Override
    public String getTaskName() {
        return null;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskDone;
    }
}
