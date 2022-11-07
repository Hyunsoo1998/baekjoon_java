package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_2744 {
    static BufferedReader br;
    static char arr [] ;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        String alpha = br.readLine();

        arr = new char[alpha.length()];

            for(int i = 0 ; i < arr.length; i ++) {
                arr[i]=alpha.charAt(i);

                if((int)arr[i]>= 65 && (int)arr[i]<=90) {
                    arr[i]=(char)((int)arr[i]+32);
                }
                else if((int)arr[i]>=97 && (int)arr[i]<=122) {
                    arr[i]=(char)((int)arr[i]-32);
                }
                sb.append(arr[i]);
            }
                System.out.println(sb);





    }
}
