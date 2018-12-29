package com.kodilla.patterns.strategy.social;

public class GGeneration extends User {
    public GGeneration(String nickName){
        super(nickName);
        this.socialPublisher = new SnapChatPublisher();
    }

}
