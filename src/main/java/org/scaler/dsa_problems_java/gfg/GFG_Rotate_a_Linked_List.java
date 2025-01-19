package org.scaler.dsa_problems_java.gfg;

import java.io.*;
import java.util.*;

public class GFG_Rotate_a_Linked_List {
        // Function to rotate a linked list.
        public Node rotate(Node head, int k) {
            // add code here
            Node temp = head;
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

/*
//{ Driver Code Starts
// Initial Template for Java



class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends
/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}



class Solution {
    public Node rotate(Node head, int k) {
        // add code here

    }
}


//{ Driver Code Starts.

public class GFG {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            if (!input.isEmpty()) {
                String[] numbers = input.split("\\s+");
                for (String num : numbers) {
                    if (!num.isEmpty()) {
                        arr.add(Integer.parseInt(num));
                    }
                }
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); ++i) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            head = ob.rotate(head, k);
            printList(head);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends

*/