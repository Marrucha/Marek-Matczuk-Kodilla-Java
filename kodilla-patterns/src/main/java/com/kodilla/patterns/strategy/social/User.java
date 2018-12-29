package com.kodilla.patterns.strategy.social;

public class User {
    private String userNick;
    protected SocialPublisher socialPublisher;

    public User(String userNick){
        this.userNick = userNick;
    }

    public String getUserNick() {
        return userNick;
    }

    public String sharePost()
    {
        return socialPublisher.share();
    }

    public void setFauvoriteService(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

}
