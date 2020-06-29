/*
package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("Task Todo");
        board.getInProgressList().addTask("Task Inprogress");
        board.getDoneList().addTask("Task Done");
        //Then
        String resultToDo = board.getToDoList().getTasks().get(0);
        String resultInProgresss = board.getInProgressList().getTasks().get(0);
        String resultDoneTask = board.getDoneList().getTasks().get(0);

        Assert.assertEquals(resultToDo,"Task Todo");
        Assert.assertEquals(resultInProgresss,"Task Inprogress");
        Assert.assertEquals(resultDoneTask,"Task Done");

    }


}
*/
