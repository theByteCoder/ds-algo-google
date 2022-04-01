package algorithms;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {9, 6, 2, 1, 4, 3, 5, 8, 7, 0};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right); // pi is partitioning index, arr[p] is now at right place
            sort(arr, left, partitionIndex - 1); // Separately sort elements before partition and after partition
            sort(arr, partitionIndex + 1, right);
        }
    }

    static int partition(int[] arr, int left, int right) {
        int pivot = arr[right]; // pivot

        // Index of smaller element and indicates the right position of pivot found so far
        int i = left - 1;
        for (int j = left; j <= right - 1; j++) {
            if (arr[j] < pivot) { // If current element is smaller than the pivot
                i++; // Increment index of smaller element
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

}
