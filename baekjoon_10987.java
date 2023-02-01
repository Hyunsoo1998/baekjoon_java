package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_10987 {

    static BufferedReader br;

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        String alpha = br.readLine();
        char arr []  = new char[alpha.length()];

        int count = 0 ;
        for(int i = 0 ; i < arr.length; i ++) {
            arr[i] = alpha.charAt(i);

        }

        for(int i = 0 ; i< arr.length; i ++) {
            //a, e, i, o, u
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                count++;
            }
        }
        System.out.println(count);

    }
}
