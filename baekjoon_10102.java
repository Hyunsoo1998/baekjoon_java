package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_10102 {

    static BufferedReader br;
    static int Person ;
    static ArrayList<Integer>A = new ArrayList<>();
    static ArrayList<Integer>B = new ArrayList<>();


    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        Person = Integer.parseInt(br.readLine());

        String alpha = br.readLine();

        for(int i = 0 ; i < alpha.length(); i ++) {

            if(alpha.charAt(i)=='A') {
                A.add(i);
            }
            if(alpha.charAt(i)=='B') {
                B.add(i);
            }
        }

        if(A.size()>B.size()) {
            System.out.println("A");
        }
        if(A.size()<B.size()) {
            System.out.println("B");
        }

        if(A.size() == B.size()) {
            System.out.println("Tie");
        }



    }
}
