import java.util.NoSuchElementException;
/**
 * this class contains the required methods for the Double linked list implementation
 *
 * @author java2novice
 * Edited by @tabufellin @PingMaster99
 *
 * Retrieved from https://www.java2novice.com/data-structures-in-java/linked-list/doubly-linked-list/
 */
public class DoubleList<E> extends List<E> {

    private Node head;
    private Node tail;
    private int size;

    private boolean firstPush = true;

    public DoubleList() {
        size = 0;
    }

    private class Node {
        E element;
        Node next;
        Node prev;

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * returns the size of the linked list
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * adds element at the end of the linked list (due to the nature of a stack, only this is needed)
     *
     * @param element
     */
    public void push(E element) {
        if(firstPush) {
            addFirst(element);
            this.firstPush = false;
        }
        Node tmp = new Node(element, null, tail);
        if(tail != null) {tail.next = tmp;}
        tail = tmp;
        if(head == null) { head = tmp;}
        size++;
    }


    public E peek() throws Exception {
        return tail.element;
    }


    public void addFirst(E element) {
        Node tmp = new Node(element, head, null);
        if(head != null ) {head.prev = tmp;}
        head = tmp;
        if(tail == null) { tail = tmp;}
        size++;
    }

    /**
     * this method removes element from the end of the linked list
     *
     * @return
     */
    public E pop() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        return tmp.element;
    }
}
