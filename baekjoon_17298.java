package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_17298 {
    static BufferedReader br;
    static StringTokenizer st ;
    static StringBuilder sb ;
    static int N ;

    static int arr[];

//    static Iterator<Integer> it =
    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int [N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //첫번째 원소부터 마지막 원소 전 까지 탐색.
        //마지막 원소는 문제의 조건에 맞는 값을 찾을 수 없음 .
        for(int i= 0 ; i < arr.length-1; i++) {
            Search(arr,  arr[i],1);
        }

        System.out.println(sb);




    }

    //함수의 호출 횟수이자 배열의 인덱스 값을 증가 시킬 count변수 선언.
    static void Search(int array[] , int X, int count) {

        int temp = 0 ;


        //배열의 첫번째 원소부터 마지막 원소 전 까지 탐색

            //배열의 두번째 원소부터 마지막원소 까지 탐색.
            for(int j = count ; j < array.length; j ++) {

                if(array[j]>X) {
                    temp = array[j];
                    sb.append(temp).append(' ');
                    temp = 0;
                    break;

                }


                count++;
        }
        //배열의 원소가 x값보다 큰 값을 못찾았으므로 -1 을 sb에 달기.


        return ;

    }
}
