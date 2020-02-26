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
    List<E> list;
    // if true entonces lista y si false entonces es stack
    boolean tipo;
    Stack<E>  stack;


    public QuetzalStack (String tipoElegido) {
        if (tipoElegido.equals("ArrayList")) {
            ArrayList<E> stack = new ArrayList<E>();
            tipo = false;

        }
        if (tipoElegido.equals("ListSingle")) {
            ListSingle<E> list = new ListSingle<E>();
            tipo = true;
        }
        if (tipoElegido.equals("CircularList")) {
            CircularList<E> list = new CircularList<E>();
            tipo = true;
        }
        if (tipoElegido.equals("StackVector")) {
            StackVector<E> stack = new StackVector<E>();
            tipo = false;
        }
        if (tipoElegido.equals("DoubleList")) {
            DoubleList<E> list = new DoubleList<E>();
            tipo = true;
        } else {
            ArrayList<E> stack = new ArrayList<E>();
            tipo = false;
        }
    }

    /**
     * This method is used to push items into the stack.
     * @param item the item to be pushed into the stack.
     */
    public void push(E item) {

        if (tipo) {
            list.add(list.size() - 1, item);
        } else {
            stack.push(item);
        }


    }

    /**
     * This method is used to pop (remove) the last item from the stack.
     * @return E generic type with the contents of the last item.
     */
    public E pop() {
        if (tipo) {
            return list.remove(list.size() - 1);
        } else {
            return stack.pop();
        }
    }

    /**
     * This method is used to obtain the last element in the stack
     * without removing it.
     * @return E generic type with the contents of the last item.
     */
    public E peek() throws Exception {
        if (tipo) {
            return list.get(list.size() - 1);
        } else {
            return stack.peek();
        }
    }

    /**
     * This method checks if the stack is empty or not.
     * @return boolean true-> stack is empty false-> it is not.
     */
    public boolean empty() {
        if (tipo) {
            return list.isEmpty();
        } else {
            return stack.empty();
        }
    }

    /**
     * This method is used to obtain the amount of elements
     * in the stack.
     * @return int number of elements in the stack.
     */
    public int size() {
        if (tipo) {
            return list.size();
        } else {
            return stack.size();
        }

    }

}
