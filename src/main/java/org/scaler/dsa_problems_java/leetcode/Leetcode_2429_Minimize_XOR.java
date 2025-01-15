package org.scaler.dsa_problems_java.leetcode;

public class Leetcode_2429_Minimize_XOR {
    public int minimizeXor(int num1, int num2) {
        int n2 = 0;
        while(num2>0){
            if((num2&1)==1){
                n2++;
            }
            num2 = num2>>1;
        }
        int[] res_bin = new int[32];
        for(int i=31;i>-1;i--){
            if(n2==0){break;}
            if (((num1>>i)&1)==1){
                res_bin[31-i]=1;
                n2 -=1;
            }
        }

        for(int i=31;i>-1;i--){
            if(n2==0){break;}
            if (res_bin[i]==0){
                res_bin[i] = 1;
                n2 -= 1;
            }
        }
        int res = 0;
        for(int i=0;i<32;i++){
            res = res*2;
            res = res + res_bin[i];
        }
        return res;
    }
}
