import java.util.ArrayList;
/**
 * <h1>StackArrayList</h1>
 * Stack in ArrayList form
 * <p>
 *
 * @author Sebastian Gonzales (tabufellin) Pablo Ruiz (PingMaster99)
 * @version 1.0
 * @since 2020-02-26
 **/
public class StackArrayList<E> extends AbstractStack<E> {

    private ArrayList<E> stackArray = new ArrayList<E>();

    public StackArrayList() {
        this.stackArray = stackArray;
    }

    public void push(E item) {
        stackArray.add(item);
    }

    public E pop() {
        return stackArray.remove(stackArray.size() - 1);
    }

    public E peek() {
        return stackArray.get(stackArray.size() - 1);
    }

    public int size() {
        return stackArray.size();
    }

}
