// 1672. Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/description/
// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

//Example 1:
//Input: accounts = [[1,5],[7,3],[3,5]]
//Output: 10
//Explanation:
//        1st customer has wealth = 6
//2nd customer has wealth = 10
//3rd customer has wealth = 8
//The 2nd customer is the richest with a wealth of 10.

package easy.searching;

public class MaxWealthOfCustomer {
    public static void main(String[] args) {
        int[][] accounts2 = {{1,5}, {7,3},{3,5}};
        System.out.println(" " + maximumWealth(accounts2));
    }

    public static int maximumWealth(int[][] accounts) {

        // defining maximum wealth value
        int maxWealth = Integer.MIN_VALUE;

        // every row represents customer
        for (int customer = 0; customer < accounts.length; customer++) {
            // to store total sum of the wealth for each customer
            int sumOfWealth = 0;

            // every column represents account for that customer
            for (int account = 0; account < accounts[customer].length; account++) {
                // storing total sum of the wealth for each customer by adding all accounts for that customer
                sumOfWealth += accounts[customer][account];
            }

            // comparing with maxWealth
            if (sumOfWealth > maxWealth) {
                maxWealth = sumOfWealth;
            }
        }
        return maxWealth;
    }
}

// Time Complexity: O(n^2)

// Space Complexity: O(n^2)