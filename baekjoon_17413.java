package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_17413 {

    static BufferedReader br;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String Client_input = br.readLine();
        Stack<Character>stack = new Stack<>();
        boolean tag = false;

        int size = Client_input.length();

        for(int i = 0 ; i <size ; i++) {

            if(Client_input.charAt(i) == '<') {
                tag = true;

                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(Client_input.charAt(i));

            }
            else if(Client_input.charAt(i) == '>') {
                tag = false;
                sb.append(Client_input.charAt(i));
            }

            //태그내부 문자열일때.
            else if(tag == true) {

                sb.append(Client_input.charAt(i));

            }
            //태그내부가 아닐때

            else if(tag == false) {
               if(Client_input.charAt(i) == ' ') {

                   while(!stack.isEmpty()) {
                       sb.append(stack.pop());
                   }

                   sb.append(Client_input.charAt(i));

               }//공백이 아닐때, 공백일때 까지 push
               else {
                   stack.push(Client_input.charAt(i));
               }
            }
        }

            while(!stack.isEmpty()) {
                sb.append(stack.pop());
            }

            System.out.println(sb);

        }




    }

