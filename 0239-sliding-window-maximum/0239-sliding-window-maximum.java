class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      Deque<Integer> deque = new ArrayDeque<>();
      int[] ans= new int [nums.length-k+1];
      int j=0;
      for(int i=0; i<nums.length; i++){
        int curr = nums[i];
        if(!deque.isEmpty() && deque.peekFirst()<=i-k){
            deque.removeFirst();

        }
        while(!deque.isEmpty() && nums[deque.peekLast()]<curr){
            deque.removeLast();

        }
        deque.add(i);
        if(i>=k-1){
            ans[j]=nums[deque.peekFirst()];
            j+=1;

        }


      }  
      return ans;
    }
}