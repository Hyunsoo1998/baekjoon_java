package baekjoon_java;
import java.util.*;
import java.io.*;

public class baekjoon_3046 {
    static BufferedReader br;
    static StringTokenizer st;
    static int  R1, S ;

    public static void main(String[] args) throws IOException{

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        R1 = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        int R2= (2*S)-R1;

        System.out.println(R2);





    }
}
