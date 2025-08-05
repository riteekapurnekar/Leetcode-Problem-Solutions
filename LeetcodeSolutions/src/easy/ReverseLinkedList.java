// 206. Reverse Linked List
// https://leetcode.com/problems/reverse-linked-list/description/
// Given the head of a singly linked list, reverse the list, and return the reversed list.

// this is iterative version of solution
package easy;

public class ReverseLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode next = null;
        ListNode current = head;

        while (current != null) {   // end of list reached
            next = current.next;    // storing next node as next node's ptr will b changed
            current.next = previous;    // reversing the ptr to prev node instead of next node

            previous = current; // moving ptr ahead as current node is stored
            current = next; // moving to next node to reverse the whole list
        }
        return previous; // prev is ny head as the list is over
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        ListNode reversed = reverseList(head);

        System.out.print("Reversed List: ");
        printList(reversed);
    }

}

// Time Complexity: O(n)
// n = number of nodes in linked list

// Space Complexity: O(1)
// since we are reversing the list in place
