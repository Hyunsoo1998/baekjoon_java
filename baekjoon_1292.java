package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_1292 {
    static BufferedReader br;
    static StringTokenizer st;

    static int N , M ;
    static int arr[] = new int[1002];

    public static void main(String[] args) throws IOException{

        Input();
        logic();
    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());



    }
    static void logic() throws IOException {

        int count = 1 , sum = 0;


        for(int i = 1; i<= 1000; i ++ ) {

            for(int j = 0 ; j < i ; j++) {
                if(count == 1001) {
                    break;
                }
                arr[count] = i;
                count++;
            }

        }

        for(int i = N ; i<=M ; i++) {
            sum += arr[i];

        }
        System.out.println(sum);




    }
}
