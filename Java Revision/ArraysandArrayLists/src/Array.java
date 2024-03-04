public class Array {
    public static void main(String[] args) {
        //Array objects are in heaps
        //We then understand that heaps are not continuous
        //So Arrays are may or may not be continuous 
        //So it all depends on the jvm

        int[] arr=new int[3];
        adding(arr);
        

        int[][] arr2d=new int[5][];
        int[][] arr2da={
            {1,2,3,4,5,6,2},
            {1,21,2},
            {1}
        };
        adding2d(arr2da);
    }

    static void adding(int[] ar){
        for(int i=0;i<ar.length;i++){
            ar[i]=i;
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    static void adding2d(int[][] ar){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
