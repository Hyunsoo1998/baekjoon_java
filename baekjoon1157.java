package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon1157 {
    static String alpha;
    static BufferedReader br;
    static int arr2[] = new int[26];
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        Input();
        Output();

    }

    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        alpha = br.readLine();

       for(int i =0 ; i < alpha.length(); i++) {
           if('a'<=alpha.charAt(i) && alpha.charAt(i)<='z') {
               arr2[alpha.charAt(i)-97]++;

           }else{
                arr2[alpha.charAt(i)-65]++;
           }

       }


        //System.out.println(Arrays.toString(arr1));
    }

    static void Output() throws IOException {
        int max = 0;
        char same = '?';

        for(int i = 0 ; i <arr2.length; i ++) {
            if(arr2[i]>max) {

                max=arr2[i];
                same = (char)(i+65);

            }else if(arr2[i]==max) {
                same = '?';
            }
        }

        System.out.println(same);
    }
}

