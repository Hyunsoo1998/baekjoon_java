package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_9086 {
    static BufferedReader br;
    static int Test_case;
    static StringBuilder sb;


    public static void main(String[] args) throws IOException {
        Input();
        logic();
    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        Test_case =Integer.parseInt(br.readLine());


    }
    static void logic() throws IOException {
        sb = new StringBuilder();

        while(Test_case --> 0 ) {
            String alpha = br.readLine();

            if(alpha.length() <2) {
                sb.append(alpha.charAt(0)).append(alpha.charAt(0));

            }else {
                sb.append(alpha.charAt(0)).append(alpha.charAt(alpha.length()-1));
            }
            sb.append('\n');

        }
        System.out.println(sb);


    }
}
