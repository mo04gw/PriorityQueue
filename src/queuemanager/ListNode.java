
package queuemanager;

/**
 *
 */
public class ListNode<T> {
    private PriorityItem<T> item;
    private ListNode<T> next;
    
    //Constructor
    public ListNode(PriorityItem<T> item, ListNode<T> next) {
        this.item = item;
        this.next = next;
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
}
