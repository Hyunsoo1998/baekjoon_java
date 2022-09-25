package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_11478 {
    static BufferedReader br ;
    static StringTokenizer st;

    static int N ;
    static String str;
    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();


        String name ;


        HashSet<String>  set = new HashSet<String>();


        for(int i = 0; i < str.length() ; i++) {
                name ="";

            for(int j= i; j <str.length() ; j++) {
                name += str.substring(j,j+1);
                set.add(name);
            }
        }
        System.out.println(set.size());



    }
}
