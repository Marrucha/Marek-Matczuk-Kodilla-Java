package com.kodilla.stream;


import java.time.*;

import static java.time.temporal.ChronoUnit.DAYS;


public class StreamMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate other = LocalDate.now().minusDays(20);
        long days = DAYS.between(other,nowDate);

        System.out.println(days);



    }
}



