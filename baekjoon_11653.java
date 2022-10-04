package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_11653 {
    static int N ;
    static BufferedReader br;
    static StringBuilder sb ;
    static ArrayList<Integer>list;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input()throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for(int i =2 ; i <= Math.sqrt(N); i++) {

            while(N%i==0) {
                System.out.println(i);
                N/=i;
            }
        }
        if(N!=1) {
            System.out.println(N);
        }


    }
}
