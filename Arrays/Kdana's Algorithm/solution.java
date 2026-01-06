class Solution {
    public int maxSubArray(int[] nums) {
        // int sum=0; 
        // int maxSum=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        //     if(maxSum<sum){
        //         maxSum=sum;
        //     }
        //     if(sum<0){
        //         sum=0;
        //     }
        // }
        // return maxSum;
        int csum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            csum=Math.max(nums[i],csum+nums[i]);
            maxSum=Math.max(csum,maxSum);
        }
        return maxSum;
    }
}