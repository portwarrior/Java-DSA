public class EvenDigits {
    public static void main(String[] args) {
        int[] arr={1,12,1234,123,456,7899};//4
        System.out.println(EvenDigits(arr));
    }
    static int EvenDigits(int[] arr){
        int count=0;
        for(int i:arr){
            if(even(arr)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int[] arr){
        
    }


    // static int EvenDigit(int[] arr){
    //     int counter=0;
    //     if(arr.length==0){
    //         return 0;
    //     }
    //     //create a new array in the string format
    //     String[] s=new String[arr.length];
    //     for(int k=0;k<arr.length;k++){
    //         s[k]=String.valueOf(arr[k]);
    //     }

    //     //traversing through array to check for indexes
    //     for(int i=0;i<s.length;i++){
    //         if(s.length%2==0){
    //             counter++;
    //         }
    //     }
    //     return counter;
    // }   
}
