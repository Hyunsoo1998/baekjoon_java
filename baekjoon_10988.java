package baekjoon_java;

import java.io.*;



public class baekjoon_10988 {

    static BufferedReader br;


    public static void main(String[] args) throws IOException {

        Input();

    }

    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
//
//        sb = new StringBuilder(br.readLine());
//
//        String reverse = sb.reverse().toString();
//
//        System.out.println(reverse);
//        System.out.println(sb.reverse());
//
//        if(sb.equals(reverse)) {
//            System.out.println(1);
//        }else {
//            System.out.println(0);
//        }
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);
        if (s.equals(sb.reverse().toString())) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }

}

