class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0; i<sentences.length; i++){
            int c = sentences[i].split(" ").length;

            if (c>max){
                max = c;
            }
        }
        return max;
    }
}