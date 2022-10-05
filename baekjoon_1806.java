package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_1806 {
    static BufferedReader br;
    static StringTokenizer st;
    static int N, S;
    static int arr[];

    public static void main(String[] args) throws IOException {

        Input();

    }

    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }
        int first = 0;
        int second = 0;
        int sum = 0;
        int min = 100001;

        while (true) {
            if (sum >= S) {
                sum-=arr[first++];

                min = Math.min(min, ((second - first) + 1));

            } else if (N == second) {
                break;

            } else {
                sum+= arr[second++];

            }

        }
        if(min==100001) {
            System.out.println(0);

        }else{
            System.out.println(min);


            }
        }
    }
