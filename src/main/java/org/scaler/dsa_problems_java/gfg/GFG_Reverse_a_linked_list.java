package org.scaler.dsa_problems_java.gfg;

//{ Driver Code Starts
import java.io.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GFG {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;

            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }

            GFG_Reverse_a_linked_list ob = new GFG_Reverse_a_linked_list();
            head = ob.reverseList(head);
            printList(head);
            t--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


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

public class GFG_Reverse_a_linked_list {
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

