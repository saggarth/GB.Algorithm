package lesson6;

public class HeapSort {
    private static int heapSize;

    public static void sort (int[] array) {
        long startTime = System.nanoTime();
        buildHeap(array);
        while (heapSize > 1) {
            swap(array, 0, heapSize - 1);
            heapSize--;
            heapify(array, 0);
        }
        System.out.println("\nSort time: " + (System.nanoTime() - startTime) + " ns");
    }

    public static void buildHeap (int[] array) {
        heapSize = array.length;
        for (int i = array.length / 2; i >= 0 ; i--) {
            heapify(array, i);
        }
    }

    private static void heapify (int[] array, int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < heapSize && array[i] < array[l]) {
            largest = l;
        }
        if (r < heapSize && array[largest] < array[r]) {
            largest = r;
        }
        if (i != largest) {
            swap(array, i, largest);
            heapify(array, largest);
        }
    }

    private static int left (int i) {
        return 2 * i + 1;
    }

    private static int right (int i) {
        return 2 * i + 2;
    }

    private static void swap (int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}