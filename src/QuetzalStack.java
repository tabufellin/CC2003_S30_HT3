import java.util.ArrayList;
/**
 * <h1>QuetzalStack</h1>
 * This class contains the methods that define available operations on the stack.
 * <p>
 *
 * @author Sebastian Gonzales (tabufellin) Pablo Ruiz (PingMaster99)
 * @version 1.0
 * @since 2020-02-04
 **/
public class QuetzalStack<E> implements Stack<E> {

    Stack<E>  stack;


    public QuetzalStack (String tipoElegido) {
        StackFactory<E> sf = new StackFactory<>();
        stack = (Stack<E>) sf.getStack(tipoElegido);

    }

    /**
     * This method is used to push items into the stack.
     * @param item the item to be pushed into the stack.
     */
    public void push(E item) {
        stack.push(item);
    }

    /**
     * This method is used to pop (remove) the last item from the stack.
     * @return E generic type with the contents of the last item.
     */
    public E pop() {
        return stack.pop();
    }

    /**
     * This method is used to obtain the last element in the stack
     * without removing it.
     * @return E generic type with the contents of the last item.
     */
    public E peek() throws Exception {
            return stack.peek();
    }

    /**
     * This method checks if the stack is empty or not.
     * @return boolean true-> stack is empty false-> it is not.
     */
    public boolean empty() {
            return stack.empty();
    }

    /**
     * This method is used to obtain the amount of elements
     * in the stack.
     * @return int number of elements in the stack.
     */
    public int size() {
            return stack.size();

    }

}
