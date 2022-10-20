package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_10797 {
    static BufferedReader br;
    static StringTokenizer st;

    static int N ;
    static int arr[] ;

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int [5];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < arr.length; i++) {

            arr[i] =Integer.parseInt(st.nextToken());

        }
        int count = 0 ;

        for(int j = 0 ; j < arr.length; j ++) {

            if(arr[j]==N) {
                count++;
            }
        }

        System.out.println(count);


    }
}
