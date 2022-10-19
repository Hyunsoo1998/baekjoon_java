package baekjoon_java;

import java.io.*;
import java.util.*;


public class baekjoon_10870 {
    static BufferedReader br;
    static StringTokenizer st ;
    static int N,  V, arr[];

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int [N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ;  i< arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        V = Integer.parseInt(br.readLine());

        System.out.println(Search(arr, V));

    }
    static int Search(int array[], int X) {

        int sum = 0 ;
        for(int i = 0 ; i < array.length; i++) {
            if(X== array[i]) {
                sum++;
            }
        }

        return sum;
    }
}
