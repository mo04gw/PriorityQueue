/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package queuemanager;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author heidi
 *
 * @References: 
 * - “Getting Started with Junit in NetBeans”. YouTube, YouTube, 2 Feb. 2017, https://www.youtube.com/watch?v=Vnyeq3ZS_1Q.
 * - "JUnit Best Practices Guide", "How to Do in Java", 26 Dec. 2020, Lokesh Gupta, https://howtodoinjava.com/best-practices/unit-testing-best-practices-junit-reference-guide/"
 *
 * @Notes I understand that the correct guidelines are that I shouldn't be
 * printing out in unit tests, but it helped me to understand the code provided
 * and future implementations.
 */
public class SortedArrayPriorityQueueTest {

    public SortedArrayPriorityQueueTest() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of head method, of class SortedArrayPriorityQueue. Adding two
     * instances, displaying the queue && log errors if test failed
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("\n" + "head()");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(2);
        instance.add("Heidi", 1);
        instance.add("Marc", 2);
        Object expResult = "Marc";
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
     * Test of add method, of class SortedArrayPriorityQueue. First: display an
     * empty queue, making sure is empty. Second: add a new instance and display
     * again the queue
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add()");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(1);
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
     * Test of remove method, of class SortedArrayPriorityQueue. Adding two
     * instances and displaying the queue after removing one of them
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("\n" + "remove()");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(2);

        instance.add("Heidi", 1);
        instance.add("Marc", 2);

        System.out.println("Your Priority Queue: " + instance);
        try {
            instance.remove();
            System.out.println("Priority Queue after using .remove: " + instance);
        } catch (AssertionError e) {
            System.out.println("Error log: " + e);
        }
    }

    /**
     * Test of isEmpty method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("\n" + "isEmpty()");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(0);
        System.out.println("Your Empty Priority Queue: " + instance);

        try {
            instance.isEmpty();
            System.out.println("Priority Queue after using .isEmpty: " + instance);
        } catch (AssertionError e) {
            System.out.println("Error log: " + e);
        }
    }

    /**
     * Test of toString method, of class SortedArrayPriorityQueue. Transform an
     * int parameter to String
     */
    @Test
    public void testToString() {
        System.out.println("\n" + "toString()");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(2);
        try {
            int a = 500;
            instance.add(a, 4);
        } catch (QueueOverflowException ex) {
            Logger.getLogger(SortedArrayPriorityQueueTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Your Empty Priority toString(): " + instance.toString());
    }
}
