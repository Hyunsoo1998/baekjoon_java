package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_5585 {
    static BufferedReader br;

    public static void main(String[] args) throws IOException{

        Input();
    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int Input = Integer.parseInt(br.readLine());

        logic(Input);


    }
    static void logic (int money) throws IOException {

        //100엔, 50엔, 10엔, 5엔, 1엔
        int left_money = 1000-money;

        int count = 0 ;
        while(left_money != 0) {

            if(left_money >=500) {
                left_money = left_money - 500;
                count++;
                continue;
            }
            if(left_money >=100) {
                left_money = left_money - 100;
                count++;
                continue;
            }
            if(left_money >=50 ) {
                left_money = left_money - 50;
                count++;
                continue;
            }
            if(left_money >= 10) {
                left_money = left_money - 10;
                count++;
                continue;
            }
            if(left_money >=5) {
                left_money =left_money -5 ;
                count++;
                continue;
            }
            if(left_money >= 1) {
                left_money = left_money -1 ;
                count++;
                continue;
            }
        }
        System.out.println(count);


    }

}
