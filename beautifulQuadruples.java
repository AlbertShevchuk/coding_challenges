//We call an quadruple of positive integers. Beautiful if the following condition is true: A ^ B ^ C ^ D != 0

static long beautifulQuadruples(int a, int b, int c, int d) {
        
    int quad[] = {a,b,c,d};
    Arrays.sort(quad);
       
    final int MAX = 3000;
    final int MAX_XOR = 4096;
    
    int[] total = new int[MAX + 1];

        for (int i = 1; i <= quad[0]; i++) {
            for (int ii = i; ii <= quad[1]; ii++) {
                total[ii] += 1;
            }
        }
    
        for (int i = 1; i <= MAX; i++) {
            total[i] += total[i - 1];
        }
        
        int[][] count = new int[MAX + 1][MAX_XOR + 1];
        
        for (int i = 1; i <= quad[0]; i++) {
            for (int ii = i; ii <= quad[1]; ii++) {
                count[ii][i ^ ii] += 1;
            }
        }
        
        for (int i = 0; i <= MAX_XOR; i++) {
            for (int ii = 1; ii <= MAX; ii++) {
                count[ii][i] += count[ii - 1][i];
            }
        }

        long ans = 0;
        
        for (int i = 1; i <= quad[2]; i++) {
            for (int ii = i; ii <= quad[3]; ii++) {
                ans += (total[i] - count[i][i ^ ii]);
            }
        }
       
    return ans;
    }
