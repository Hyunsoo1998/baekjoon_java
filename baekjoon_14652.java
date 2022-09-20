package baekjoon_java;
import java.util.*;
import java.io.*;

public class baekjoon_14652 {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;

    static int N , M , K ;
    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K= Integer.parseInt(st.nextToken());



        int count = 0;
        for(int i = 0 ; i <N ; i++) {

            for(int j = 0 ; j<M ; j++) {
                if(K == count) {
                    System.out.println(i+" "+j);
                }
                count++;
            }

        }
    }
}
