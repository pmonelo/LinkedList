

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ShuntingYardTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ShuntingYardTest
{
    /**
     * Default constructor for test class ShuntingYardTest
     */
    public ShuntingYardTest()
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
    public void shuntingYardTest()
    {
        ShuntingYard a=new ShuntingYard();
        assertEquals(10.0, a.infixToPostFix("5 + 5"), .000001);
        assertEquals(2.0, a.infixToPostFix("1 * 1 + 1"), .000001);
        assertEquals(1.0, a.infixToPostFix("9 / 9"), .000001);
        assertEquals(2.0, a.infixToPostFix("2 / 1 + 1"), .000001);
        
    }
    
        @Test
    public void shuntingYardTest2()
    {
        ShuntingYard a=new ShuntingYard();
        assertEquals(15.0, a.infixToPostFix("5 + 5 + 5"), .000001);
        
    }
        
        
}
