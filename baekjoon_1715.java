package baekjoon_java;

import java.io.*;
import java.util.*;


public class baekjoon_1715 {

    static BufferedReader br;
    static int N ,arr[] ;
    static int arr2[];

    static int save_arr[];


    public static void main(String[] args) throws IOException {
        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr2= new int [N];
        arr = new int [N];
        save_arr = new int [N];

        for(int i = 0 ; i < N; i++) {
            arr[i] =Integer.parseInt(br.readLine());


        }
        Arrays.sort(arr);

        //System.out.println("입력받은 배열: "+Arrays.toString(arr));
        Search(0,1);

    }
    static void Search(int L, int R ) {

        int i = 0 ;
        while(R<arr.length-1) {

            //입력 예제 기준: 10 20 40
            int sum=arr[L]+arr[R]; //Ex: 10+ 20 값 저장.
            int sum2 = sum+arr[R+1]; // Ex: (10+20)+40값 저장.

            arr2[i]=arr[L]+arr[R];//Ex: 10+ 20 값을 arr2배열에 저장.
            save_arr[i]=sum2; // (10+20)+40값을 save_arr배열에 저장.

            L++;
            R++;
            i++;

          //  System.out.println("합 출력 배열: "+ Arrays.toString(save_arr));
        }
            int result=0;

        for(int j= 0 ; j < N; j++) {

            //result변수에 arr2배열과 save_arr배열의 인덱스들의 합을 저장 후 출력.
            result += arr2[j] + save_arr[j];
        }

        System.out.println(result);
    }
    static void input_0()throws IOException {
        System.out.println(0);
    }
}
