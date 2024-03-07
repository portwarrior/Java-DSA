public class LinearSearch {
    public static void main(String[] args) {
        //using linear search to search the array.
        //we will return the item if found but if not then we will return 1
        int[] abc={1,2,3,4,5,6,7,8,9};
        int target=7;
        System.out.println("This is giving the index of the element: "+searching(abc, target));
        target=2;
        System.out.println("This will return the element: "+ searching2(abc, target));
        target=10;
        System.out.println("This will return the boolean: "+ searching3(abc, target));
    }

    static int searching(int[] arr,int target){
        if(arr.length==0){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }            
        }
        return -1;
    }

    //to return the element
    static int searching2(int[] arr,int target){
        if(arr.length==0){
            return 0;
        }
        for(int i:arr){
            if(i==target){
                return i;
            }            
        }
        return -1;
    }

    //to return true or false
    static boolean searching3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int i:arr){
            if(i==target){
                return true;
            }            
        }
        return false;
    }
}
