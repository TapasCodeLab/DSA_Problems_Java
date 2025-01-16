package org.scaler.dsa_problems_java.gfg;


//{ Driver Code Starts
import java.io.*;
import java.util.*;
/*
public class Main {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader for efficient input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read number of test cases
        int T = Integer.parseInt(br.readLine());

        // Process each test case
        while (T-- > 0) {
            // Read the entire line containing the array elements
            String line = br.readLine();

            // Split the line into an array of strings, then parse them as integers
            String[] tokens = line.split("\\s+");
            int[] a = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                a[i] = Integer.parseInt(tokens[i]);
            }

            // Create the Solution object
            GFG_Largest_subarray_of_0s_and_1s obj = new GFG_Largest_subarray_of_0s_and_1s();

            // Call maxLen function and print the result
            System.out.println(obj.maxLen(a));
        }
    }
}
// } Driver Code Ends
*/

public class GFG_Largest_subarray_of_0s_and_1s {
    public static int maxLen(int[] arr) {
        // Your code here
        int res = 0;
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("0_0",-1);
        Integer zero=0, one = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                if(one>0){
                    one--;
                } else {
                    zero++;
                }
            } else{
                if(zero>0){
                    zero--;
                } else{
                    one++;
                }
            }
            if(hashMap.containsKey(zero+"_"+one)){
                res = Math.max(res, i-hashMap.get(zero+"_"+one));
            } else {
                hashMap.put(zero+"_"+one,i);
            }
        }


        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1};
        System.out.println(maxLen(arr));
    }

}


