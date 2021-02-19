 //Given a square matrix, calculate the absolute difference between the sums of its diagonals.

 public static int diagonalDifference(List<List<Integer>> arr) {
        
      int left = 0, right = 0;
      
      for(int i = 0; i < arr.size(); i++ ){
          right = right + arr.get(i).get(i);  
          left = left + arr.get(arr.size() - i - 1).get(i);
          }
          
        return Math.abs(right - left);  
   
    }
	
	
