public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,1,11,12,353,12,54,32,8,1,5,8,35,212,5,23132,865,456332,32,8,564,65,123,5,231,56,8,9,98,564,12};
        System.out.println(Minimum2(arr));
    }

    static int Minimum2(int[] arr){
        int min=0;
        for(int ele:arr){
            min=arr[0];
            if(ele<min){
                min=ele;
            }
        }
        return min;
    }
}
