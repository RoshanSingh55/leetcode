class Solution {
    public int Calculate(int n) {
        int sum = 0;
        while(n!=0){
         sum = sum + n%10;
         n = n/10;   
        }
        return sum;
    }
    public int countEven(int num){
        int count = 0;
        for(int i=2; i<=num; i++){
            if(Calculate(i)%2 == 0){
                count++;
            }
        }
        return count;
    }
}