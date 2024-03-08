public class Wealth {
    public static void main(String[] args) {
        //this is question 1672 from leetcode
        //the question asks the to write a program that essentially has a 2d array and the outer array is the bank. Each inner array is the account of a person wholding money in the bank. The total wealth of the person is the sum of all the integers present within the inner arrays.
        //we have to find the customer with the most wealth
        int[][] arr={{92,213},{1667,43},{21332,5489},{78513,8756231}};
        System.out.println(details(arr));
    }

    static String details(int[][] arr){
        int index=0;
        int counter=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                counter+=arr[i][j];
                if(counter>max){
                    max=counter;
                    index=i+1;
                }
            }
            counter=0;
        }
        return "The person with the most amount of money is "+index +" and they hold $"+max;
    }
}
