package com.warmup_2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrontTimes_Test {

    FrontTimes frontTimes;

    @Before
    public void setUp() {
        frontTimes = new FrontTimes();
    }

    @Test
    public void verifyFronTimes() {
        String expRes = "ChoChoCho";
        String actRes = frontTimes.frontTimes("Chocolate", 3);
        Assert.assertTrue("Expexted result was: " + expRes + " Actual result is: " + actRes, expRes.equals(actRes));
    }

}
