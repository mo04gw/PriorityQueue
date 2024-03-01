
package queuemanager;

/**
 *
 * @author lukas
 */
public class UnsortedArrayPriorityQueue {
    
    /** 
     * I also will make use of the Core Object class and cast the 
     * Object later to the PriorityItem<T> when needed  
     */
    //the actual object, the thing saved to the array
    private Object[] storage;
    
    // size of the storage array
    private int capacity;
    
    private int tailIndex;
    
    public UnsortedArrayPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }
    
}
