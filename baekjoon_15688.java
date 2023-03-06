package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_15688 {
    static BufferedReader br;
    static int Test_case ;
    static StringBuilder sb ;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder ();

        Test_case = Integer.parseInt(br.readLine());
        int Client_input []  = new int[Test_case];

       for(int i = 0 ; i< Test_case; i++) {
           Client_input[i] = Integer.parseInt(br.readLine());

       }
       Arrays.sort(Client_input);

       for(int i = 0 ; i < Client_input.length; i ++) {
           sb.append(Client_input[i]).append('\n');
       }


        System.out.println(sb);

    }
}
