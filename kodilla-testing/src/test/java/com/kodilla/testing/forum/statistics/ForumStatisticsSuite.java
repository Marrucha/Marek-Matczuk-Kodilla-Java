package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.*;

public class ForumStatisticsSuite {

    @Test
    public void forumStatcountTest() {
        double numbUsers = 0;
        CountStatistics countStatistics = new CountStatistics();
        Statistics statMock = Mockito.mock(Statistics.class);

        // Stub creation
        List<String> userNamesList = new ArrayList<String>();
        userNamesList.add("Kowalski");
        userNamesList.add("Nowak");
        userNamesList.add("Polański");
        userNamesList.add("Wajda");
        userNamesList.add("Kaczyński");
        Integer postsCountVal = 100;
        Integer commentsCountVal = 8888;


        Mockito.when(statMock.usersNames()).thenReturn(userNamesList);
        Mockito.when(statMock.postsCount()).thenReturn(postsCountVal);
        Mockito.when(statMock.commentsCount()).thenReturn(commentsCountVal);

        Assert.assertEquals(6,countStatistics.calculateAdvStatistics(statMock).size());
    }
}
