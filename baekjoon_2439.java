package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_2439 {
    static int N ;
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException{

        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());


        for(int i = 1 ; i <= N; i ++) {
            for(int j = 1; j <=N-i; j++) {
                sb.append(' ');
            }
            for(int k = 1; k<= i; k++) {
                sb.append('*');
            }
            sb.append('\n');

        }
        System.out.println(sb);
    }

}
