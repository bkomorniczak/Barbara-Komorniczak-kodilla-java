package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPain;
    private boolean isExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPain) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPain = whatToPain;
    }

    @Override
    public void executeTask() {
        isExecuted = true;
    }

    @Override
    public String TaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
