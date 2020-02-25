public class StackEjemplo {
    public static void main(String[] args) {
        StackFactory<Integer> myStack = new StackFactory<Integer>();
        // Generates new stacks according to the input
        Stack<Integer> integerStackArrayList =  myStack.getStack("arraylist");
        Stack<Integer> integerStackVector = myStack.getStack("vector");
        Stack<Integer> nullStack = myStack.getStack("WASD");

        // Pushes values into the stack
        integerStackArrayList.push(123);
        integerStackVector.push(987654321);

        // Prints the result of the operations applied to the respective stacks
        System.out.println("integerStackArray " + integerStackArrayList.peek());
        System.out.println("integerStackVector " + integerStackVector.peek());
        System.out.println("nullStack " + nullStack);
    }
}
