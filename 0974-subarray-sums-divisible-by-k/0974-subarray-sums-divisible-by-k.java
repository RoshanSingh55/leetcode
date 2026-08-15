class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int mod = sum % k;
            if(mod<0){
                mod += k;
            }
               if (hm.containsKey(mod)) {
                count += hm.get(mod);
                hm.put(mod, hm.get(mod) + 1);
            } else {
                hm.put(mod, 1);
            }
        }
       
        return count;
    }
}