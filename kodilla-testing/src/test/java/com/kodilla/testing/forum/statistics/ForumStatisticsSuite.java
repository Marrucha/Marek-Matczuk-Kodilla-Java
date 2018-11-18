package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.*;

import static org.hamcrest.core.IsEqual.equalTo;

public class ForumStatisticsSuite {

    @Test
    public void forumStatcountTest_fullFullFull() {
        double numbUsers = 0;
        CountStatistics countStatistics = new CountStatistics();
        Statistics statMock = Mockito.mock(Statistics.class);

        // Stub creation
        List<String> userNamesList = new ArrayList<String>();
        for (int i =1;i<=100;i++) {
            userNamesList.add("Kowalski" + " nr " + i);
        }

        Integer postsCountVal = 1000;
        Integer commentsCountVal = 5000;

        Mockito.when(statMock.usersNames()).thenReturn(userNamesList);
        Mockito.when(statMock.postsCount()).thenReturn(postsCountVal);
        Mockito.when(statMock.commentsCount()).thenReturn(commentsCountVal);

        Assert.assertEquals(100 ,countStatistics.calculateAdvStatistics(statMock).get("Liczba użytkowników").intValue());
        Assert.assertEquals(1000 ,countStatistics.calculateAdvStatistics(statMock).get("Liczba postów").intValue());
        Assert.assertEquals(5000 ,countStatistics.calculateAdvStatistics(statMock).get("Liczba komentarzy").intValue());
        Assert.assertEquals(10 ,countStatistics.calculateAdvStatistics(statMock).get("Postów per użytkownik").intValue());
        Assert.assertEquals(50 ,countStatistics.calculateAdvStatistics(statMock).get("Komentarzy per użytkownik").intValue());
        Assert.assertEquals(5 ,countStatistics.calculateAdvStatistics(statMock).get("Komentarzy per post").intValue());

    }

    @Test
    public void forumStatcountTest_zeroFullFull() {
        double numbUsers = 0;
        CountStatistics countStatistics = new CountStatistics();
        Statistics statMock = Mockito.mock(Statistics.class);

        // Stub creation
        List<String> userNamesList = new ArrayList<String>();
        Integer postsCountVal = 1000;
        Integer commentsCountVal = 5000;

        Mockito.when(statMock.usersNames()).thenReturn(userNamesList);
        Mockito.when(statMock.postsCount()).thenReturn(postsCountVal);
        Mockito.when(statMock.commentsCount()).thenReturn(commentsCountVal);

        Assert.assertEquals(0 ,countStatistics.calculateAdvStatistics(statMock).size());

    }

    @Test
    public void forumStatcountTest_fullZeroFull() {
        double numbUsers = 0;
        CountStatistics countStatistics = new CountStatistics();
        Statistics statMock = Mockito.mock(Statistics.class);

        // Stub creation
        List<String> userNamesList = new ArrayList<String>();
        for (int i =1;i<=100;i++) {
            userNamesList.add("Kowalski" + " nr " + i);
        }
        Integer postsCountVal = 0;
        Integer commentsCountVal = 5000;

        Mockito.when(statMock.usersNames()).thenReturn(userNamesList);
        Mockito.when(statMock.postsCount()).thenReturn(postsCountVal);
        Mockito.when(statMock.commentsCount()).thenReturn(commentsCountVal);

        Assert.assertEquals(0 ,countStatistics.calculateAdvStatistics(statMock).size());
        Assert.assertEquals(0 ,countStatistics.calculateAdvStatistics(statMock).size());
        Assert.assertEquals(0 ,countStatistics.calculateAdvStatistics(statMock).size());


    }

    @Test
    public void forumStatcountTest_fullFullZero() {
        double numbUsers = 0;
        CountStatistics countStatistics = new CountStatistics();
        Statistics statMock = Mockito.mock(Statistics.class);

        // Stub creation
        List<String> userNamesList = new ArrayList<String>();
        for (int i =1;i<=100;i++) {
            userNamesList.add("Kowalski" + " nr " + i);
        }
        Integer postsCountVal = 1000;
        Integer commentsCountVal = 0;

        Mockito.when(statMock.usersNames()).thenReturn(userNamesList);
        Mockito.when(statMock.postsCount()).thenReturn(postsCountVal);
        Mockito.when(statMock.commentsCount()).thenReturn(commentsCountVal);

        Assert.assertEquals(6 ,countStatistics.calculateAdvStatistics(statMock).size());
        Assert.assertEquals(10 ,countStatistics.calculateAdvStatistics(statMock).get("Postów per użytkownik").intValue());
        Assert.assertEquals(0, countStatistics.calculateAdvStatistics(statMock).get("Komentarzy per użytkownik").intValue());
        Assert.assertEquals(0 ,countStatistics.calculateAdvStatistics(statMock).get("Komentarzy per post").intValue());

    }

    @Test
    public void forumStatcountTest_commentsLessThanPosts() {
        double numbUsers = 0;
        CountStatistics countStatistics = new CountStatistics();
        Statistics statMock = Mockito.mock(Statistics.class);

        // Stub creation
        List<String> userNamesList = new ArrayList<String>();
        for (int i =1;i<=100;i++) {
            userNamesList.add("Kowalski" + " nr " + i);
        }

        Integer postsCountVal = 1000;
        Integer commentsCountVal = 10;

        Mockito.when(statMock.usersNames()).thenReturn(userNamesList);
        Mockito.when(statMock.postsCount()).thenReturn(postsCountVal);
        Mockito.when(statMock.commentsCount()).thenReturn(commentsCountVal);

        Assert.assertEquals(100 ,countStatistics.calculateAdvStatistics(statMock).get("Liczba użytkowników").intValue());
        Assert.assertEquals(1000 ,countStatistics.calculateAdvStatistics(statMock).get("Liczba postów").intValue());
        Assert.assertEquals(10 ,countStatistics.calculateAdvStatistics(statMock).get("Liczba komentarzy").intValue());
        Assert.assertEquals(10 ,countStatistics.calculateAdvStatistics(statMock).get("Postów per użytkownik").intValue());
        Assert.assertThat(0.1 ,equalTo(countStatistics.calculateAdvStatistics(statMock).get("Komentarzy per użytkownik")));
        Assert.assertEquals(0.01 ,countStatistics.calculateAdvStatistics(statMock).get("Komentarzy per post"),0.00000001);

    }
}
