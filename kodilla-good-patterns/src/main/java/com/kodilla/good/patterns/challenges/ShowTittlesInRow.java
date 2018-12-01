package com.kodilla.good.patterns.challenges;


public class ShowTittlesInRow {
    public static void main(String [] args){
    MoveStore titlesList = new MoveStore();
    String listaTytulow = titlesList.getMovies().entrySet().stream()
            .flatMap(movieList->movieList.getValue().stream())
            .map(film->film + "!")
            .reduce("",(film,string)-> film.concat(string));
    System.out.println(listaTytulow);

    }
}
