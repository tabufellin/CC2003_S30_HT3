/**
 * <h1>Stack</h1>
 * Interface for the stack used in the calculator
 * <p>
 *
 * @author Sebastian Gonzales (tabufellin) Pablo Ruiz (PingMaster99)
 * @version 1.0
 * @since 2020-02-26
 **/
public interface Stack<E> {
    void push(E item);
    E pop();
    E peek() throws Exception;
    boolean empty();
    int size();
}
