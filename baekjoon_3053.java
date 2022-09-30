package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_3053 {
    static double N ;

    static BufferedReader br ;

    public static void main(String[] args) throws IOException{
        Input();
        Output();

    }
    static void Input()throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        N=Double.parseDouble(br.readLine());


    }
    static void Output()throws IOException {
        System.out.println(String.format("%.6f",Math.PI*N*N)); // 유클리드 기하학.
        System.out.println(String.format("%.6f",N*(N*2))); //택시기하학
    }


}
