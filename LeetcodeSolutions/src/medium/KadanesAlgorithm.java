//53. Maximum Subarray (Kadane's Algorithm)
//https://leetcode.com/problems/maximum-subarray/description/
// Given an integer array nums, find the subarray with the largest sum, and return its sum.


package medium;

public class KadanesAlgorithm {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;

        for (int i = 0; i < nums.length; i++) {
            current_sum += nums[i];

            if (current_sum > max_sum) {
                max_sum = current_sum;
            }

            if (current_sum < 0) {
                current_sum = 0;
            }
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {1};
        int[] nums3 = {5,4,-1,7,8};

        KadanesAlgorithm ka = new KadanesAlgorithm();

        int result1 = ka.maxSubArray(nums1);
        int result2 = ka.maxSubArray(nums2);
        int result3 = ka.maxSubArray(nums3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}


// Time Complexity: O(n)

// Space Complexity: O(1)