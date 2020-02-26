import java.util.Vector;

public class StackVector<E> extends AbstractStack<E>{

    protected  Vector<E> stackArray;
    //private Vector<E> stackArray = new Vector<E>();

    public StackVector() {
        stackArray = new Vector<E>();
        //this.stackArray = stackArray;
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
