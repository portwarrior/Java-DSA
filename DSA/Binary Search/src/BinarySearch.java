public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-12,1,2,3,4,56,78,90,450,600,2310,5200,5400};
        int target=600;
        int ans=binarySearching(arr, target);
        System.out.println(ans);
    }
    

    static int binarySearching(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            //find the middle element
            //int mid=start+end/2; //possible that the start+end exceeds the int limit
            int mid=start+(end-start)/2; 

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
