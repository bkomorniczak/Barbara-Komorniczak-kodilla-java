package com.kodilla.patterns.factory.tasks;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;


public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTest(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING_TASK);
        shopping.executeTask();
        //Then
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("Some shopping task", shopping.TaskName());
    }
    @Test
    public void testFactoryPaintingTest(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.createTask(TaskFactory.PAINTING_TASK);
        shopping.executeTask();
        //Then
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("Some Painting task", shopping.TaskName());
    }
    @Test
    public void testFactoryDrivingTest(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.createTask(TaskFactory.DRIVING_TASK);
        shopping.executeTask();
        //Then
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("Some driving task", shopping.TaskName());
    }

}
