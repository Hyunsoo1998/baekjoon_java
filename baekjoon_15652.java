package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_15652 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N , M ;

    static int arr[];

    public static void main(String[] args) throws IOException{

        Input();
        System.out.println(sb);

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        arr = new int[M];

        Func(1,0);
    }
    static void Func(int start ,int depth) {

        if(depth == M) {
            for(int i = 0; i <M; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;

        }
            for(int i = start ; i <=N; i ++) {

                arr[depth]=i;

                Func(i,depth+1);

        }

    }
}
