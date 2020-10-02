package lesson4;

import lesson1.MyClass;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {

        LinkedList<MyClass> myClassLinkedList = new LinkedList<>();

        myClassLinkedList.add(new MyClass(new Integer[]{1, 4, 7}));
        myClassLinkedList.add(new MyClass(new Integer[]{2, 5, 8}));
        myClassLinkedList.add(new MyClass(new Integer[]{3, 6, 9}));

        LinkedList<MyClass> myClassLinkedListClone = new LinkedList<>(myClassLinkedList);

        //task 1
        long startTime = System.nanoTime();
        StackM stackM = new StackM(myClassLinkedList);
        stackM.peek().print();

        stackM.push(new MyClass(new Integer[]{0, 1, 2}));

        while (!stackM.isEmpty()){
            stackM.pop().print();
        }
        System.out.println("Task 1 time is: " + (System.nanoTime() - startTime) + " ns");
        System.out.println();
        myClassLinkedList.addAll(myClassLinkedListClone);

        //task 2
        startTime = System.nanoTime();
        QueueM queueM = new QueueM(myClassLinkedList);
        queueM.peek().print();

        queueM.insert(new MyClass(new Integer[]{0, 1, 2}));
        System.out.println("Queue size is: " + queueM.size());

        while (!queueM.isEmpty()){
            queueM.remove().print();
        }
        System.out.println("Task 2 time is: " + (System.nanoTime() - startTime) + " ns");
        System.out.println();
        myClassLinkedList.addAll(myClassLinkedListClone);

        //task 3
        startTime = System.nanoTime();
        DequeM dequeM = new DequeM(myClassLinkedList);
        dequeM.peekLast().print();
        dequeM.pushFront(new MyClass(new Integer[]{0, 1, 2}));

        while (!dequeM.isEmpty()){
            dequeM.popBack().print();
        }
        System.out.println("Task 3 time is: " + (System.nanoTime() - startTime) + " ns");
        System.out.println();
        myClassLinkedList.addAll(myClassLinkedListClone);

        //task 4
        startTime = System.nanoTime();
        PriorityQueueM priorityQueueM = new PriorityQueueM(5);
        priorityQueueM.insert(30);
        priorityQueueM.insert(50);
        priorityQueueM.insert(10);
        priorityQueueM.insert(40);
        priorityQueueM.insert(20);

        System.out.println(priorityQueueM.peek());

        while (!priorityQueueM.isEmpty()) {
            int item = priorityQueueM.pool();
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("Task 4 time is: " + (System.nanoTime() - startTime) + " ns");
    }
}