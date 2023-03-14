package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_11931 {

    static BufferedReader br;

    static int Test_case ;
    static ArrayList<Integer>list = new ArrayList<>();
    static StringBuilder sb;


    public static void main(String[] args) throws IOException{

        Input();
        System.out.println(sb);


    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        Test_case = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < Test_case ; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list,Collections.reverseOrder());



        for(int i = 0 ; i < Test_case; i++) {
            sb.append(list.get(i)).append('\n');
        }







    }
}
