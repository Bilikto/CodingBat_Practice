package com.warmup_2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountXX_Test {
    CountXX countXX;

    @Before
    public void setUp() {
        countXX = new CountXX();
    }

    @Test
    public void verifyCountXX() {
        int actRes = countXX.countXX("abcxx");
        int expRes = 1;
        Assert.assertTrue("Expected result was: " + expRes + " Actual result is: " + actRes, expRes == actRes);
    }
}
