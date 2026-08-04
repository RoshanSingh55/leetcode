class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l = new ArrayList<>();
       
        Arrays.sort(nums);
        int prev = nums[0];
        for(int i=1; i<nums.length; i++){
            while(nums[i] != prev+1){
            l.add(++prev);
        }
        prev = nums[i];
        }
        return l;
    }
}