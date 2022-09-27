package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_2775 {
    static int T ,k , n,arr[][];
    static StringBuilder sb;
    static BufferedReader br ;
    public static void main(String[] args) throws IOException{
        Input();

    }
    static void Input()throws IOException {
        br = new BufferedReader (new InputStreamReader(System.in));
        T= Integer.parseInt(br.readLine());

        sb= new StringBuilder();

        Find();
        for(int i = 0 ; i< T; i++) {

            k=Integer.parseInt(br.readLine());
            n= Integer.parseInt(br.readLine());

            sb.append(arr[k][n]).append('\n');

        }
        System.out.println(sb);
    }

    static void Find() {
        arr= new int [15][15];

        for(int i = 0 ; i < 15; i ++) {
            arr[i][1]=1;
            arr[0][i]=i;

        }
        for(int i = 1; i < 15; i ++) {
            for(int j = 2 ; j < 15; j ++) {

                arr[i][j]= arr[i-1][j]+arr[i][j-1];

            }
        }




    }

    }

