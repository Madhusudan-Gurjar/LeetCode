class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int arr[]=new int[2];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    // return new int[]{i, j};
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        System.out.print(arr[0]+" "+arr[1]);
        // return new int[]{}; 
        return arr;
    }
}