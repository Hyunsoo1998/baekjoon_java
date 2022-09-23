package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_1269 {
    static int N , M ;
    static int arr1[], arr2[];
    //2개의 ArrayList를 만들어서 각각 차집합의 결과를 넣어서 list의 사이즈를 출력하기.
    static ArrayList<Integer> list1 = new ArrayList<Integer>();
    static ArrayList<Integer> list2 = new ArrayList<Integer>();

    static BufferedReader br ;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        Input();
        Output();

    }
    static void Input()throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());

        arr1 = new int [N];
        arr2 = new int [M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i< N ; i ++) {
                arr1[i]= Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < M ; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
    }
    static void Output()throws IOException {

            Arrays.sort(arr2);

            for(int i = 0 ; i < arr1.length; i ++) {
                  if(Func(arr2,0,arr2.length-1,arr1[i])==0) { // 중복되는 값을 찾았을경우
                      //list1에 추가를안하고 다음 for문으로.
                      continue;

                  }else if(Func(arr2,0,arr2.length-1,arr1[i])==1){
                      //중복되는 값을 못 찾았을 경우 list1에 값을 추가.

                     list1.add(arr1[i]);

            }
        }
            Arrays.sort(arr1);
            for(int i = 0; i < arr2.length; i ++) {


               if(Func(arr1,0,arr1.length-1,arr2[i]) == 0) { //중복되는 값을 찾았을경우
                   //list2에 추가를 안하고 다음 for문으로 넘어간다.
                   continue;
               }else {
                   list2.add(arr2[i]);

            }
        }

        System.out.println(list1.size()+list2.size());
    }
    //이진탐색 알고리즘.
    static int Func(int array[], int L , int R, int  X ) {
        while(L<=R) {
            int mid = (L+R)/2;
            if(X==array[mid])
                return 0; //중복되는 값을 찾았으면 return 0
            else if(array[mid]<X) {
                L=mid+1;
            }else{
                R=mid-1;
            }
        }
        return 1; //중복되는 값을 못찾았으면 return 1;

    }

}
