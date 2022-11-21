package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_2566 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;


   static String result_arr[] = new String[1];
   static int max_arr[]  = new int[1];
    static int arr[][] = new int[10][10];

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int max = Integer.MIN_VALUE;
        int temp = 0 ;


        for(int i = 1; i <=9; i ++) {

            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <=9; j++) {

                arr[i][j] = Integer.parseInt(st.nextToken());


                if(max<arr[i][j]) {
                    max=arr[i][j];

                    result_arr[0] = i+ " "+ j;
                    max_arr[0] = arr[i][j];


                }

            }
        }
        System.out.println(max_arr[0]);
        System.out.println(result_arr[0]);



    }
}
