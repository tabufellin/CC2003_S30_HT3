public interface Stack<E> {
    void push(E item);
    E pop();
    E peek() throws Exception;
    boolean empty();
    int size();
}
