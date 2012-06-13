package org.ops4j.pax.web.service.tomcat;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.Configuration;
import org.ops4j.pax.exam.junit.JUnit4TestRunner;

/**
 * Created with IntelliJ IDEA.
 * User: romain.gilles
 * Date: 6/12/12
 * Time: 9:11 AM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(JUnit4TestRunner.class)
public class SimpleIT extends ITestBase {

    @Configuration
   	public static Option[] configure() {
   		return baseConfigure();
    }


    @Test
    void testServerUp() throws Exception {
        Assert.assertTrue(multiCheckServer(5));
    }
}
