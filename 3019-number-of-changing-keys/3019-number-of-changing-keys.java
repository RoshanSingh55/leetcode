class Solution {
    public int countKeyChanges(String s) {
          int count = 0;
        String lc = s.toLowerCase();
        for(int i=0; i<lc.length()-1; i++){
            if(lc.charAt(i) != lc.charAt(i+1)){
                count++;
            }
        }
        return count;
        
    }
}