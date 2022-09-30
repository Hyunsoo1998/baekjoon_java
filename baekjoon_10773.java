package baekjoon_java;

import java.util.*;
import java.io.*;
public class baekjoon_10773 {
    static BufferedReader br;
    static int Test_case;

    public static void main(String[] args) throws IOException{
        Input();

    }
    static void Input()throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        Test_case = Integer.parseInt(br.readLine());

        Stack<Integer>stack  = new Stack<Integer>();


        for(int i = 0 ; i <Test_case; i++) {
           int input=Integer.parseInt(br.readLine());

            if(input==0) {
                stack.pop();
            }else {
                stack.push(input);
            }
        }
        int sum =0;
        for(int o:stack) {
            sum+=o;

            //stack.peek();
        }
        System.out.println(sum);
    }

}
