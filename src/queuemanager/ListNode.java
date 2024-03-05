
package queuemanager;

/**
 *
 * @param <T> */
public class ListNode<T> {
    private final PriorityItem<T> item;
    private ListNode<T> next;
    private ListNode<T> previous;
    
    //Constructor
    public ListNode(PriorityItem<T> item, ListNode<T> next, ListNode<T> previous) {
        this.item = item;
        this.next = next;
        this.previous = previous;
    }
    
    //Getters
    
    public int getItemPriority() {
        return item.getPriority();
    }
    
    public T getListItem() {
        return item.getItem();
    }
    
    public ListNode<T> getNext() {
        return next;
    }
    
    public ListNode<T> getPrevious() {
        return previous;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public void setPrevious(ListNode<T> previous) {
        this.previous = previous;
    }
    
    
    
}
