//Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.	
	public class Solution {

    static void plusMinus(int[] arr) {
       double posVal = 0;
       double negVal = 0;
       double zerVal = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]>0)
                posVal++;
            else if(arr[i]<0)
                negVal++;
            else
                zerVal++;
        }
        
        DecimalFormat numberFormat = new DecimalFormat("#.000000");
        
        System.out.println(numberFormat.format(posVal/arr.length));
        System.out.println(numberFormat.format(negVal/arr.length));
        System.out.println(numberFormat.format(zerVal/arr.length));

    }

	
	
