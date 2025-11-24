class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int i,res=0;
        if(n==3 && arr[1]>arr[0] && arr[2]< arr[1]){
            return 1;
        }else if(n==2 && arr[1]>arr[0]){
            return 1;
        }else if(n==2 && arr[1]<arr[0]){
            return 0;
        }else{
            for(i=0;i<n-1;i++){
                if(arr[i+1]<arr[i]){
                 return i;
                }
            }
        }
        // for(i=0;i<n-1;i++){
        //     if(arr[i+1]<arr[i]){
        //          res = i-1;
        //     }
        // }
        
    return res;
    }
}