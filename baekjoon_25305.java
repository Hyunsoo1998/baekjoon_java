package baekjoon_java;

import java.text.CollationElementIterator;
import java.util.*;
import java.io.*;

public class baekjoon_25305 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int k = scan.nextInt();


        Integer[]arr = new Integer[N];

        for(int i = 0 ; i<arr.length; i++) {
            arr[i]=scan.nextInt();

        }


       Arrays.sort(arr,Collections.reverseOrder());

        System.out.println(arr[k-1]);








    }
}
