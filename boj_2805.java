package baekjoon_java;

import java.util.*;
import java.io.*;

public class boj_2805 {
    static BufferedReader br;
    static StringTokenizer st;
    static int arr[];
    static int N, M;
    static long sum, MIN , MAX;


    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input()throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N= Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        arr = new int[N];

        MIN =0;
        MAX = -1;
        for(int i = 0 ; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if(MAX<arr[i]) {
                MAX= arr[i];
            }
        }
        //이분탐색 Upperbound

        while(MIN < MAX) {
            long mid = (MIN + MAX) / 2;
            sum =0;

            for(int tree_height : arr) {

                if(tree_height - mid >0) {
                    sum+=tree_height-mid;
                }
            }

            if(sum<M) {
                MAX=mid;

            }else {
                MIN=mid+1;
            }
        }
        System.out.println(MIN-1);


    }
}
