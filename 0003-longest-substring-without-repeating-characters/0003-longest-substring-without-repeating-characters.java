class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int len=0,maxLen=0;
        
       
        for(int i=0;i<n;i++){
            int hash[]=new int[255];
            for(int j=i;j<n;j++){
                if(hash[s.charAt(j)]==1){
                    break;
                }
                len=j-i+1;
                maxLen=Math.max(len,maxLen);
                hash[s.charAt(j)]=1;
            }
        }
        return maxLen;
    }
}