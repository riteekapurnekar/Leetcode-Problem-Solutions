// 1295. Find Numbers with even number of digits
// Given an array nums of integers, return how many of them contain an even number of digits.

//Example 1:
//Input: nums = [555,901,482,1771]
//Output: 1
//Explanation:
//Only 1771 contains an even number of digits.


package easy.searching;

public class NoEvenDigits {

    public static void main(String args[]) {
        int[] nums1 = {12,345,2,6,7896};
        System.out.println(" " + findNumbers(nums1));

        int[] nums2 = {555,901,482,1771};
        System.out.println(" " + findNumbers(nums2));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (evenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean evenDigits(int num) {
        int noOfDigits = digitsInNum(num);
        if (noOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int digitsInNum(int num) {
        int count = 0;
        if (num < 0) {
            return 0;
        }
        if (num == 0) {
            return 1;
        }
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}

// Time Complexity: O(n)
// n = length of array

// Space Complexity: O(1)
