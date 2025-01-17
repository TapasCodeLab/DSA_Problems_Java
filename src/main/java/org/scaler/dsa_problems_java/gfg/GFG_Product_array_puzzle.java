package org.scaler.dsa_problems_java.gfg;

public class GFG_Product_array_puzzle {

    public static int[] productExceptSelf(int arr[]) {
        // code here
        int[] res = new int[arr.length];
        int total = 1;
        for(int i=0;i<arr.length;i++){
            res[i] = total;
            total = total *arr[i];
        }
        total = 1;
        for(int i=arr.length-1;i>-1;i--){
            res[i] = res[i]*total;
            total = total *arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        System.out.println(productExceptSelf(arr));
        int[] arr1 = {12, 0};
        System.out.println(productExceptSelf(arr1));
    }
}
