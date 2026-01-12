import java.util.Arrays;

class Solution {
    public int[] maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        int start = 0;        // temp start
        int end = 0;          // final end
        int tempStart = 0;    // temp start index

        for (int i = 1; i < nums.length; i++) {

            // Decide whether to extend or start new subarray
            if (nums[i] > currSum + nums[i]) {
                currSum = nums[i];
                tempStart = i;
            } else {
                currSum += nums[i];
            }

            // Update max sum and indices
            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }

        // Return the subarray
        return Arrays.copyOfRange(nums, start, end + 1);
    }
}
