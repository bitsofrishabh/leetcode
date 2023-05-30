package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };

        // Bubble Sort start
        // Time complexity - O(n^2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        // Bubble Sort Ends
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
