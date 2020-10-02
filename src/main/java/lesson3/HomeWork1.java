package lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {

        //task 1
        String[] myArray = {"1", "2", "3", "4", "5"};

        for (String s: myArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        long startTime = System.nanoTime();

        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(myArray));

        System.out.println(stringArrayList);

        System.out.println("task 1 time: " + (System.nanoTime() - startTime));

        //task 2

        startTime = System.nanoTime();

        stringArrayList.add("6");
        stringArrayList.remove(0);

        System.out.println(stringArrayList.get(1));

        System.out.println("task 2 time: " + (System.nanoTime() - startTime));

        //task 3

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.insert("One");
        linkedList.insert("Two");
        linkedList.display();
    }
}
