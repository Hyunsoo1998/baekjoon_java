package baekjoon_java;

import java.util.*;
import java.io.*;
public class baekjoon_1436 {
    static int Number = 666;

    static int N ,count;

    static BufferedReader br;
    static StringTokenizer st ;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException{
        Input();
        Output();


    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());

        count =1 ;
        while(N!=count) {
            Number++;

            if(Integer.toString(Number).contains("666")) {
                count++;

            }
        }

    }
    static void Output() throws IOException {

        System.out.println(Number);
    }
}
