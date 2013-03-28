

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PostfixTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PostfixTest
{
    /**
     * Default constructor for test class PostfixTest
     */
    public PostfixTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testPostfix()
    {
        Postfix p = new Postfix();
        LList<String> n = new LList<String>();
        n.add("+");
        n.add("4");
        n.add("3");
        assertEquals(7.0 , p.eval(n),1);
    }
}
