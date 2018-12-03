package com.kodilla.good.patterns.challenges;

public class Article {
    private int artilce_id;
    private String articleName;

    public Article(int artilce_id, String articleName) {
        this.artilce_id = artilce_id;
        this.articleName = articleName;
    }

    public int getArtilce_id() {
        return artilce_id;
    }

    public String getArticleName() {
        return articleName;
    }
}
