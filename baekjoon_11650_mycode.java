package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_11650_mycode {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        int Xarr[] = new int[N];
        int Yarr[] = new int[N];

        for(int i = 0 ; i<Xarr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Xarr[i]=Integer.parseInt(st.nextToken());
            Yarr[i]=Integer.parseInt(st.nextToken());




        }
        Arrays.sort(Xarr);
        Arrays.sort(Yarr);
        for(int i =0; i < Xarr.length; i++) {
            System.out.println(Xarr[i]+""+Yarr[i]);

        }
        }
}
