package lesson3;

import lesson1.MyClass;

import java.util.Iterator;
import java.util.LinkedList;

public class HomeWork2 {
    public static void main(String[] args) {

        //task 4

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        System.out.println(linkedList);
        linkedList.set(0, "1");
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.addFirst("Zero");

        LinkedList<MyClass> myClassLinkedList = new LinkedList<>();

        myClassLinkedList.add(new MyClass(new Integer[]{1, 2, 3}));
        myClassLinkedList.add(new MyClass(new Integer[]{4, 5, 6}));
        myClassLinkedList.add(new MyClass(new Integer[]{7, 8, 9}));

        //task 5

        long startTime = System.nanoTime();

        Iterator<String> stringIterator = linkedList.iterator();

        while (stringIterator.hasNext()){
            System.out.print(stringIterator.next() + " ");
            stringIterator.remove();
        }
        System.out.println();


        Iterator<MyClass> myClassIterator = myClassLinkedList.iterator();

        while (myClassIterator.hasNext()) {
            myClassIterator.next().print();
            myClassIterator.remove();
        }

        System.out.println("task 5 time: " + (System.nanoTime() - startTime));
    }
}