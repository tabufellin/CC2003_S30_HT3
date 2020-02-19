import java.util.ArrayList;

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
