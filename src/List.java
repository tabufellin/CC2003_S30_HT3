public interface List<E> {

    E remove(int i);
    void add(int i, E object);
    E get(int i) throws Exception;
    int size();
    boolean isEmpty();

}
