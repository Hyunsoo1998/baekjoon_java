package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_7795 {

    static BufferedReader br;
    static StringTokenizer st;

    static StringBuilder sb = new StringBuilder();

    static int Test_case ;

    public static void main(String[] args) throws IOException{

        Input();
        System.out.println(sb);

    }
    static void Input() throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        Test_case = Integer.parseInt(br.readLine());

        while(Test_case --> 0) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int A_input [] = new int[A];
            int B_input [] = new int[B];

            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < A_input.length; i ++) {
                A_input[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < B_input.length; i ++) {
                B_input[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(A_input);
            int result = 0 ;

            for(int i = 0 ; i < B_input.length; i ++) {

                result += Search(A_input, B_input[i]);

            }
            sb.append(result).append('\n');
        }

    }
    static int Search(int A_arr[] , int X) {

        int result = 0 ;

        for(int i = 0 ; i < A_arr.length; i ++) {

            if(A_arr[i]>X) {
                result += 1;
            }

        }
        return result;


    }

}
