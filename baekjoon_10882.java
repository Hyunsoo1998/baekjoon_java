package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_10882 {

    static String Client_arr[];
    static BufferedReader br;

    public static void main(String[] args) throws IOException{

        Input();



    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        String Client_input = br.readLine();

        Client_arr = Client_input.split(",");
        int result = 0 ;

        for(int i = 0 ; i <Client_arr.length ; i ++) {
            result += Integer.parseInt(Client_arr[i]);


        }
        System.out.println(result);



    }

}
