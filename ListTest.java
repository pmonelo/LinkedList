

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListTest
{
    /**
     * Default constructor for test class ListTest
     */
    public ListTest()
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
    public void testInsert()
    {
        FancyArray<Integer> a = new FancyArray<Integer>();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        a.add(0);
        assertEquals("5,4,3,2,1,0," , a.toString());
        a.insert(6,2);
        assertEquals("5,4,6,3,2,1,0," , a.toString());
        
    }
    
    @Test
    public void testInsert3()
    {
        FancyArray<String> a = new FancyArray<String>();
        a.add("hello");
        a.add("goodbye");
        a.add("goodnight");
        assertEquals("hello,goodbye,goodnight," , a.toString());
        a.insert("Barry",0);
        assertEquals("Barry,hello,goodbye,goodnight," , a.toString());
        
    }
    
    @Test (expected=ArrayIndexOutOfBoundsException.class)
    public void testOutofbounds()
    {
        FancyArray a = new FancyArray();
        a.add(5);
        a.get(8);
     
        
    }
    
    @Test
    public void testIndexof()
    {
        FancyArray<Integer> a = new FancyArray<Integer>();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        a.add(0);
        assertEquals("5,4,3,2,1,0," , a.toString());
        assertEquals(2 , a.indexOf(3));
    }
}
