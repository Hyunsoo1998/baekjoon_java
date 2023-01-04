package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_2493 {

    static BufferedReader br;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        int Test_case = Integer.parseInt(br.readLine());


        Stack<int[]> stack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 1;  i<= Test_case ; i++) {


            int top = Integer.parseInt(st.nextToken());
            while(!stack.isEmpty()) {

                if(stack.peek()[1]>= top) {

                    System.out.print(stack.peek()[0] + " ");
                    break;

                }
                stack.pop();
            }
            if(stack.isEmpty()) {
                System.out.print("0 ");
            }
            stack.push(new int[] {i, top});


        }




    }

}
