package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_17608 {
    static BufferedReader br;
    static ArrayList<Integer>list  = new ArrayList<>();
    static Stack<Integer>stack = new Stack<>();


    public static void main(String[] args) throws IOException{

        Input();
        logic();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int Test_case = Integer.parseInt(br.readLine());


        for(int i = 0; i < Test_case ; i++) {

            list.add(Integer.parseInt(br.readLine()));
        }
    }
    static void logic() throws IOException {

        int count = 0 , stick = list.get(list.size()-1);

        for(int i = list.size()-1 ; i>=0 ; i --) {

            if(stack.isEmpty()) {
                stack.push(list.get(i));

                continue;
            }

            if(!stack.isEmpty()) {
                if(stack.peek()<list.get(i)) {
                    stack.push(list.get(i));
                }else {
                    continue;
                }

            }
        }
        System.out.println(stack.size());




    }
}
