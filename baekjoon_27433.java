package baekjoon_java;


import java.util.*;
import java.io.*;


public class baekjoon_27433 {

    static long N ;
    static BufferedReader br;


    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        Input();

    }
    static void Input() throws IOException {
        N = Long.parseLong(br.readLine());


        long sum = 0 ;

        sum += logic(N);

        System.out.println(sum);


    }
    static long logic(Long N) throws IOException {

        if(N ==1 || N == 0 ) {

            return 1;
        }

        return N*logic(N-1);



    }


}
