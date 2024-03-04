
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
        if (tailIndex + 1 >= capacity) {
            System.out.println("Storage full, resizing");
            resize();
        }
        storage[++tailIndex] = new PriorityItem<>(item, priority);
    }

    @Override
    public void remove() throws QueueUnderflowException {
        int removeIndex = 0;
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }else {
            int highestPriority = ((PriorityItem<T>)storage[0]).getPriority();
            for (int i = 0; i < tailIndex; i++) {
                if (((PriorityItem<T>)storage[i]).getPriority() > highestPriority){
                    highestPriority = ((PriorityItem<T>)storage[i]).getPriority();
                    removeIndex = i;
                }
            }
            storage[removeIndex] = storage[tailIndex];
            tailIndex--;
            
        }
    }

    @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }
    
    // function for resizing or doubleing the array
    private void resize() {
        //local variable takes current arraysize and doubles it
        int newSize = capacity * 2;
        //new container where we will copy the items from old container to
        Object[] newStorage = new Object[newSize];
        System.arraycopy(storage, 0, newStorage, 0, storage.length);
        storage = newStorage;
        capacity = newSize;
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
