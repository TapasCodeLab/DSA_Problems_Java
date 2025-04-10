package org.scaler.dsa_problems_java.gfg.GFG_Mirror_Tree;

import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static String levelOrder(Node root) {
        if (root == null) return "N\n";

        StringBuilder str = new StringBuilder();
        Queue<Node> qq = new LinkedList<>();
        qq.add(root);

        while (!qq.isEmpty()) {
            Node curr = qq.poll();

            if (curr == null) {
                str.append("N ");
                continue;
            }
            str.append(curr.data).append(" ");
            qq.add(curr.left);
            qq.add(curr.right);
        }

        // Trim trailing non-digit characters
        while (str.length() > 0 && !Character.isDigit(str.charAt(str.length() - 1))) {
            str.deleteCharAt(str.length() - 1);
        }

        return str.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases: ");
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            System.out.println("Enter tree elements (N for null): ");
            String s = br.readLine();
            Node root = buildTree(s);

            Solution g = new Solution();
            g.mirror(root);
            System.out.println(levelOrder(root));
            System.out.println("~");
        }
    }
}
