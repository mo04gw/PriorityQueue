/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package queuemanager;

import java.util.logging.Level;
import java.util.logging.Logger;
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
 * and the new implementations (such a black box at the same time I am expecting
 * a result).
 */
public class UnsortedArrayPriorityQueueTest {

    public UnsortedArrayPriorityQueueTest() {
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
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue(4);
        instance.add("Camille", 1);
        instance.add("Lucas", 7);
        instance.add("Heidi", 5);
        instance.add("Paolo", 8);
        Object result = instance.head();
        Object expResult = "Paolo";
        System.out.println("Your Priority Queue: " + instance);
        System.out.println("Result of Head: " + instance.head());

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
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue(2);
        System.out.println("Checking empty queue: " + instance);
        assertTrue(instance.isEmpty());

        try {
            instance.add("Tony", 8);
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
        instance.add("Heidi", 3);
        instance.add("Marc", 2);
        instance.remove();
        Object result = instance.head();
        Object expResult = "Marc";
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("\n" + "isEmpty()");
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue(1);
        System.out.println("Your Empty Priority Queue: " + instance);
        instance.isEmpty();
        try {
            System.out.println("Priority Queue after using .isEmpty: " + instance);
        } catch (AssertionError e) {
            System.out.println("Error log: " + e);
        }
    }

    /**
     * Test of toString method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testToString() {

        System.out.println("\n" + "toString()");
        UnsortedArrayPriorityQueue instance = new UnsortedArrayPriorityQueue(2);
        try {
            int a = 500;
            instance.add(a, 4);
        } catch (QueueOverflowException ex) {
            Logger.getLogger(SortedArrayPriorityQueueTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Your Empty Priority toString(): " + instance.toString());
    }

}
