// 876. Middle of Linked List
// https://leetcode.com/problems/middle-of-the-linked-list/description/
// Given the head of a singly linked list, return the middle node of the linked list.
//If there are two middle nodes, return the second middle node.

//Input: head = [1,2,3,4,5,6]
//Output: [4,5,6]
//Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

// calculating length and finding middle element

package easy;

public class MiddleOfLinkedList {
    static class ListNode {
        int val;
        MiddleOfLinkedList.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, MiddleOfLinkedList.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode current = head;

        // finding length of list
        while (current != null) {
            current = current.next;
            length++;
        }

        // finding the middle node
        int mid = length/2;
        current = head;

        for (int i = 0; i < mid; i++) {
            current = current.next;     // setting current to middle node
        }

        return current; // returning middle node
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // list: 1 → 2 → 3 → 4 → 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.print("Original List: ");
        printList(head);

        ListNode middle = middleNode(head);

        System.out.print("Middle Node: ");
        printList(middle); // printing from middle to end
    }

}

// Time Complexity: O(n)
// n = length of linked list

// Space Complexity: O(1)

