package baekjoon_java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class baekjoon_13277 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger N = new BigInteger(st.nextToken());


        BigInteger M = new BigInteger(st.nextToken());

        System.out.println(N.multiply(M));

    }
}
