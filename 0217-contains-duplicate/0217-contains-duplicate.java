class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> hs = new HashSet<>();
      for(int i=0; i<nums.length; i++){
        if(!hs.contains (nums[i])){
            hs.add(nums[i]);
     
        }
        else{
        return true;
        }
      }
             
        return false;
    }
}