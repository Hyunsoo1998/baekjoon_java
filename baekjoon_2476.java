package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_2476 {
    static BufferedReader br;
    static StringTokenizer st;
    static int Person;
    static int Client_input [][];

    public static void main(String[] args) throws IOException{
        Input();
        logic();
    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        Person = Integer.parseInt(br.readLine());

        Client_input  = new int [Person][3];

    }
    static void logic() throws IOException {

        Stack<Integer>stack = new Stack<>();

        while(Person -->0) {
            int count = 0 ;
            int result_count []  = new int [7];

//            for (int i = 1; i < result_count.length; i++) {
//
//                result_count[i] = 0;
//
//            }
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i <3; i++) {
                result_count[Integer.parseInt(st.nextToken())]++;
            }

//            if(result_count[result_count.length-1] == 3) {
//                count =  (10000) +(result_count[result_count.length-1]*1000);
//            }
//            else if(result_count[result_count.length-1] == 2) {
//                count = (1000) + (result_count[result_count.length-1]*100);
//
//            }else {
//                count = (result_count[result_count.length-1])*100;
//            }
//            System.out.println(result_count[result_count.length-1]);
//
//            System.out.println(count);

            for(int i = 1; i<7; i++) {
                if(result_count[i] == 3) {
                    count = (10000) + (i*1000);

                    break;
                }
                else if(result_count[i] == 2) {
                    count = (1000) + (i * 100);
                    break;

                }else {
                    count = (i)*100;
                }
            }

            if(stack.empty()) {
                stack.push(count);
            }else {

                if(stack.peek()<count) {
                    stack.pop();
                    stack.push(count);
                }
            }
        }

        System.out.println(stack.pop());
    }
}
