package org.scaler.dsa_problems_java.gfg.GFG_Reverse_a_linked_list;

// function Template for Java
/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}
*/

public class Solution {
    Node reverseList(Node head) {
        // code here
        Node reversed_head = null;
        Node temp;
        while(head != null){
            temp = head;
            head = head.next;
            temp.next = reversed_head;
            reversed_head = temp;
        }
        return reversed_head;
    }
}
