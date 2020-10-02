package lesson4;

import lesson1.MyClass;
import java.util.LinkedList;

public class DequeM {
    private final LinkedList<MyClass> deque;

    public DequeM(LinkedList<MyClass> deque) {
        this.deque = deque;
    }

    public void pushBack(MyClass item){
        deque.addLast(item);
    }

    public void pushFront(MyClass item){
        deque.addFirst(item);
    }

    public MyClass popBack() throws Exception{
        if (deque.isEmpty()) {
            throw new Exception("The deque is empty");
        }
        MyClass result = deque.getLast();
        deque.removeLast();
        return result;
    }

    public MyClass popFront() throws Exception{
        if (deque.isEmpty()) {
            throw new Exception("The deque is empty");
        }
        MyClass result = deque.getFirst();
        deque.removeFirst();
        return result;
    }

    public MyClass peekFirst() throws Exception{
        if (deque.isEmpty()) {
            throw new Exception("The deque is empty");
        }
        return deque.getFirst();
    }

    public MyClass peekLast() throws Exception{
        if (deque.isEmpty()) {
            throw new Exception("The deque is empty");
        }
        return deque.getLast();
    }

    public boolean isEmpty() {
        return (deque.size() == 0);
    }

    public void clear(){
        deque.clear();
    }
}