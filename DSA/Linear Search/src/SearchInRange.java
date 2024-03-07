public class SearchInRange {
    public static void main(String[] args) {
        int a=3;
        int b=10;
        int[] arr={1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
        int target=7;
        System.out.println(RangeSearch(arr,a,b,target));
        b=20;
        a=-1;
        System.out.println(RangeSearch(arr,a,b,target));
    }   

    //search for 3 in the given range 

    static int RangeSearch(int[] arr,int a,int b,int target){
        if(arr.length<0){
            return 0;
        }
        if(a<0){
            return 0;
        }
        if(b>arr.length){
            return 0;
        }
        for(int i=a;i<=b;i++){
            if(arr[i]==target){
                return i ;
            }
        }
        return -1;
    }
}
