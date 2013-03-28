

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FancyArrayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FancyArrayTest
{
    /**
     * Default constructor for test class FancyArrayTest
     */
    public FancyArrayTest()
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
        FancyArray a = new FancyArray();
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
    public void testInsert2()
    {
        FancyArray a = new FancyArray();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        a.add(0);
        assertEquals("5,4,3,2,1,0," , a.toString());
        a.insert(6,0);
        assertEquals("6,5,4,3,2,1,0," , a.toString());
        
    }
    
    @Test
    public void testInsert3()
    {
        FancyArray a = new FancyArray();
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
        a.get(8);
     
        
    }
        
    @Test
    public void testInsert4()
    {
        FancyArray a = new FancyArray();
        a.add("hello");
        a.add("goodbye");
        a.add("goodnight");
        assertEquals("hello,goodbye,goodnight," , a.toString());
        a.insert("Barry",2);
        assertEquals("hello,goodbye,Barry,goodnight," , a.toString());
        
    }
    
    @Test
    public void testIndexof()
    {
        FancyArray a = new FancyArray();
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



