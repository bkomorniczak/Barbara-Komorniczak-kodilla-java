package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCounter;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void calculateAdvStatisticsTestFor0Users(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList <>();
        for(int i=0; i<0;i++){
            usersList.add("user nr: " + i);
        }
        when(statisticsMock.userNames()).thenReturn(usersList);
        //When
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0,usersList.size());
        Assert.assertEquals(0,statisticsMock.commentsCount());
        Assert.assertEquals(0,statisticsMock.postsCount());

    }
    @Test
    public void calculateAdvStatisticsTestFor0Values(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList <>();
        for(int i=0; i<100;i++){
            usersList.add("user nr: " + i);
        }
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.userNames()).thenReturn(usersList);
        //When
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statisticsMock);


        Assert.assertEquals(0, statisticsMock.postsCount());
        Assert.assertEquals(0, statisticsMock.commentsCount());

    }

  /*  @Test
    public void calculateAdvStatisticsTestForNot0Value(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList <>();
        for(int i=0; i<100;i++){
            usersList.add("user nr: " + i);
        }
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.userNames()).thenReturn(usersList);
        //When
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statisticsMock);


        Assert.assertEquals(1000, statisticsMock.commentsCount());
        Assert.assertEquals(1000, statisticsMock.postsCount());
        Assert.assertEquals(1, statisticsCounter.getAvrCommentNumbPerPost() );
        Assert.assertEquals(1, statisticsCounter.getAvrPostNumbPerUser() );
        Assert.assertEquals(10, statisticsCounter.getAvrCommentNumbPerUser() );
        Assert.assertEquals(10, statisticsCounter.getAvrPostNumbPerUser() );

    }*/

    @Test
    public void calculateAdvStatisticsTestWhenMoreCommentsThenPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList <>();
        for(int i=0; i<100;i++){
            usersList.add("user nr: " + i);
        }
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.userNames()).thenReturn(usersList);
        //When
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        final double DELTA = 1e-15;

        Assert.assertEquals(1000, statisticsMock.commentsCount());
        Assert.assertEquals(10, statisticsMock.postsCount());
        Assert.assertEquals(100, statisticsCounter.getAvrCommentNumbPerPost(),DELTA );
        Assert.assertEquals(0.1, statisticsCounter.getAvrPostNumbPerUser(), DELTA );
        Assert.assertEquals(10.0, statisticsCounter.getAvrCommentNumbPerUser(),DELTA );
        Assert.assertEquals(0.1, statisticsCounter.getAvrPostNumbPerUser(),DELTA );

    }
    @Test
    public void calculateAdvStatisticsTestWhenMorePostsThenComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList <>();
        for(int i=0; i<100;i++){
            usersList.add("user nr: " + i);
        }
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.userNames()).thenReturn(usersList);
        //When
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        final double DELTA = 1e-15;

        Assert.assertEquals(10, statisticsMock.commentsCount());
        Assert.assertEquals(1000, statisticsMock.postsCount());
        Assert.assertEquals(0.01, statisticsCounter.getAvrCommentNumbPerPost(),DELTA );
        Assert.assertEquals(10, statisticsCounter.getAvrPostNumbPerUser(), DELTA );
        Assert.assertEquals(0.1, statisticsCounter.getAvrCommentNumbPerUser(),DELTA );
        Assert.assertEquals(10, statisticsCounter.getAvrPostNumbPerUser(),DELTA );

    }







}
