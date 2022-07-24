/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package queuemanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author heidi
 * 
 *  * @Notes I understand that the correct guidelines are that I shouldn't be
 * printing out in unit tests, but it helped me to understand the code provided
 * and the new implementations.
 */
public class UnsortedArrayPriorityQueueTest {
    
    public UnsortedArrayPriorityQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of head method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
         System.out.println("\n" + "head()");
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue(3);
        instance.add("Camille", 1);
        instance.add("Heidi", 20);
        instance.add("Marc", 2);
        Object expResult = "Camille";
        System.out.println("Your Priority Queue: " + instance);
        System.out.println("Result of Head: " + instance.head());
        Object result = instance.head();

        try {
            assertEquals(expResult, result);
        } catch (AssertionError e) {
            System.out.println("Error log: " + e);
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("\n" + "add()");
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue(1);
        System.out.println("Checking empty queue: " + instance);
        assertTrue(instance.isEmpty());

        try {
            instance.add("Heidi", 1);
            System.out.println("Priority Queue after using .add: " + instance);
        } catch (AssertionError e) {
            System.out.println("Error log: " + e);
        }
    }
    

    /**
     * Test of remove method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
         System.out.println("\n" + "remove()");
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue(3);

        instance.add("Heidi", 1);
        instance.add("Marc", 2);
        instance.add("Rose", 5);
        
        instance.remove();
        System.out.println("Error log: " + instance);

       
    }

    /**
     * Test of isEmpty method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
    }

    /**
     * Test of toString method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testToString() {
    }
    
}
