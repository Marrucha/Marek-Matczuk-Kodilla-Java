package com.kodilla.testing.forum.statistics;

import org.mockito.Mockito;

import java.util.*;

public class CountStatistics {

    public HashMap<String,Double> calculateAdvStatistics(Statistics statistics){

        HashMap<String,Double> statVal = new HashMap<String,Double>();


        Integer usersCounter = 0;
        for(String names: statistics.usersNames()) {
            usersCounter ++;
        }

        if (usersCounter != 0 && statistics.postsCount()> 0 ) {
            statVal.put("Liczba użytkowników", (double) usersCounter);
            statVal.put("Liczba postów", (double) statistics.postsCount());
            statVal.put("Liczba komentarzy", (double) statistics.commentsCount());
            statVal.put("Postów per użytkownik", (double) statistics.postsCount() / usersCounter);
            statVal.put("Komentarzy per użytkownik", (double) statistics.commentsCount() / usersCounter);
            statVal.put("Komentarzy per post", (double) statistics.commentsCount() / statistics.postsCount());
        }
    return statVal;
    }


}
