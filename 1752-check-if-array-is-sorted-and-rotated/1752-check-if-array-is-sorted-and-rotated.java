class Solution {
    public boolean check(int[] nums) {
        int i=0;
        int index=0;
        if(nums.length==1){
            return true;
        }else if(nums.length==2){
            if(nums[0]<nums[1] || nums[0]==nums[1]){
                return true;
            }else{
                int temp=nums[0];
                nums[0]=nums[1];
                nums[1]=temp;
                if(nums[0]<nums[1]){
                return true;
                }
                return false;

            }
        }
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]>nums[j+1]){
                index=j+1;
                rev(nums,0,nums.length-1);
                rev(nums,0,nums.length-index-1);
                rev(nums,nums.length-index,nums.length-1);
                
                break;
            }
            
                // return true;
            
        }
        // while(i<nums.length){
        //     if(nums[idx]>nums[idx=+1]){
        //         index=i;
        //         break;
        //     }
        //     i++;
        // }
        // rev(nums,0,nums.length);
        // rev(nums,0,index);
        // rev(nums,index+1,nums.length);

        for(int j=0;j<nums.length-1;j++){
            if(nums[j]>nums[j+1]){
                return false;
            }
     
        }
        return true;
    }
    public static int[] rev(int nums[],int sidx,int eidx){
       if(sidx==eidx){
        return nums;
       }
        while(sidx<eidx){
            int temp=nums[sidx];
            nums[sidx]=nums[eidx];
            nums[eidx]=temp;

            sidx++;
            eidx--;
        }
        for (int j=0;j<nums.length;j++){
        System.out.print(nums[j]);
        }
        System.out.println("");
        return nums;
    }
}