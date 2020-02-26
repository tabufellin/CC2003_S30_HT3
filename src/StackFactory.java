public class  StackFactory<E> {
    public Object getStack(String entry) {
        entry = entry.toLowerCase();
        switch (entry) {
            case "arraylist":
                return new StackArrayList<E>();
            case "vector":
                return new StackVector<E>();
            case "list":
                return new ListSingle<E>();        //Change to return new List<>();

            case "listDouble":
                return new DoubleList<E>();
            case "circular":
                return new CircularList<E>();
            default:
                return null;
        }
    }
}
