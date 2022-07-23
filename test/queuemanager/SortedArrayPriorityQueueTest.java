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
 * 
 * @References: “Getting Started with Junit in NetBeans.” YouTube, YouTube, 2
 * Feb. 2017, https://www.youtube.com/watch?v=Vnyeq3ZS_1Q. 
 *
 */
public class SortedArrayPriorityQueueTest {

    public SortedArrayPriorityQueueTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of head method, of class SortedArrayPriorityQueue.
     * Adding two instances, displaying the queue && log errors if test failed
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head()");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(2);
        instance.add("Heidi", 1);
        instance.add("Marc", 2);
        Object expResult = "Marc";
        System.out.println("Your Priority Queue: " + instance);
        System.out.println("Result of Head: " + instance.head());
        Object result = instance.head();
        try{
            assertEquals(expResult, result);
            System.out.println("Good news - Test Passed!");
        }catch(AssertionError e){
            System.out.println("Oopsie, Test Failed");
            System.out.println("Error log: " + e);  
        }
         assertEquals(expResult, result);
    }
   

    /**
     * Test of add method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add()");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(1);
        
    }

    /**
     * Test of remove method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
    }

    /**
     * Test of isEmpty method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
    }

    /**
     * Test of toString method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testToString() {
    }

}
