public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={{1,23,4,5,3,5,4,8,1},{1232123,1312,23123,54564,1232},{},{123,23123,1,21,232,5,456,2,87,9},{789,785,4231,23,54,6321,32},{87,897,89,7,89,465,5,12,1324,578,312},{1312312,12,32123,54,65,4,54,465,464,5454564,5}};
        System.out.println(ArraySearching(arr,1232123));
    }

    static String ArraySearching(int[][] arr, int target){
        if(arr.length<=0){
            return "Invalid";
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i].length!=0){
                for(int j=0;j<arr[i].length;j++){
                    if(arr[i][j]==target){
                        String s="The element is located at outer array : " +i + " at index " +j; 
                        return s;
                    }
                }
            }
        }
        return "Not present";
    }
}
