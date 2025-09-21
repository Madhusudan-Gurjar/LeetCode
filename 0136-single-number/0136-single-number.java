class Solution {
    public int singleNumber(int[] nums) {
       Arrays.sort(nums);
       for(int j=0;j<nums.length;j++){
               System.out.print(nums[j]+" ");

       }
           int res=0;
       if(nums.length==1){
        res=nums[0];
       }
       if(nums.length==3){
            if(nums[0]==nums[1]){
                res=nums[2];
            }
            else{
                res=nums[0];
            }
       }
   if(nums.length>=4){
        for(int i=0;i<nums.length-2;i+=2){
           if(nums[0]!=nums[1]){
            res=nums[0];
            break;
           }
            else if(nums[i]!=nums[i+1]){
                res= nums[i];
                break;
            }else if(nums[nums.length-1]!=nums[nums.length-2]){
                res=nums[nums.length-1];
            }
        }
   }
       
return res;
    }
}