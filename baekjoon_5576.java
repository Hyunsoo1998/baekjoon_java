package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_5576 {
    static BufferedReader br;
    static ArrayList<Integer>W_University;
    static ArrayList<Integer>K_University;





    public static void main(String[] args) throws IOException {

        Input();
        logic();
    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        W_University = new ArrayList<>();
        K_University = new ArrayList<>();

        for(int i = 0 ; i<10; i ++) {
            W_University.add(Integer.parseInt(br.readLine()));
        }
        for(int i = 0 ; i<10 ; i++) {
            K_University.add(Integer.parseInt(br.readLine()));
        }



    }
    static void logic() throws IOException {

        Collections.sort(W_University);
        Collections.sort(K_University);

        int W_result = 0 , K_result = 0 ;

        for(int i = 1; i <4; i++) {
            W_result += W_University.get(W_University.size()-i);
            K_result += K_University.get(K_University.size()-i);
        }

        System.out.println(W_result);
        System.out.println(K_result);


    }
}
