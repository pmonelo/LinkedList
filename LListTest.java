

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LListTest
{
    /**
     * Default constructor for test class LListTest
     */
    public LListTest()
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
    public void testAdd()
    {
        LList p= new LList();
        p.add("Barry");
        assertEquals("Barry" , p.toString());
    }
    
     @Test
    public void testInsert()
    {
        LList a= new LList();
        a.add(5);
        assertEquals("5" , a.toString());
        a.add(4);
        assertEquals("4,5" , a.toString());
        a.add(3);
        a.add(2);
        a.add(1);
        a.add(0);
        assertEquals("0,1,2,3,4,5" , a.toString());
        a.insert(6,2);
        assertEquals("0,1,6,2,3,4,5" , a.toString());
        
    }
    
    @Test
    public void testInsert2()
    {
        LList a= new LList();
        a.add("hello");
        a.add("goodbye");
        a.add("goodnight");
        assertEquals("goodnight,goodbye,hello" , a.toString());
        a.insert("Barry", 0);
        assertEquals("Barry,goodnight,goodbye,hello" , a.toString());
        
    }
    
    @Test (expected=ArrayIndexOutOfBoundsException.class)
    public void testOutofbounds()
    {
        LList a= new LList();
        a.get(8);
    }
    
    
    @Test
    public void testIndexof()
    {
        LList a= new LList();
        a.add(5);
        assertEquals("5" , a.toString());
        a.add(4);
        assertEquals("4,5" , a.toString());
        a.add(3);
        a.add(2);
        assertEquals("2,3,4,5" , a.toString());
        a.add(1);
        a.add(0);
        assertEquals("0,1,2,3,4,5" , a.toString());
        assertEquals(2 , a.indexOf(2));
    }
    
    @Test
    public void testDelete()
    {
        LList a= new LList();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        assertEquals("2,3,4,5" , a.toString());
        a.delete(1);
        assertEquals("2,4,5" , a.toString());
    }
    
    @Test
    public void testDelete2()
    {
        LList a= new LList();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        assertEquals("2,3,4,5" , a.toString());
        a.delete(0);
        assertEquals("3,4,5" , a.toString());
    }
    
    @Test
    public void testDelete3()
    {
        LList a= new LList();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        assertEquals("2,3,4,5" , a.toString());
        a.delete(3);
        assertEquals("2,3,4" , a.toString());
    }
    
    @Test
    public void testRemove()
    {
        LList a= new LList();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        assertEquals("2,3,4,5" , a.toString());
        a.remove();
        assertEquals("3,4,5" , a.toString());
        a.remove();
        assertEquals("4,5" , a.toString());
        a.remove();
        assertEquals("5" , a.toString());
    }
    
    @Test
    public void testAddFirst()
    {
        LList a= new LList();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        assertEquals("2,3,4,5" , a.toString());
        a.addFirst(1);
        assertEquals("1,2,3,4,5" , a.toString());
        a.addFirst(9);
        assertEquals("9,1,2,3,4,5" , a.toString());
    }
    
    @Test
    public void testAddLast()
    {
        LList a= new LList();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        assertEquals("2,3,4,5" , a.toString());
        a.addLast(1);
        assertEquals("2,3,4,5,1" , a.toString());
        a.addLast(9);
        assertEquals("2,3,4,5,1,9" , a.toString());
    }
    
    @Test
    public void testRemoveLast()
    {
        LList a= new LList();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        assertEquals("2,3,4,5" , a.toString());
        a.removeLast();
        assertEquals("2,3,4" , a.toString());
    }
    
    @Test
    public void testRemoveLast2()
    {
        LList a= new LList();
        a.add("Barry");
        a.add("Morning");
        a.add("Good");
        a.add("I want an A");
        assertEquals("I want an A,Good,Morning,Barry" , a.toString());
        a.removeLast();
        assertEquals("I want an A,Good,Morning" , a.toString());
    }
    
    @Test
    public void testAdd2()
    {
        LList p= new LList();
        p.add("Barry");
        assertEquals("Barry" , p.toString());
    }
    
    @Test
    public void testInsert4()
    {
        LList a= new LList();
        a.add("hello");
        a.add("goodbye");
        a.add("goodnight");
        assertEquals("goodnight,goodbye,hello" , a.toString());
        a.insert("Barry", 0);
        assertEquals("Barry,goodnight,goodbye,hello" , a.toString());
        
    }
    
    @Test (expected=ArrayIndexOutOfBoundsException.class)
    public void testOutofbounds2()
    {
        LList a= new LList();
        a.get(8);
    }
    
    @Test
    public void testRemove2()
    {
        LList a= new LList();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        assertEquals("2,3,4,5" , a.toString());
        a.remove();
        assertEquals("3,4,5" , a.toString());
        a.remove();
        assertEquals("4,5" , a.toString());
        a.remove();
        assertEquals("5" , a.toString());
    }
    
    @Test
    public void testRemoveLast3()
    {
        LList a= new LList();
        a.add("Barry");
        a.add("Morning");
        a.add("Good");
        a.add("I want an A");
        assertEquals("I want an A,Good,Morning,Barry" , a.toString());
        a.removeLast();
        assertEquals("I want an A,Good,Morning" , a.toString());
    }
}
