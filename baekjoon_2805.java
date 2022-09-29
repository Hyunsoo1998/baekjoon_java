package baekjoon_java;

import java.io.*;
import java.util.*;

public class baekjoon_2805 {
    static int N ;
    static int M ;
    static int Input_arr[];
    static BufferedReader br;
    static StringTokenizer st ;
    static StringBuilder sb;


    public static void main(String[] args) throws IOException  {

        Input();
        Output();
    }
    static void Input()throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        Input_arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<Input_arr.length; i++) {
            Input_arr[i]=Integer.parseInt(st.nextToken());

        }
    }
    static void Output()throws IOException {
        sb = new StringBuilder();
        long  L = 0;
        long  R= 2000000000;
        long ans = 0;
        while(L<=R) {
            long mid = (L+R)/2;
            //20 15 10 17
            if(determination(mid)) {
                ans = mid;
                L=mid+1;
            }else {
                R=mid-1;
            }
        }
        sb.append(ans);
        System.out.println(sb);

    }
    //20 15 10 17

    static boolean determination(long a) {
        long ans = 0 ;
        for(int i =0; i<N; i++) {
            int tree = Input_arr[i];

            if(tree> a) {
                ans+=tree-a;
            }
        }
        //아래의 표현과 같이 ans>=M 으로 선언하면 알아서 true false 가 출력됨.
        return ans >=M;


    }
}
