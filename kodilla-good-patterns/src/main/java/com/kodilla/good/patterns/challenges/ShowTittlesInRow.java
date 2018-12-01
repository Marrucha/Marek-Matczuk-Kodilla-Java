package com.kodilla.good.patterns.challenges;


import java.util.stream.*;

public class ShowTittlesInRow {
    public static void main(String [] args){
    MoveStore titlesList = new MoveStore();
    String listaTytulow = titlesList.getMovies().entrySet().stream()
            .flatMap(movieList->movieList.getValue().stream())
            .collect(Collectors.joining("!"));
    System.out.println(listaTytulow);

    }
}
