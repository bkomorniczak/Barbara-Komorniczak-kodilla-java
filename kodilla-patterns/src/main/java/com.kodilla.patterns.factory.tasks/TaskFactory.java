package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING";
    public static final String PAINTING_TASK = "PAINTING";
    public static final String DRIVING_TASK = "DRIVING";

    public final Task createTask(final String taskType){
        switch(taskType){
            case SHOPPING_TASK:
                return new ShoppingTask("Some shopping task","corksrew",1);
            case PAINTING_TASK:
                return new PaintingTask("Some Painting task","Red","Door");
            case DRIVING_TASK:
                return new DrivingTask("Some driving task", "Kielce", "Bike");
            default:
                return null;
        }
    }
}
