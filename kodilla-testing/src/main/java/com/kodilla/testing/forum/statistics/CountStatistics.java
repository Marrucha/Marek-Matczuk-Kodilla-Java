package com.kodilla.testing.forum.statistics;

import org.mockito.Mockito;

import java.util.*;

public class CountStatistics {

    public HashMap<String,Double> calculateAdvStatistics(Statistics statistics){
        double numbUsers =0;
        Statistics statMock = Mockito.mock(Statistics.class);
        HashMap<String,Double> statVal = new HashMap<String,Double>();

        // Stub creation
        List<String> userNamesList = new ArrayList<String>();
        userNamesList.add("Kowalski");
        userNamesList.add("Nowak");
        userNamesList.add("Polański");
        userNamesList.add("Wajda");
        userNamesList.add("Kaczyński");
        Integer postsCountVal = 100 ;
        Integer commentsCountVal = 8888;


        Mockito.when(statMock.usersNames()).thenReturn(userNamesList);
        Mockito.when(statMock.postsCount()).thenReturn(postsCountVal);
        Mockito.when(statMock.commentsCount()).thenReturn(commentsCountVal);

        Integer usersCounter = 0;
        for(String names: statMock.usersNames()) {
            usersCounter ++;
        }

        statVal.put("Liczba użytkowników",(double)usersCounter);
        statVal.put("Liczba postów",(double)postsCountVal);
        statVal.put("Liczba komentarzy",(double)commentsCountVal);
        statVal.put("Postów per użytkownik",(double)postsCountVal/usersCounter);
        statVal.put("Komentarzy per użytkownik",(double)commentsCountVal/usersCounter);
        statVal.put("Komentarzy per post",(double)commentsCountVal/postsCountVal);

    return statVal;
    }


}
