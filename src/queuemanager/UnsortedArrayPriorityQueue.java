
package queuemanager;

/**
 *
 * @author lukas
 */
public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T>{
    
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
    
    @Override
    public T head() throws QueueUnderflowException {
        throw new QueueUnderflowException();
        }

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        throw new QueueOverflowException(); 
    }

    @Override
    public void remove() throws QueueUnderflowException {
        throw new QueueUnderflowException();
    }

    @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }
    
    
    // same as in ordered Array
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + storage[i];
        }
        result = result + "]";
        return result;
    }
    
}
