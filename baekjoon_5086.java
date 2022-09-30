package baekjoon_java;

import java.util.*;
import java.io.*;
public class baekjoon_5086 {
    static int N, M;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        Input();



    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));


       while(true) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            if(N==0&&M==0) {
                Output(0, 0);
                     break;
            }

            Output(N,M);
        }

    }
    static void Output(int a, int b) {
        if(a==0 && b==0) {
            return;
        }
        if (a < b) {
            if (b % a == 0) {
                System.out.println("factor");
            }else if(b%a!=0) {
                System.out.println("neither");
            }
        }else if(a>b) {
            if (a % b == 0) {
                System.out.println("multiple");
            } else if(a%b!=0){
                System.out.println("neither");
            }
        }else if(a%b!=0 && a%b!=0) {
            System.out.println("neither");
        }

    }
}
