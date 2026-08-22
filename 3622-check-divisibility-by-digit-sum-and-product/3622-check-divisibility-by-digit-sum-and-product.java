class Solution {
    public boolean checkDivisibility(int n) {
        int s=0, p=1, dig=0, sum = 0,rev=0;
        int org = n;
        while(n>0){
            dig = n%10;
            s += dig;
            n = n/10;
        } 
        n = org;
        while(n>0){
            rev = n%10;
            p *= rev;
            n = n/10;
        }
    
        sum = s+p;
        if(org%sum == 0) 
        {
            return true;
        }
        else  return false;
        
    }
}