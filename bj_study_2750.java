package baekjoon_java;

import java.io.*;
import java.util.*;

public class bj_study_2750 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;


    int N =Integer.parseInt(br.readLine());

    int arr[] = new int [N];

    for(int i =0; i<N; i++) {
        st = new StringTokenizer(br.readLine());

        arr[i]=Integer.parseInt(st.nextToken());

    }
    Arrays.sort(arr);

        for(int i = 0; i<N; i++) {
            System.out.println(arr[i]);
        }

    }
}
