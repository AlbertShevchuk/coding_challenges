 //Given the coordinates of the starting position of the red knight and the coordinates of the destination, print the minimum number of moves that the red knight has to make in order to reach the destination 
  
  static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
    
    int steps = 0;
    int[] current = {i_start, j_start};
    boolean flag = true;
    
    ArrayList<String> directions = new ArrayList<String>();
    
    
    while(flag)
    {
        if(i_end - current[0] > 0) {  //MOVING RIGHT -->
            if(j_end - current[1] >= 0) {  //MOVING LOWER
                current[1] += 1;
                current[0] += 2;
                directions.add("LR");
              //  System.out.print(" LR ");
                steps++;
            }
            if(j_end - current[1] < 0) {  //MOVING LOWER
                    current[1] -= 1;
                    current[0] += 2;
                    directions.add("LL");
                    steps++;
                }
           
            if(j_end - current[1] < -1) { //MOVING UPPER ^
                current[1] += 1;
                current[0] -= 2;
                directions.add("UR"); 
                steps++;
            }
        }
        else if(i_end - current[0] < 0){ //MOVING LEFT <--
               
                if(j_end - current[1] < -1) { //MOVING UPPER ^
                    current[1] -= 1;
                    current[0] -= 2;
                    directions.add("UL"); 
                    steps++;
                }
        }
        else if (i_end == current[0]){ //new
        
         if(j_end - current[1] < -1){ // JUST MOVING LEFT <--
                    current[1] -= 2;
                    directions.add("L");
                    steps++;
                }
            if(j_end - current[1] > 1){ // JUST MOVING RIGHT -->
                current[1] += 2;
                directions.add("R");
                steps++;
            }     
                
        }
        else if(current[0] < 0 || current[1] < 0)  {
            flag = false;
            System.out.print("Impossible");
        }
        
        if((current[0] == i_end) && (current[1] == j_end)){
            System.out.print(steps + "\n");
            
            for(int i = 0; i < directions.size(); i++){
                System.out.print(directions.get(i) + " ");
            }
            
            flag = false;
        }
    }

    }       
            for(int i = 0; i < directions.size(); i++){
                System.out.print(directions.get(i) + " ");
            }
            
            flag = false;
        }
    }

    }

	
	
