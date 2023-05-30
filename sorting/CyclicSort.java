package sorting;

import java.lang.reflect.Array;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4 };
        System.out.println(Array.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
