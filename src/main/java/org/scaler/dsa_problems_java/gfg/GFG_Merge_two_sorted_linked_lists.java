//https://www.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
package org.scaler.dsa_problems_java.gfg;

//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("~");
    }

    // Insert node into the list in a sorted manner
    public static Node insertSorted(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= data) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        while (T-- > 0) {
            Node head1 = null;
            Node head2 = null;

            // Reading first linked list input
            String input1 = sc.nextLine();
            String[] elems1 = input1.split(" ");
            for (String elem : elems1) {
                head1 = insertSorted(head1, Integer.parseInt(elem));
            }

            // Reading second linked list input
            String input2 = sc.nextLine();
            String[] elems2 = input2.split(" ");
            for (String elem : elems2) {
                head2 = insertSorted(head2, Integer.parseInt(elem));
            }

            // Merging sorted linked lists
            GFG_Merge_two_sorted_linked_lists obj = new GFG_Merge_two_sorted_linked_lists();
            Node mergedHead = obj.sortedMerge(head1, head2);
            printList(mergedHead); // Print the merged sorted list
        }
        sc.close();
    }
}

// } Driver Code Ends


/*
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

public class GFG_Merge_two_sorted_linked_lists {
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
