package com.kodilla.good.patterns.food2door;

public class Article {
    private int articleId;
    private String articleName;
    private String articleType;

    public Article(int articleId, String articleName, String articleType) {
        this.articleId = articleId;
        this.articleName = articleName;
        this.articleType = articleType;
    }

    public int getArticleId() {
        return articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public String getArticleType() {
        return articleType;
    }
}
