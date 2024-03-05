
package queuemanager;

/**
 *@author lukas 
 */
public class OrderedLinkedListPriorityQueue<T> implements PriorityQueue<T>  {
   
    //Attributes of the OrderedLinkedListPriorityQueue 
    //Stores the PriorityItem and the pointer to its next node
    private ListNode<T> top;
    //keeps track of the size of the list
    private int tail;
    
    //Constructor
    public OrderedLinkedListPriorityQueue() {
        //When initialized the list is empty and top will be null and also not pointing to any node.
        top = null;
        tail = 0;
        
        
    }
    
    /*  Mehtod to add a Person to the List
    * 
    */
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        //instanciating the new item and the new Node
        PriorityItem<T> new_item = new PriorityItem(item, priority);
        ListNode<T> new_Node = new ListNode(new_item);
        
        // checking if the new item is at the head of the queue
        if(top == null || top.getItemPriority() < new_item.getPriority()) {
            new_Node.setNext(top);
            top = new_Node;
        }
        // checking where to insert new item into the queue depending on priority
        ListNode<T> current = top;
        while (current.getNext() != null && current.getNext().getItemPriority() < new_Node.getItemPriority()) {
            current = current.getNext();
            // checking if the list is at the end and inserting new item at the end of the queue
            if(current.getNext() == null) {
                current.setNext(new_Node);
            }else {
                // inserting the new item at the position and changing where the new and old pointers are pointing to.
                new_Node.setNext(current.getNext());
                current.setNext(new_Node);
            }
        }
        //keeps incrementing to keep track of the size of the list
        tail++;
        
        
    }
    /* because the list is ordered this fiunction is very easy 
    *  if the list is not empty, the first item in the list will always be 
    *  the one with the highest priority
    */
    @Override
    public T head() throws QueueUnderflowException {
        if(isEmpty()){
            throw new QueueUnderflowException();
        }
        return top.getListItem();
    }

    @Override
    public void remove() throws QueueUnderflowException {
        if(isEmpty()){
            throw new QueueUnderflowException();
        }
        top = top.getNext();
        tail--;
    }

    
    // boolean method to check if the list is empty 
    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
