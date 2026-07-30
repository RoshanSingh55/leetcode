class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int ch='a';ch<='z';ch++)
        {
            if(sentence.indexOf(ch)<0)
            {
                return false;
            }
        }
        return true;
        
    }
}