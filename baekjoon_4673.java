package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_4673 {
    public static void main(String[] args)  {
        StringBuilder sb = new StringBuilder();

        boolean arr[] = new boolean[10001]; //1부터 10000이므로 10001

        for(int i = 1; i<10001; i++) {
            int n = Func(i);

        if(n<10001) {
            arr[n]=true;
        }

        }
        for(int i = 1; i<10001; i++) {
            if(!arr[i]) {
                sb.append(i).append('\n'); //append(arr[i])가 아닌   append(i)인 이유. 앞에 문법으로 사용할 경우
                                            //저장된 값이 boolean 타입이기 때문에 True or False로만 출력이 됨.
            }

        }
        System.out.println(sb);



    }
    public static int Func(int number) {

        //number가 1234 일 경우.
        int sum = number;
        while(number!=0) {
             sum=sum+(number%10); // 첫번째 자리수 구하기 위해.
             number = number/10; // 10을 나누어서 첫번째 자리를 없앤다.


        }
        return sum;




    }

}
