package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_14928 {

    public static void main(String[]args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int num = 0;
        int MOD = 20000303;
        for (int i = 0; i < n.length(); i++) {
           num*=10;
            num+=n.charAt(i)-'0';
            num%=MOD;
        }
        System.out.println(num);


    }
}
