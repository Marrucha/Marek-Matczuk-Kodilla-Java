package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrive() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drive = factory.doTask(TaskFactory.DRIVE);
        drive.executeTask();
        //Then
        Assert.assertTrue(drive.isTaskExecuted());

        drive.executeTask();
        Assert.assertFalse(drive.isTaskExecuted());

    }

    @Test
    public void testFactoryPaint() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paint = factory.doTask(TaskFactory.PAINT);
        paint.executeTask();
        //Then
        Assert.assertTrue(paint.isTaskExecuted());

        paint.executeTask();
        Assert.assertFalse(paint.isTaskExecuted());

    }

    @Test
    public void testFactoryBuy() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task buy = factory.doTask(TaskFactory.SHOPPING);
        buy.executeTask();
        //Then
        Assert.assertTrue(buy.isTaskExecuted());

        buy.executeTask();
        Assert.assertFalse(buy.isTaskExecuted());

    }
}
