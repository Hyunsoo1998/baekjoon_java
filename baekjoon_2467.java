package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_2467 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int arr[];

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int number =Integer.parseInt(br.readLine());
        arr = new int[number];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i <number; i++) {

            arr[i] = Integer.parseInt(st.nextToken());

        }

        Search(0, arr.length-1);

    }
    static void Search(int L, int R ) {

        int min = Integer.MAX_VALUE;

      int solution1 = 0 , solution2 = 0  , sum = 0, temp = 0;

        while(L<R) {

            sum = arr[L] + arr[R];
            temp = Math.abs(sum);

            if(min>temp) {
                min = temp;
                solution1 = arr[L];
                solution2 = arr[R];

            }
            if(sum > 0 ) {
                R--;
            }else {
                L++;
            }


        }

        System.out.println(solution1 + " "+ solution2);



    }
}
