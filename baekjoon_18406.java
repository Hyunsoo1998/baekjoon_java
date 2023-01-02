package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_18406 {

    static BufferedReader br;


    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        String Client_input = br.readLine();

        int sum1 = 0  , sum2 = 0 ;
        int arr [] = new int[Client_input.length()];
        int result [] = new int[2];



        for(int i = 0 ; i < arr.length/2; i++) {

            arr[i] =Client_input.charAt(i)- '0';


            sum1 += arr[i];
        }


        for(int j = arr.length/2; j<arr.length; j++) {
            arr[j] = Client_input.charAt(j) - '0';

            sum2 += arr[j];

        }

        result[0] = sum1 ;
        result[1] = sum2;

        if(result[0] == result[1]) {
            System.out.println("LUCKY");
        }

        if(result[0] != result[1]) {
            System.out.println("READY");
        }



    }
}
