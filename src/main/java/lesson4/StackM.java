package lesson4;

import lesson1.MyClass;
import java.util.LinkedList;

public class StackM {
    private final LinkedList<MyClass> stack;

    public StackM(LinkedList<MyClass> stack) {
        this.stack = stack;
    }

    public void push(MyClass item) {
        stack.addLast(item);
    }

    public MyClass pop() throws Exception {
        if (stack.isEmpty()) {
            throw new Exception("The stack is empty");
        }

        MyClass result = stack.getLast();
        stack.removeLast();
        return result;
    }

    public MyClass peek() throws Exception {
        if (stack.isEmpty()) {
            throw new Exception("The stack is empty");
        }

        MyClass result = stack.getLast();
        return result;
    }

    public boolean isEmpty() {
        return (stack.size() == 0);
    }
}