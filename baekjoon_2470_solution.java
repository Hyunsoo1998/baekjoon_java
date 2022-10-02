package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_2470_solution {

    static int N;
    static BufferedReader br;
    static StringTokenizer st;

    static int arr[];


    public static void main(String[] args) throws IOException {
        Input();

    }
    static void Input()throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N= Integer.parseInt(br.readLine());

        arr = new int [N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < arr.length; i ++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        Func(0,arr.length-1);
    }

    static void Func(int L, int R) {

        int min = Integer.MAX_VALUE;

        int solution1 = 0;
        int solution2 = 0;

        int sum ;
        int temp;

        while(L<R) {

             sum=arr[L]+arr[R];
             temp = Math.abs(sum);

            if ( min>temp) {

                min =temp;
                 solution1 = arr[L];
                 solution2 = arr[R];
            }
            if(sum > 0)
                R--;
            else
                L++;
        }
        System.out.println(solution1+" "+solution2);

    }
}
