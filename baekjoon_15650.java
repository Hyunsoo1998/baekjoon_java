package baekjoon_java;

import java.util.*;
import java.io.*;


/*1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
고른 수열은 오름차순이어야 한다.
* */


public class baekjoon_15650 {

    static BufferedReader br;


    static StringTokenizer st;

    static int N , M;
    static int arr[];
    public static void main(String[] args) throws IOException{

        Input();


    }
    static void Input()throws IOException {


        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        arr = new int [M];


        Func(1,0);

    }
    static void Func(int start, int depth) {

        if(depth == M) {
            for(int val : arr) {
                System.out.print(val+ " ");
            }
            System.out.println();
            return;

        }
            for (int i = start; i <= N; i++) {

                    arr[depth]=i;
                    Func(i+1,depth+1);


            }
        }

    }

