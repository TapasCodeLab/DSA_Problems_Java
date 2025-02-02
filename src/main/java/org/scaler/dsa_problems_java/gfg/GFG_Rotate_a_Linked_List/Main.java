package org.scaler.dsa_problems_java.gfg.GFG_Rotate_a_Linked_List;

import java.io.*;
import java.util.*;

public class Main {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter number of test cases:");
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            //System.out.println("Enter eliments of link list:");
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
            //System.out.println("Enter value of k:");
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            head = ob.rotate(head, k);
            printList(head);

            System.out.println("~");
        }
    }
}
