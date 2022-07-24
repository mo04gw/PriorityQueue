/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queuemanager;

/**
 *
 * @author heidi
 *
 * @References: 
 * - “Sedgewick, R. and Wayne, K. (2000–2019)
 * ResizingArrayQueue.java - 1.3 Bags, Queues, and Stacks, Princenton
 * University, 2 Feb. 2017, Available at:
 * https://algs4.cs.princeton.edu/13stacks/ResizingArrayQueue.java.html
 * (Accessed: 23/07/2022)." 
 * 
 * - "Sridhar, A. (2020) Priority Queues in Java
 * Explained with Examples, FreeCodeCamp, Available at:
 * https://www.freecodecamp.org/news/priority-queue-implementation-in-java/
 * (Accessed: 24/07/2022)."
 *
 * @Notes: Using as reference/structure the SortedArrayPriorityQueue code
 * provided. Tests Failed, attempted to fix it.
 */
public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> {

    /**
     * Where the data is actually stored.
     */
    private final Object[] storage;

    /**
     * The size of the storage array.
     */
    private final int capacity;

    /**
     * The index of the last item stored.
     *
     * This is equal to the item count minus one.
     */
    private int tailIndex;

    /**
     * Create a new empty queue of the given size.
     *
     * @param size
     */
    public UnsortedArrayPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }

    /* Scan through the entire list. When removing an item, shift
down all the items after the one you’re removing so as to fill the gap */
    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {

            int priority = 0;
            /* (Storing head: location of highest priority item in the array) */
            int head = 0;
            int i = tailIndex + 1;
            /*(Following similar structure of while loop -> add() SortedArray)*/
            while (i > 0 && ((PriorityItem<T>) storage[i - 1]).getPriority() < priority) {

                priority = ((PriorityItem<T>) storage[i - 1]).getPriority();
                head = i - 1;
            }
            i = i - 1;
            return ((PriorityItem<T>) storage[head]).getItem();
        }
    }

    /* (Add: Items are inserted in order of arrival) */
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        tailIndex = tailIndex + 1;

        if (tailIndex >= capacity) {
            /* No resizing implemented, but that would be a good enhancement. */
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else {
            int i = tailIndex;
            storage[i] = new PriorityItem<>(item, priority);
        }
    }

    @Override
    public void remove() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            for (int i = 0; i < tailIndex; i++) {
                storage[i] = storage[i + 1];
            }
            tailIndex = tailIndex - 1;
        }
    }

    @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }

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
