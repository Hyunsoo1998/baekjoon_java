package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_11721 {
    static BufferedReader br;
    static String name ;


    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException  {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        name = br.readLine();

        for(int i = 0 ; i < name.length(); i++) {
            System.out.print(name.charAt(i));

            if(i%10 == 9) {
                System.out.println();
            }
        }

    }
}
