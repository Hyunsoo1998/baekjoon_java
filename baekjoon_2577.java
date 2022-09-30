package baekjoon_java;

import java.io.*;
import java.util.*;

public class baekjoon_2577 {
    static BufferedReader br;

    static int A ,B, C ;
    static int arr[]; //처음에 값들을 넣어줄 배열
    static int count[]; // 0~9까지 값들을 세기위한 배열
    static String name;

    public static void main(String[] args) throws IOException {
        Input();
        Output();


    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        A= Integer.parseInt(br.readLine());
        B=Integer.parseInt(br.readLine());
        C=Integer.parseInt(br.readLine());

        //변수 name에 A*B*C의 값을 문자열로 변환.

        name = Integer.toString(A*B*C);

        //int타입 배열 arr을 문자열의 길이의 크기만큼 선언.
        arr = new int [name.length()];

        //array2배열의 크기를 name변수의 길이만큼 크기 선언.
        String array2[] = new String[name.length()];

        //count배열은 각 정수들이 몇번 출력되었는지 저장하기 위해 선언함.
        //따라서 크기는 10으로 선언 0~9까지니까.
        count= new int[10];

        //array2에 각 인덱스에 문자열을 잘라서 넣어줌.
        array2=name.split("");
//        System.out.println(Arrays.toString(array2));

        for(int i =0 ; i<arr.length; i++) {
            //int타입 배열에 string타입에 넣어준 값들을 형 변환해서 넣어줌.
         arr[i]=Integer.parseInt(array2[i]);

        }
        for(int i = 0 ; i <arr.length; i++) {
            //최빈값을 구하는 알고리즘 -> count 배열의 인덱스에 각 숫자들이 몇번 들어갔는지 세기위해서.
            count[arr[i]]++;
        }


    }
    static void Output()throws IOException {
        //각 인덱스에 들어간 수 들은 0~9사이기 때문에
        for(int i =0; i<10; i++) {
            System.out.println(count[i]);
        }


    }


}
