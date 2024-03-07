public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,1,11,12,353,12,54,32,8,1,5,8,35,212,5,23132,865,456332,32,8,564,65,123,5,231,56,8,9,98,564,12};
        System.out.println("This uses a normal for loop " +Maximum(arr));
        System.out.println("This uses a for each loop "+Maximum2(arr));
    }

    static int Maximum(int[] arr){
        int max=0; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int Maximum2(int[] arr){
        int max1=0;
        for(int ele:arr){
            if(ele>max1){
                max1=ele;
            }
        }
        return max1;
    }
}
