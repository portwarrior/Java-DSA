package Recursion.src;

public class BinarySearch {
    
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) return -1;
    
        int m = s + (e - s) / 2;
    
        if (arr[m] == target) {
            return arr[m];
        }
    
        if (arr[m] < target) {
            s = arr[m];
            return search(arr, target, s, e);
        }
        
        if (arr[m] > target) {
            e = arr[m - 1];
            return search(arr, target, s, e);
        }
        
        return -1;
    }
}


