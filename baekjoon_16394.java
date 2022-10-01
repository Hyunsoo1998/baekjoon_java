package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_16394 {
    static BufferedReader br;
    static int N ;


    public static void main(String[] args) throws IOException{
        br= new BufferedReader(new InputStreamReader(System.in));

        int years=1946;
        N=Integer.parseInt(br.readLine());
        System.out.println(N-years);

    }
}
