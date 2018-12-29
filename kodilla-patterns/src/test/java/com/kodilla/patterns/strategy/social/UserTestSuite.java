package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        User sebastian = new Millenials("Sebix");
        User jessica = new YGeneration("Jes");
        User jan    = new GGeneration("Jasiek");

        String sebastianSocial = sebastian.sharePost();
        System.out.println("Sebix" + sebastianSocial);

        String jessicaSocial = jessica.sharePost();
        System.out.println("Jes" + jessicaSocial);

        String janSocial = jan.sharePost();
        System.out.println("Jasiek" + janSocial);

        Assert.assertEquals(" loves Facebook", sebastianSocial);
        Assert.assertEquals(" loves Twitter", jessicaSocial);
        Assert.assertEquals(" loves SnapChat", janSocial);


    }

    @Test
    public void testIndividualSharingStrategy(){
        User sebastian = new Millenials("Sebix");
        String sebastianSocial = sebastian.sharePost();
        System.out.println("Sebix" + sebastianSocial);
        Assert.assertEquals(" loves Facebook", sebastianSocial);

        sebastian.setFauvoriteService(new TwitterPublisher());
        sebastianSocial = sebastian.sharePost();
        System.out.println("Sebix" + sebastianSocial);
        Assert.assertEquals(" loves Twitter", sebastianSocial);


    }

}
