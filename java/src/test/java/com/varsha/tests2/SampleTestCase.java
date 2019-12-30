package com.varsha.tests2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class SampleTestCase {

    @Test
    public void testPassingOne() {
        Assert.assertTrue(true);
    }

    @Test
    public void testPassingTwo() {
        Assert.assertTrue(true);
    }

    @Test
    public void testPassingThree() {
        Assert.assertTrue(true);
    }

    @Test
    public void testFailingFour() {
        Assert.assertTrue(false);
    }

    @Test
    @Ignore
    public void testFlakyFive() {
        Assert.assertTrue(new Random().nextBoolean());
    }
}
