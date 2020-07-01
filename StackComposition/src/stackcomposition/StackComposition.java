package stackcomposition;

import java.util.ArrayList;

public class StackComposition<E> {

    private ArrayList<E> stackList;

    // no-argument constructor
    public StackComposition() {
        stackList = new ArrayList<>();
    }


    // add object to stack
    public void push(E object) {
        stackList.add(0, object);
    }


    // remove object from stack
    public E pop() throws IndexOutOfBoundsException {
        return stackList.remove(0);
    } // end method pop

    // determine if stack is empty
    public boolean isEmpty() {
        return stackList.isEmpty();
    }


    // get the Object in the stack top
    public E peek() {
        return stackList.get(0);
    }

    // output stack contents
    public String toString() {
        return stackList.toString();
    }
}
