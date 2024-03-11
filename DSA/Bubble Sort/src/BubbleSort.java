import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,3,5,2,2,5,8,1};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSorting(int[] arr){
        //run the steps n-1 times
        boolean swap;
        for(int i=0;i<arr.length;i++){
            swap=false;
            //for each iteration the maximum item will come at the last index.

            for(int j=1;j<=arr.length-i-1;j++){
                //swap if the current item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }

            //if the swap didnt happen then we shuld break the code
            if(swap==false){
                break;
            }
        }

        

    }
}
