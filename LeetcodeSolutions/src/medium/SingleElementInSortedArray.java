//540. Single Element in a sorted array
// https://leetcode.com/problems/single-element-in-a-sorted-array/description/
// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
//Return the single element that appears only once.
//Your solution must run in O(log n) time and O(1) space.


package medium;

public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mid % 2 == 1) {
                mid--;  // making sure mid is even
            }

            // each pair in array starts at even index
            // if current mid and next element are equal, means the non-duplicate element is in right side
            // if not equal, then non-duplicate is either at mid or to the left

            if (nums[mid] == nums[mid + 1]) {   // element is in next half
                low = mid + 2;  // updating low
            } else {    // element is in first half
                high = mid;     // updating high
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,2,3,3,4,4,8,8};

        int[] nums2 = {3,3,7,7,10,11,11};

        SingleElementInSortedArray solution = new SingleElementInSortedArray();

        int result1 = solution.singleNonDuplicate(nums1);
        System.out.println(result1);

        int result2 = solution.singleNonDuplicate(nums2);
        System.out.println(result2);
    }
}

// Time Complexity: O(log n)
// Space Complexity: O(1)




// Alternate solution in O(n)

// int n = nums.length;
// if (n == 1) {
//     return nums[0];
// }
// for (int i = 0; i < n - 1; i += 2) {
//     if (nums[i] != nums[i+1]) {
//         return nums[i];
//     }
// }
// return nums[n - 1];
