package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_2075 {
    static BufferedReader br;
    static StringTokenizer st;
    static int N;
    static int arr[];

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());


        arr = new int [N*N];


        int number = 0 ;
        for(int i = 0 ; i < N; i ++) {

            st = new StringTokenizer(br.readLine());

            for(int j = 0; j <N ; j++) {
                arr[number++] = Integer.parseInt(st.nextToken());
            }

        }
        Arrays.sort(arr);

        System.out.println(arr[N*N - N]);


    }
}
