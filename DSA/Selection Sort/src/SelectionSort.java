import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={32,46,13,54,32,12,4,12,23,41,1};
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSorting(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i;
            int maximumIndex = maxIndex(arr, 0, last);
            swapArr(arr, maximumIndex, last - 1); 
        }
    }
    
    static int maxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start + 1; i < end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    

    static void swapArr(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
