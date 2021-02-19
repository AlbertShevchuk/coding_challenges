 //The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n
 
 static void staircase(int n) {
        
    String hashtag = "#";
    
        for(int i = 0; i < n; i++){
            
            System.out.print(String.format("%" + n + "s" ,hashtag));
            System.out.print(System.lineSeparator());
            hashtag += "#";
        } 
    }

