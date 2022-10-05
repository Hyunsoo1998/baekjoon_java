package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_1037 {
    static BufferedReader br;
    static StringTokenizer st ;
    static int arr[];
    static int N ,A ;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input()throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N= Integer.parseInt(br.readLine());

        arr = new int [N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < arr.length; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        if(arr.length == 1) {
            System.out.println(arr[0]*arr[0]);
        }else {
            System.out.println(Search(arr[0],arr[arr.length-1]));
        }



    }
    static int Search(int L , int R) {

        int result = L * R;




        return result ;

    }
}
