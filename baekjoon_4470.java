package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_4470 {

    static BufferedReader br;
    static int Test_case;
    static String arr[];

    public static void main(String[] args) throws IOException{

        Input();
        logic();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        Test_case = Integer.parseInt(br.readLine());
        arr = new String[Test_case+1];

        for(int i = 1 ; i <= Test_case; i++) {
            arr[i] = br.readLine();
        }
    }
    static void logic()  {

        for(int i =1 ; i< arr.length; i ++) {
            System.out.println(i+"."+" "+arr[i]);
        }
    }
}
