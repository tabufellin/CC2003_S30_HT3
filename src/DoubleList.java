import java.util.NoSuchElementException;

/**
 * this class keeps track of each element information
 *
 * @author java2novice
 * Edited by @tabufellin @PingMaster99
 *
 * Retrieved from https://www.java2novice.com/data-structures-in-java/linked-list/doubly-linked-list/
 */
public class DoubleList<E> extends StackList<E> {

    private Node head;
    private Node tail;
    private int size;

    public DoubleList() {
        size = 0;
    }

    public class Node {
        E element;
        Node next;
        Node prev;

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public E getValue() {
            return element;
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
     * adds element at the end of the linked list
     *
     * @param element
     */
    public void add(int i, E element) {
        i = 0;
        Node tmp = new Node(element, null, tail);
        if (tail != null) {
            tail.next = tmp;
        }
        tail = tmp;
        if (head == null) {
            head = tmp;
        }
        size++;
        System.out.println("adding: " + element);
    }


    public E get(int i) throws Exception {
        Node aux = tail;
        return head.getValue();
    }

    /**
     * this method walks forward through the linked list
     */
    public void iterateForward() {

        System.out.println("iterating forward..");
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.element);
            tmp = tmp.next;
        }
    }

    /**
     * this method walks backward through the linked list
     */
    public void iterateBackward() {

        System.out.println("iterating backword..");
        Node tmp = tail;
        while (tmp != null) {
            System.out.println(tmp.element);
            tmp = tmp.prev;
        }
    }


    /**
     * this method removes element from the end of the linked list
     *
     * @return
     */
    public E remove(int i) {
        i = 0;
        if (size == 0) throw new NoSuchElementException();
        Node tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: " + tmp.element);
        return tmp.element;
    }
}
