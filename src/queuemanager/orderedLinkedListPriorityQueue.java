
package queuemanager;

/**
 *
 * @author lukas
 * @param <T>
 */
public class OrderedLinkedListPriorityQueue<T> implements PriorityQueue<T>  {
   
    private ListNode<T> top;
    private ListNode<T> tail;
    
    public OrderedLinkedListPriorityQueue() {
        top = null;
        tail = null;
        
    }

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        PriorityItem<T> new_item = new PriorityItem(item, priority);
        ListNode<T> new_Node = new ListNode(new_item, null);
        
        
        if(top == null) {
            top = tail = new_Node;
        }
        ListNode<T> current = top;
        while (current.getNext() != null && current.getItemPriority() < new_Node.getItemPriority()) {
            current = current.getNext();
        }
        new_Node.next = current.getNext();
        current.next = new_Node;
    }

    @Override
    public T head() throws QueueUnderflowException {
        if(isEmpty()){
            throw new QueueUnderflowException();
        }
        return top.getListItem();
        
    }

    @Override
    public void remove() throws QueueUnderflowException {
        
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
