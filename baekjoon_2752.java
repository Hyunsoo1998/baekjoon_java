package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_2752 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        sb = new StringBuilder();


        int arr[] = new int[3];

        for(int i = 0 ;  i < arr.length; i ++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length; i ++) {
            sb.append(arr[i]).append(' ');
        }

        System.out.println(sb);

    }
}
