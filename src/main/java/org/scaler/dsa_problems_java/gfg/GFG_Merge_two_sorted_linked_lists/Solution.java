package org.scaler.dsa_problems_java.gfg.GFG_Merge_two_sorted_linked_lists;

public class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node head = null, tail = null, temp = null;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp = head1;
                head1 = head1.next;
                temp.next = null;
            } else {
                temp = head2;
                head2 = head2.next;
                temp.next = null;
            }

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = tail.next;
            }
        }

        if (head1 != null) {
            tail.next = head1;
        }
        if (head2 != null) {
            tail.next = head2;
        }
        return head;
    }

}
