package baekjoon_java;

import java.util.*;
import java.io.*;

public class boj_17298 {

    static BufferedReader br;
    static StringTokenizer st ;
    static StringBuilder sb ;
    static int N ;

    static int count = 0 ;


    static ArrayList<Integer>list = new ArrayList<>();


    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());



        st = new StringTokenizer(br.readLine());


        for(int i = 0 ; i < N ; i++) {
            int input = Integer.parseInt(st.nextToken());
            list.add(input);
        }

        //첫번째 원소부터 마지막 원소 전 까지 탐색.
        //마지막 원소는 문제의 조건에 맞는 값을 찾을 수 없음 .
        for(int i= 0 ; i < list.size(); i++) {

            Search(list,  list.get(i));
            count ++ ;

        }


        System.out.println(sb);

    }

    //함수의 호출 횟수이자 배열의 인덱스 값을 증가 시킬 count변수 선언.
    static void Search(ArrayList<Integer>list1 , int X) {

        int temp = 0;
        int max = Integer.MIN_VALUE;



        //배열의 마지막 원소는 원하는 값을 찾을수 없으니 sb에 -1을 달아줌.
        if (count == list1.size()-1) {

            sb.append(-1);

            return;
        } else {

            //배열의 두번째 원소부터 마지막원소 까지 탐색.
            for (int j = count; j < list1.size(); j++) {

                if (list1.get(j) > X) {
                    temp = list1.get(j);
                    sb.append(temp).append(' ');

                    break;

                }
                }

            for(int i =  count ; i < list1.size(); i++) {

                if(list1.get(i)>max) {
                    max= list1.get(i);
                }
            }

            if(max<=X) {
                sb.append(-1).append(' ');

                max= Integer.MIN_VALUE;

                return ;
            }

            //배열의 원소가 x값보다 큰 값을 못찾았으므로 -1 을 sb에 달기.


            return;

        }
    }


}
