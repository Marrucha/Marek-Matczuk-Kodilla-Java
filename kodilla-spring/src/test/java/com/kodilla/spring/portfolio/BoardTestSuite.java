package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.doneList.tasks.add("Posprzatać");
        board.inProgressList.tasks.add("Pozmywać");
        board.toDoList.tasks.add("Wynieść śmieci");

        Assert.assertEquals("Posprzatać",board.doneList.tasks.get(0));
        Assert.assertEquals("Pozmywać",board.inProgressList.tasks.get(0));
        Assert.assertEquals("Wynieść śmieci",board.toDoList.tasks.get(0));

    }
}
