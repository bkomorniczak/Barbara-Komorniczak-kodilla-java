package com.kodilla.spring;

import com.kodilla.spring.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ForumUserTestSuite {

    @Test
    public void testGetUsername(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser user = context.getBean(ForumUser.class);
        //When
        String username = user.getUsername();
        //Then
        Assert.assertEquals(username, "John Smith");
    }
}
