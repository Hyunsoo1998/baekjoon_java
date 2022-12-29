/*
2차원 배열을 Arrays.toString()을 사용하려면 Arrays.deepToString()을 사용해야한다.
또한 2차원 배열을 정렬을 하기 위해서는 Arrays.sort()로는 정렬을 못한다.


1.Comparator를 통한 익명클래스를 구현하는방법.

->// 1. Comparator 익명 클래스 구현
Arrays.sort(arr, new Comparator<int[]>() {
    @Override
    public int compare(int[] o1, int[] o2) {
        return o1[0]-o2[0]; // 첫번째 숫자 기준 오름차순 {1,30}{2,10}{3,50}{4,20}{5,40}
        //return o2[0]-o1[0]; // 첫번째 숫자 기준 내림차순 {5,40}{4,20}{3,50}{2,10}{1,30}
        //return o1[1]-o2[1]; // 두번째 숫자 기준 오름차순 {2,10}{4,20}{1,30}{5,40}{3,50}
        //return o2[1]-o1[1]; // 두번째 숫자 기준 내림차순 {3,50}{5,40}{1,30}{4,20}{2,10}
    }
});


2. Lamda식 사용

int[][] arr = new int[][]{{5,40},{3,50},{1,30},{4,20},{2,10}};
// 2. Lambda 사용 - Java 8이상
Arrays.sort(arr, (o1, o2) -> {
    return o1[0]-o2[0]; // 첫번째 숫자 기준 오름차순 {1,30}{2,10}{3,50}{4,20}{5,40}
});

이런식으로 정렬을 해줘야한다.

출처: https://ifuwanna.tistory.com/328


*/


package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_2075 {
    static BufferedReader br;
    static StringTokenizer st;
    static int N;
    static int arr[];

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());


        arr = new int [N*N];


        int number = 0 ;
        for(int i = 0 ; i < N; i ++) {

            st = new StringTokenizer(br.readLine());

            for(int j = 0; j <N ; j++) {
                arr[number++] = Integer.parseInt(st.nextToken());
            }

        }
        Arrays.sort(arr);

        System.out.println(arr[N*N - N]);


    }
}
