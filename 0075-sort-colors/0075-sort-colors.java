class Solution {
    public void sortColors(int[] nums) {
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        int r = nums.length-1;
        for(int k=nums.length-1; k>=j; k--){
            if(nums[k] == 2){
                int temp = nums[k];
                nums[k] = nums[r];
                nums[r] = temp;
                r--;
            
            }
    }
}
}