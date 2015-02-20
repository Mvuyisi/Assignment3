package za.ac.cput.student;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestStudList {
    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void TestStudentNum() throws Exception
    {
        Assert.assertEquals("212030086", StudentList.getStudentNum());
    }
}
