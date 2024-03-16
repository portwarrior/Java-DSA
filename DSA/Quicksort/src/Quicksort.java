import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {20, 30, 221, 304, 12, 34, 12, 120};
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void QuickSort(int[] arr, int l, int h) {
        if (l < h) {
            int j = partition(arr, l, h);
            QuickSort(arr, l, j);
            QuickSort(arr, j + 1, h);
        }
    }

    static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l - 1;
        int j = h + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j)
                return j;

            swap(arr, i, j);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
