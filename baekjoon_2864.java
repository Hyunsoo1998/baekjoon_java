package baekjoon_java;

import java.io.*;
import java.util.*;

public class baekjoon_2864 {

    static BufferedReader br;
    static StringTokenizer st ;
    static StringBuilder sb ;


    public static void main(String[] args) throws IOException {

        Input();

        System.out.println(sb);

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        String name1 = st.nextToken();
        String name2 = st.nextToken();


        Min(name1, name2);
        Max(name1, name2);


    }
    static void Min(String input1 , String input2) {

        char arr1[] =  new char[input1.length()];
        char arr2[] =  new char[input2.length()];

        for(int i = 0 ; i <arr1.length; i++) {
            arr1[i]=input1.charAt(i);

            if(arr1[i]=='6') {
                arr1[i]='5';
            }
        }
        for(int i = 0 ; i <arr2.length; i ++) {
            arr2[i]=input2.charAt(i);

            if(arr2[i]=='6') {
                arr2[i]='5';
            }
        }

        String min_result1  =  new String(arr1);
        String min_result2 = new String(arr2);

        int a = Integer.parseInt(min_result1);
        int b = Integer.parseInt(min_result2);

        int min__result = a+ b;
        sb.append(min__result).append(' ');
    }

    static void Max(String input1 , String input2) {

        char arr1[]  = new char[input1.length()];
        char arr2[]  =new char[input2.length()];

        for(int i  = 0; i < arr1.length; i ++) {
            arr1[i]=input1.charAt(i);

            if(arr1[i]=='5') {
                arr1[i]='6';
            }
        }

        for(int i = 0 ; i < arr2.length; i ++) {

            arr2[i]= input2.charAt(i);

            if(arr2[i]=='5') {
                arr2[i]='6';
            }
        }
        String max_result1= new String(arr1);
        String max_result2 = new String(arr2);

        int A = Integer.parseInt(max_result1);
        int B = Integer.parseInt(max_result2);

        int result__ = A+B;

        sb.append(result__);

    }
}
