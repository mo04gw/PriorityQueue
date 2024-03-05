
package queuemanager;


public class ListNode<T> {
    // stores the Item we want to save
    private final PriorityItem<T> item;
    // pointer to the next node
    private ListNode<T> next;
    
    /*Constructor
    * @param item to store priority and name
    * @next stores the pointer to the next node
    */
    public ListNode(PriorityItem<T> item) {
        this.item = item;
        this.next = null;
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

    public void setNext(ListNode<T> next) {
        this.next = next;
    }
}
