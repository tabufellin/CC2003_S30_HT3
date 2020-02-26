/**
 * <h1>AbstractStack</h1>
 * Abstract class for the stack factory
 * <p>
 *
 * @author Sebastian Gonzales (tabufellin) Pablo Ruiz (PingMaster99)
 * @version 1.0
 * @since 2020-02-26
 **/
public abstract class AbstractStack<E> implements Stack<E> {
    public boolean empty() {
        return size()==0;
    }
}
