package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_14425 {
    static String arr1[], arr2[];
    static int N , M,  sum;

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        Input();
        Output();
    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        arr1= new String[N];



        for(int i = 0 ; i<N ; i ++) {
            arr1[i]=br.readLine();
        }

        arr2= new String[M];


        for(int i = 0 ; i < M ; i++) {
            arr2[i]=br.readLine();
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for(int i = 0 ; i < M; i++) {
            Func(arr1,arr2[i]);

        }
    }
    static void Output() throws IOException {
        System.out.println(sum);
    }
    static int Func( String arr1[],String a) {
        for(int i = 0 ; i < arr1.length; i ++) {
            if(arr1[i].equals(a))
                sum=sum+1;
        }
        return sum;
    }


}
