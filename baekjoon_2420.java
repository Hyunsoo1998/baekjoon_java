package baekjoon_java;

import java.util.*;
import java.io.*;



public class baekjoon_2420 {

    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        System.out.println(Math.abs(N-M));


    }
}
