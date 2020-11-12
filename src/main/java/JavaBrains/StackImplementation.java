package JavaBrains;

/*
    Implement stack with API same to original Java 8 API.
    Thus:
        -> push(arg)
        -> pop() => return item + removes from stack
        -> peek() -> reference to top item

    Stack should be generic.

 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class StackImplementation<E> {

    private E[] stack;

    private int indexOfAccess = 0;


    @SuppressWarnings("unchecked")
    public StackImplementation(int stackInitialLength) {
        //initialize stack generic array and length
        stack = (E[]) Array.newInstance(StackImplementation.class, stackInitialLength);
    }

    @SuppressWarnings("unchecked")
    private void resizeArray(){
        E[] resizedStack = (E[]) Array.newInstance(StackImplementation.class, stack.length * 2);

    }

    public void push(E arg){
        stack[indexOfAccess] = arg;
        indexOfAccess ++;
    }

    public E pop(){
        int readPrevious = indexOfAccess - 1;

        //move back index
        indexOfAccess--;

        return stack[readPrevious];
    }

    public E[] getStack(){
        return stack;
    }
}
