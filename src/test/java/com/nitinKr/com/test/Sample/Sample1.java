package com.nitinKr.com.test.Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

    @Test(groups="qa",priority = 1)
    public void creatBookoing()
    {
        Assert.assertTrue(true);

    }

    @Test(groups="qa",priority = 2)

    public void getBookoing()
    {
        Assert.assertTrue(true);

    }

    @Test(groups="qa",priority = 3)
    public void patchBookoing()
    {
        Assert.assertTrue(true);

    }

    @Test(groups="qa",priority = 4)
    public void deleteBookoing()
    {
        Assert.assertTrue(true);

    }
}
