package com.kodilla.stream.beautyfier;

public class PoemBeautyfier {
    public void beautyfy(String text,PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }
}
