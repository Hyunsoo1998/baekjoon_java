package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_11659 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    static int N , M ,arr[];

    public static void main(String[] args) throws  IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+1];


        st = new StringTokenizer(br.readLine());

        for(int i = 1;  i <= N; i++) {
            arr[0]=0;

            arr[i]=arr[i-1]+Integer.parseInt(st.nextToken());
       }

        for(int i =0 ; i < M; i ++) {
            st = new StringTokenizer(br.readLine());

            int Left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            sb.append(arr[right]-arr[Left-1]).append('\n');
        }

        System.out.println(sb);



    }
}
