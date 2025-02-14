package org.scaler.dsa_problems_java.gfg.GFG_Fixing_Two_nodes_of_a_BST;

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
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();

            String currVal = ip[i];

            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }

            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static boolean isBST(Node n, int lower, int upper) {
        if (n == null) return true;
        if (n.data <= lower || n.data >= upper) return false;
        return isBST(n.left, lower, n.data) && isBST(n.right, n.data, upper);
    }

    static boolean compare(Node a, Node b, ArrayList<pair> mismatch) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;

        if (a.data != b.data) {
            mismatch.add(new pair(a.data, b.data));
        }

        return compare(a.left, b.left, mismatch) && compare(a.right, b.right, mismatch);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //int t = Integer.parseInt(br.readLine());
        int t = 1;

        while (t-- > 0) {
            System.out.println("Enter the tree values:");
            String s = br.readLine();
            Node root = buildTree(s);
            Node duplicate = buildTree(s);

            Solution ob = new Solution();
            ob.correctBST(root);

            if (!isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
                System.out.println(0);
                continue;
            }

            ArrayList<pair> mismatch = new ArrayList<>();
            if (!compare(root, duplicate, mismatch)) {
                System.out.println(0);
                continue;
            }

            if (mismatch.size() != 2 ||
                    mismatch.get(0).first != mismatch.get(1).second ||
                    mismatch.get(0).second != mismatch.get(1).first) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }

            System.out.println("~");
        }
    }
}
