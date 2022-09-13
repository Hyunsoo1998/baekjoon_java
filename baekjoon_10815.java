package baekjoon_java;
import java.util.*;
import java.io.*;

//5
//        6 3 2 10 -10
public class baekjoon_10815 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(),"");


        int N= Integer.parseInt(br.readLine()); //상근이가 가지고 있는 카드의 갯수.
        int N_arr[] = new int[N]; // 상근이가 가지고 있는 카드의 배열
        for(int i=0; i<N_arr.length; i++) {
            N_arr[i]=Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine()); //상근이의 카드와 비교할 카드의 갯수 M
        int M_arr[] = new int[M]; //상근이가 가지고 있는 카드와 비교할 카드 M의 배열
        for(int i = 0 ; i<M_arr.length; i++) {

            N_arr[i]=Integer.parseInt(st.nextToken());


        }

        int result_arr[] = new int[M]; // 상근이가 가지고있는 카드와 같은 수를 가지고 있을 경우 1, 같은수를 가지고있지 않을경우 0
        //을 저장하기 위한 배열 선언.


        for(int i = 0; i<M_arr.length; i++) {

            for(int j = 0 ; j<N_arr.length; j++) {

                if(M_arr[i]==N_arr[j]) {
                    result_arr[i]=1;
                }else{
                    result_arr[i]=0;
                }
            }

        }
        for(int i = 0 ; i<M_arr.length; i++) {
            System.out.print(result_arr[i]+" ");
        }






    }
}
