//return the count of the highest number

public static int birthdayCakeCandles(List<Integer> candles) {
    
    int largCnd = 0;
    int largCndSum = 0;
    
    for(int i = 0; i < candles.size(); i++)
    {
        if(candles.get(i) > largCnd)
        {
            largCnd = candles.get(i);
            largCndSum = 1;
        }
        else if(candles.get(i) == largCnd)
            largCndSum++;
    } 

    return (largCndSum);

    }

