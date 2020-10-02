package lesson4;

import lesson1.MyClass;
import java.util.LinkedList;

public class QueueM {
    private final LinkedList<MyClass> queue;

    public QueueM(LinkedList<MyClass> queue) {
        this.queue = queue;
    }

    public void insert(MyClass item){
        queue.addLast(item);
    }

    public MyClass remove() throws Exception{
        if (queue.isEmpty()) {
            throw new Exception("The queue is empty");
        }
        MyClass result = queue.getFirst();
        queue.removeFirst();
        return result;
    }

    public MyClass peek() throws Exception{
        if (queue.isEmpty()) {
            throw new Exception("The queue is empty");
        }
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return (queue.size() == 0);
    }

    public int size(){
        return queue.size();
    }
}