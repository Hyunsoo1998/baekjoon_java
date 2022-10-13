package baekjoon_java;

import java.io.*;
import java.util.*;

public class baekjoon_2920 {

    static BufferedReader br;
    static StringTokenizer st;
    static int arr1[];


    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br= new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        arr1 = new int [8];
        int arr2[] = new int [8];
        Integer arr3[] = new Integer [8];

        for(int i = 0 ; i < arr1.length; i ++) {

            arr1[i]= Integer.parseInt(st.nextToken());
            arr2[i]= arr1[i];
            arr3[i]=arr1[i];

        }

        Arrays.sort(arr2);
        Arrays.sort(arr3,Collections.reverseOrder());


        int count_ascend = 0 ;
        int count_descend= 0 ;
        for(int i =0 ; i < arr2.length; i ++) {
            if(arr1[i]==arr2[i]) {
                count_ascend++;
            }
            else if(arr1[i]==arr3[i]) {
                count_descend++;
            }
        }

        if(count_ascend == 8) {
            System.out.println("ascending");
        }else if(count_descend==8) {
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }
    }
}
