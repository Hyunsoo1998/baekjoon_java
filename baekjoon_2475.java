package baekjoon_java;

import java.io.*;
import java.util.*;

public class baekjoon_2475 {
    static BufferedReader br;
    static StringTokenizer st;
    static int N=5 ;
    static int arr1[],arr2[];

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));


        int sum = 0 ;

        arr1 = new int [N];
        arr2 = new int [N]; // 제곱수를 저장할 배열.

        st = new StringTokenizer(br.readLine()," ");

        for(int i = 0 ; i < arr1.length; i++) {
            arr1[i]=Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i < arr2.length; i++) {

            arr2[i]= (arr1[i]*arr1[i]);
            sum += arr2[i];
        }
        System.out.println((sum%10));



    }
}
