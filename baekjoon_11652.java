package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_11652 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long [] arr = new long[N];

        for(int i = 0 ; i< N ; i++) {
            arr[i]=Long.parseLong(br.readLine());
        }
        Arrays.sort(arr);

        int count = 1;
        int maxIdx =0;
        int max = 1;


        //Arrays.sort()로 배열을 오름차순 정렬 했기 때문에, 아래의 for문을 이용하여 i번째 인덱스와 i-1번째 인덱스를 비교
        for(int i = 1 ; i<N; i++) {
            if(arr[i]==arr[i-1]) {
                count ++;
            }else{
                count =1;

            }
            if(count > max) {
                max =count ;
                maxIdx= i;
            }
        }
        System.out.println(arr[maxIdx]);

    }
}
