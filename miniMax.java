//Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers
public class Solution {
    
    static void miniMaxSum(int[] arr) {
    long min = 0;
    long max = 0;
    
    Arrays.sort(arr);
       
        for(int i = 0; i < arr.length; i++)  
        {
            if(i != 0)
                max += arr[i];
            if(i+1 != (arr.length))
                min += arr[i];
        }
    System.out.print(min + " " + max);
    
    }
