package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_2693 {
    static BufferedReader br;
    static StringTokenizer st;
    static int Test_case ;

    public static void main(String[] args) throws IOException{

        Input();
    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        Test_case = Integer.parseInt(br.readLine());

        while(Test_case -->0) {

            int arr [] = new int[10];

            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < arr.length; i ++) {
                arr[i] = Integer.parseInt(st.nextToken());

            }
            logic(arr);

        }


    }
    static void logic(int arr[]) throws IOException {
        Arrays.sort(arr);

        System.out.println(arr[arr.length-3]);


    }
}
