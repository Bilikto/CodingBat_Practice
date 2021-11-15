package com.warmup_2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringTimes_Test {

    StringTimes stringTimes;
    @Before
    public void setUp() {
        stringTimes = new StringTimes();
    }

    @Test
    public void verifyStringTimes() {
        String expResult = "HiHiHi";
        String actResult = stringTimes.stringTimes("Hi", 3);
        Assert.assertTrue("Expected result was: " + expResult + " Actual result is: " + actResult, expResult.equals(actResult));

    }
 }
