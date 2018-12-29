package com.kodilla.patterns.singleton;

import org.junit.Test;
import org.junit.Assert;

public class LoggerTestSuite {
    @Test
    public void testLogAdd() {
        Logger.getInstance().log("coś tam");
        Assert.assertEquals("coś tam",Logger.getInstance().getLastLog());
    }
}
