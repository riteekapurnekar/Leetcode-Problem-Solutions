// 26. Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//Given an integer array nums sorted in non-decreasing order,
// remove the duplicates in-place such that each unique element appears only once.
//The relative order of the elements should be kept the same. Then return the number of unique elements in nums.


package easy;

public class DuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int k = 1;  // initializing a pointer as 1

        if (nums.length < 1) {
            return 0;
        }   

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {   //  checking for unique values
                nums[k] = nums[i];  // moving unique element at front or before duplicates
                k++;    // incrementing count of unique elements
            }
        }
        return k;   // returning count of unique elements
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};

        int k1 = removeDuplicates(nums1);
        System.out.print("nums1: ");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        System.out.println("k: " + k1);
        System.out.print("new nums1: ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        System.out.println();

        int k2 = removeDuplicates(nums2);
        System.out.print("nums2: ");
        for (int j : nums2) {
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.println("k: " + k2);
        System.out.print("new nums2: ");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}


// Time Complexity: O(n)
// n = length/size of array (nums)

// Space Complexity: O(1)
// since we are operating in-place