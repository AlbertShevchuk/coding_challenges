//Given a time in -hour AM/PM format, convert it to military (24-hour) time.

static String timeConversion(String s) {
        String[] tokens = s.split(":");
        String[] lastTwo = tokens[2].split("(?<=\\d)(?=\\D)");
        
        if(lastTwo[1].equals("PM")){
            if (Integer.parseInt(tokens[0]) != 12 )
                tokens[0] = String.valueOf(Integer.parseInt(tokens[0]) + 12);//convert to integer frist, add the 12, then convert back into the string
            
        } else if (tokens[0].equals("12"))
            tokens[0] = "00";            
           
        return (tokens[0] + ":" + tokens[1] + ":" + lastTwo[0]);    
    }

