package lesson6;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(new Person(4, "User1", 18));
        tree.insert(new Person(2, "User2", 24));
        tree.insert(new Person(3, "User3", 30));
        tree.insert(new Person(5, "User4", 36));
        tree.insert(new Person(1, "User5", 42));
        tree.insert(new Person(6, "User6", 48));

        tree.findMax().display();
        tree.findMin().display();
        tree.find(4).display();
        tree.delete(3);
        tree.displayTree();

        int maxSize = 40;
        int[] array = new int[maxSize];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxSize);
        }

        System.out.println("\n" + Arrays.toString(array));

        HeapSort.sort(array);

        System.out.println("\n" + Arrays.toString(array));
    }
}
