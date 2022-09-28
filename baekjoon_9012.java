package baekjoon_java;

import java.util.*;
import java.io.*;

//여는 괄호와 닫는 괄호의 개수가 같으면 되는문제 (O) 스택을 활용한다.(전혀생각못함.)
public class baekjoon_9012 {

    static StringBuilder sb;
    static String input_alpha;
    static char alpha;
    static int T;
    static BufferedReader br;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {

        Input();
        Output();

    }

    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {


            sb.append(Search(br.readLine())).append('\n');


        }
    }

    static void Output() throws IOException {
        System.out.println(sb);
    }

    static String Search(String name) {

        char ch ;
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0 ; i <name.length(); i++) {
            ch=name.charAt(i);

            if(ch=='(') {
                stack.push(ch);

                // 아래는 모두 닫는 괄호 일 경우들이다.
            }//// 스택이 비어있는 경우. 즉, 닫는 괄호를 입력받았으나 pop할 원소가 없을 경우
                else if(stack.isEmpty()) {
                    return "NO";
                }
            // 그 외의 경우 stack 원소를 pop 한다.
            else {
                stack.pop();
            }
        }
        //모든 검사를 마치고 잔여 원소가 남아있다면 no  원소가 남아있지 않다면 Yes 를 출력
        if(stack.isEmpty()) {
            return "YES";
        }else {
            return "NO";
        }



    }



}