package org.scaler.dsa_problems_java.gfg.GFG_Rotate_a_Linked_List;

public class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node temp = head;
        int n = 0;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        k = k%n;
        temp = head;
        Node temp2 = head;
        for(int i=0;i<k-1;i++){
            head=head.next;
        }
        temp=head;
        head = head.next;
        temp.next = null;

        if(head==null){
            return temp2;
        } else {
            Node tail = head;
            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = temp2;
            return head;
        }

    }

}
