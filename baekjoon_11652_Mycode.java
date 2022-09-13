package baekjoon_java;

import java.io.*;

public class baekjoon_11652_Mycode {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N]; //준규가 가지고 있는 카드를 담을 배열 선언.
        int sort_arr[] = new int [N]; // 준규가 가지고 있는 카드중 가장 많은 수를 담기 위한 배열 선언.

        int modeNum = 0 ; // 가장 많이 출현한 숫자를 출력할 정수 선언 .
        int min = 0;

        for(int i = 0; i<N; i++) {
            arr[i]=Integer.parseInt(br.readLine());

        }
        for(int i = 0 ; i<N;  i++) {
            sort_arr[arr[i]]++;
        }

        for(int i = 0 ; i<N; i++) {
            if(modeNum<sort_arr[arr[i]]) {
                modeNum=i;

            }
        }
        System.out.println(modeNum);
    }
}
