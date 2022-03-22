package algorithms;

import java.util.Arrays;

public class MergeSort {

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7, 9, 0, 1, 2, 12};
        sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // find the middle point
            sort(arr, left, mid); // sort first halve
            sort(arr, mid + 1, right); // sort second halve
            merge(arr, left, mid, right); // merge the sorted halves
        }
    }

    static void merge(int arr[], int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int leftSubArraySize = mid - left + 1;
        int rightSubArraySize = right - mid;

        /* Create temp arrays */
        int L[] = new int[leftSubArraySize];
        int R[] = new int[rightSubArraySize];

        /*Copy data to temp arrays*/
        for (int i = 0; i < leftSubArraySize; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < rightSubArraySize; ++j)
            R[j] = arr[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;

        while (i < leftSubArraySize && j < rightSubArraySize) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < leftSubArraySize) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < rightSubArraySize) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}