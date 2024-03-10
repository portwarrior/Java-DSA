public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,8,9};
        int[] brr={9,8,7,6,5,4,3,2,1,1};
        int target1=3;//ans=2
        int target2=3;// ans=6

        System.out.println(OABS(arr, target1));
        System.out.println(OABS(brr, target2));
    }

    static int OABS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        boolean isAsc=arr[start]<arr[end];
        // if(arr[start]<arr[end]){
            // isAsc=true; same functionality as line 10

        while (start<=end) {
            //find the middle element
            //int mid=start+end/2; //possible that the start+end exceeds the int limit
            int mid=start+(end-start)/2; 
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
