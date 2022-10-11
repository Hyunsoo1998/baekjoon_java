package baekjoon_java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class baekjoon_10824 {
    static Double A , B , C , D ;
    static BufferedReader br;
    static StringTokenizer st ;


    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        String A_String=st.nextToken();
        String B_String=st.nextToken();
        String C_String=st.nextToken();
        String D_String=st.nextToken();


        BigInteger AplusB = new BigInteger(A_String+B_String);
        BigInteger CplusD = new BigInteger(C_String+D_String);

        System.out.println(AplusB.add(CplusD));

    }
}
