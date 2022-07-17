/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package queuemanager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author heidi
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({queuemanager.QueueManagerTest.class, queuemanager.PriorityItemTest.class, queuemanager.PersonTest.class, queuemanager.SortedArrayPriorityQueueTest.class, queuemanager.PriorityQueueTest.class, queuemanager.QueueUnderflowExceptionTest.class, queuemanager.QueueOverflowExceptionTest.class})
public class QueuemanagerSuite {
    
}
