package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_3273 {
    static BufferedReader br;
    static StringTokenizer st;

    static int N ,arr[] ,X  ,count;

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br  = new BufferedReader(new InputStreamReader(System.in));

        N=Integer.parseInt(br.readLine());

        arr = new int [N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i <arr.length; i ++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }
        X=Integer.parseInt(br.readLine());

        Arrays.sort(arr);


        System.out.println(Search(arr,X,0,arr.length-1));



    }
    static int Search(int array[], int found ,int L , int R ) {
        found = X;

         count = 0 ;
        while(L<R) {
            if(arr[L]+arr[R]==found) {
                count ++;
                L++;
                R--;


            } else if ((arr[L] + arr[R])<found) {
                L++;
            }else if((arr[L]+arr[R])>found) {
                R--;
            }


        }
        return count;

    }
}
