package za.ac.cput.student;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.student.Config.AppConfig;
/**
 * Created by student on 2015/02/20.
 */
public class TestStudent {
    private ApplicationContext ctx;
    private StudentInterface StudentClass;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentClass = (StudentInterface)ctx.getBean("studDetails");
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void TestStudentNum() throws Exception
    {
        Assert.assertEquals( "212030086", StudentClass.getStudentNum());
    }

    @Test
    public void TestStudentName()  throws Exception
    {
        Assert.assertEquals("2", StudentClass.getStudentName());
    }

    @Test
    public void TestStudNameNum()  throws Exception
    {
        Assert.assertEquals("212030086", StudentClass.getStudNameNum());
    }



}
