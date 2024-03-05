
package queuemanager;

/**
 *
 * @author lukas
 */
public class OrderedLinkedListPriorityQueue<T> implements PriorityQueue<T>  {
   
    private ListNode<T> top;
    
    public OrderedLinkedListPriorityQueue() {
        top = null;
    }

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        
    }

    @Override
    public T head() throws QueueUnderflowException {
        return 
    }

    @Override
    public void remove() throws QueueUnderflowException {
        
    }

    @Override
    public boolean isEmpty() {
        
    }
}
