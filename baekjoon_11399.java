package baekjoon_java;

import java.io.*;
import java.util.*;


public class baekjoon_11399 {
    static BufferedReader br;
    static StringTokenizer st ;
    static int N  , sum;
    static PriorityQueue<Integer>pq ;
    static int arr[];


    public static void main(String[] args) throws IOException {

        Input() ;

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());


        pq = new PriorityQueue<>();
        arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(st.nextToken()));
        }


        sum = 0 ;

        int result = 0;

        for(int i = 0 ; i < arr.length; i ++) {
            sum= sum+pq.poll();

            arr[i]=sum;

            result += arr[i];
        }

        System.out.println(result);





    }
}
