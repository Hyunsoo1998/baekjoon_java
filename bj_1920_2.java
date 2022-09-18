package baekjoon_java;

import java.util.*;
import java.io.*;

public class bj_1920_2 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    static int N ,M;
    static int arr1[],arr2[];

    public static void main(String[]args) throws IOException{

        Input();
        Output();

    }
    static void Input() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));

        sb = new StringBuilder();

         N = Integer.parseInt(br.readLine());
         arr1 = new int[N];

        int index= 0 ;

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            arr1[index]=Integer.parseInt(st.nextToken());
            index++;
        }
         M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        arr2= new int[M];
        index = 0 ;
        while(st.hasMoreTokens()) {
            arr2[index]=Integer.parseInt(st.nextToken());
            index++;
        }
  ///      System.out.println(Arrays.toString(arr1));
    //    System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);




    }
    static void Output() throws IOException {
        sb= new StringBuilder();
        for(int i =0 ; i<M; i++) {
            sb.append(Binary(arr1,0,arr1.length-1,arr2[i])).append('\n');
        }
        System.out.println(sb);

    }
    static int Binary(int []arr1, int L, int R, int X) {

        while(L<=R) {
            int mid = (L+R)/2;
            if(arr1[mid]==X) {
                return 1;

            }else if(arr1[mid]<X) {
               L=mid+1;
            }else {
                R=mid-1;
            } //12345
        }
        return 0;
    }
}
