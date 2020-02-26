public class StackFactory<E> {
    public Stack<E> getStack(String entry) {
        entry = entry.toLowerCase();
        if(entry == "arraylist") {
            return new StackArrayList<>();
        } else if (entry == "vector") {
            return new StackVector<>();
        } else if (entry == "list") {
            return null;        //Change to return new List<>();
        } else {
            return null;
        }
    }
}
