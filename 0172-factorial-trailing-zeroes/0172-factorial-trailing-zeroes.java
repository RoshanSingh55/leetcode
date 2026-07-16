class Solution {
    public int trailingZeroes(int n) {
        if (n<5){
        return 0;
        }

        int trailzero = 0;
        while (n >= 5){
            n = n/5;
            trailzero = trailzero +n;
            
        }
        return trailzero;





    
        
    }
}