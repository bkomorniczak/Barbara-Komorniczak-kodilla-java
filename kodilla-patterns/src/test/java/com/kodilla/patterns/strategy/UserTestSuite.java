package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.social.*;
;
import org.junit.Assert;
import org.junit.Test;


public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user = new YGeneration("YJohn");
        User user1 = new ZGeneration("ZJohn");
        User user2 = new Millenials("MJohn");
        //When
        String yResult = user.sharePost();
        String zResult = user1.sharePost();
        String mResult = user2.sharePost();
        //Then
        Assert.assertEquals("Facebook post", yResult);
        Assert.assertEquals("Twitter twit?",mResult);
        Assert.assertEquals("Snapchat snap?", zResult);

    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User user = new YGeneration("yyyJohn");
        //When
        user.setSharingPreference(new FacebookPublisher());

        //Then
        Assert.assertEquals("Facebook post",user.sharePost());
    }
}
