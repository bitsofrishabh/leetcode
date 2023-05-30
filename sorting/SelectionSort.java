package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 1, 3, 12, 23, 121, 456, 21, 753, 234, 12, 5345, 2, 2424, 3, 2434, 324, 233, 2432444,
                42324423, 11231, 65, 3453, 2342, };
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = 0;
            for (int j = 1; j <= last; j++) {
                if (arr[max] < arr[j]) {
                    max = j; // find the max item in the remaining array and swap with correct index
                }
            }
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
    }
}
