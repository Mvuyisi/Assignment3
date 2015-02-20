package za.ac.cput.student;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestStudMap {
    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void TestStudNameNum()  throws Exception
    {
        Assert.assertEquals("212030086", studentMap.getStudNameNum());
    }
}
