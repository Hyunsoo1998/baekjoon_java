package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_5597 {
    static BufferedReader br;

    static StringBuilder sb;
    static boolean arr[];

    public static void main(String[] args) throws IOException {

        Input();

    }

    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb  = new StringBuilder();

        arr = new boolean[31];

        for(int i = 0; i<28 ; i++) {
            int number =Integer.parseInt(br.readLine());

            arr[number]=true;

        }
        for (int i = 1 ; i <= 30 ; i ++) {
            if(arr[i]==false) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
