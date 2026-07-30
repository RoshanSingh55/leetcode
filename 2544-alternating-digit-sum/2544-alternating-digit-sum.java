class Solution {
    public int alternateDigitSum(int n) {
        int even = 0;
        int odd = 0;
        int count = 0;
        while(n!=0){
            if(count%2 == 0){
                even += n%10;
            }
            else{
                odd += n%10;
            }
            n/=10;
            count++;

        }
        if(count%2==0){
            return odd-even;
        }
        return even - odd;
    }
}