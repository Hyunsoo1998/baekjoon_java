package baekjoon_java;

import java.io.*;
import java.util.*;


public class baekjoon_15651 {
    static BufferedReader br;
    static StringTokenizer st ;
    static StringBuilder sb;
    static int N , M,  arr[];



    public static void main(String[] args) throws IOException {

        Input();


    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int [M];
        Func(0);
        System.out.println(sb);
    }
    static void Func(int depth) {

        if(depth ==M ) {
            for(int i = 0 ; i <M; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

            for(int i = 1; i <=N; i++) {
                arr[depth]=i;

                Func(depth+1);

        }
        }
   }

