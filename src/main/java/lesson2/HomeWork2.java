//задания с 2.3 и до конца

package lesson2;

import java.util.Arrays;
import java.util.Random;

public class HomeWork2 {
    static long startTime;
    public static void main(String[] args) {
        int[] array, copyOfArray;
        array= new int[400];
        Random random = new Random();

        for (int i=0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        //System.out.println(Arrays.toString(array));
        copyOfArray = Arrays.copyOf(array, array.length);

        startTime = System.nanoTime();
        Arrays.sort(array);
        System.out.println("Array sorted in " + (System.nanoTime() - startTime) + " ns");

        array = Arrays.copyOf(copyOfArray, copyOfArray.length);
        bubbleSort(array);

        array = Arrays.copyOf(copyOfArray, copyOfArray.length);
        selectSort(array);

        array = Arrays.copyOf(copyOfArray, copyOfArray.length);
        insertSort(array);
    }

    static void bubbleSort(int[] array){
        startTime = System.nanoTime();
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]){
                    swap(array, j, j+1);
                }
            }
        }
        System.out.println("Bubble: array sorted in " + (System.nanoTime() - startTime) + " ns");
    }

    static void selectSort(int[] array){
        startTime = System.nanoTime();
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]){
                    min = j;
                }
            }
            swap(array, i, min);
        }
        System.out.println("Select: array sorted in " + (System.nanoTime() - startTime) + " ns");
    }

    static void insertSort(int[] array){
        startTime = System.nanoTime();
        int temp, in;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            in = i;
            while (in > 0 && array[in - 1] >= temp){
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
        System.out.println("Insert: array sorted in " + (System.nanoTime() - startTime) + " ns");
    }

    static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}