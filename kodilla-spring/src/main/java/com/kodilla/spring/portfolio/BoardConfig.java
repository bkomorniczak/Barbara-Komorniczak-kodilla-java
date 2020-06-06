package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
        @Bean(name ="toDoList")
    public TaskList createToDoList(){
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList createInProgressList(){
        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList createDoneList(){
        return new TaskList();
    }

    @Bean
    public Board createBoard(){
        return new Board(createToDoList(), createInProgressList(), createDoneList());
    }
}
