class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^A-Za-z0-9]","");
        
        // s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

// class Solution {
//     public boolean isPalindrome(String s) {
//         s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
//         int left = 0;
//         int right = s.length() - 1;

//         while (left < right) {
//             if (s.charAt(left) != s.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;        
//     }
// }