package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_15649 {
    static int N,M;
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb =new StringBuilder();

    static int arr[];
    static boolean visit[];

    public static void main(String[] args) throws IOException {
        Input();
        Output();

    }
    static void Input()throws IOException {
        br= new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());

        arr = new int [M];
        visit = new boolean[N];


    }
    static void Output()throws IOException {

            Func(0);
        System.out.println(sb);
    }
        static void Func(int depth) {

            if(depth == M) {
                for(int val: arr) {
                    sb.append(val).append(' ');
                }
                sb.append('\n');
                return;
            }

            for(int i = 0 ; i<N; i++) {
                if(!visit[i]) {
                    visit[i]=true;
                    arr[depth]=i+1;
                    Func(depth+1);
                    visit[i]=false;

                }
            }
        }
    }


