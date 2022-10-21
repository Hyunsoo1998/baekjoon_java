package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_4101 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;


    public static void main(String[] args) throws IOException{

        Input();


    }
    static void Input() throws IOException {
        br= new BufferedReader(new InputStreamReader(System.in));

        sb= new StringBuilder();

        while(true) {
            st = new StringTokenizer(br.readLine());
            int number1 = Integer.parseInt(st.nextToken());
            int number2 = Integer.parseInt(st.nextToken());

            if(number1 == 0 && number2 == 0) {
                break;
            }else {
                if(number1> number2) {
                    sb.append("Yes").append('\n');
                }else  {
                    sb.append("No").append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
