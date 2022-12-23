package baekjoon_java;

import java.io.*;


public class baekjoon_15680 {

    static BufferedReader br;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        int N  = Integer.parseInt(br.readLine());

        if(N == 0) {
            System.out.println("YONSEI");
        }
        if(N == 1) {
            System.out.println("Leading the Way to the Future");
        }
    }
}
