package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_15470 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static long A , B;

    public static void main(String[] args) throws IOException{

        Input();
        Output();


    }
    static void Input()throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        A=Long.parseLong(st.nextToken());
        B=Long.parseLong(st.nextToken());


    }
    static void Output()throws IOException {
        sb= new StringBuilder();

        sb.append(A+B);
        System.out.println(sb);
    }
}
