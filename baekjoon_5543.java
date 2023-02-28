package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_5543 {
    static BufferedReader br;

    static ArrayList<Integer>burger ;
    static ArrayList<Integer>beverage;


    public static void main(String[] args) throws IOException{

        Input();
        logic();
    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        burger = new ArrayList<>();
        beverage = new ArrayList<>();

            for(int i = 0 ; i < 3; i ++) {
                burger.add(Integer.parseInt(br.readLine()));


            }

            for(int i = 0; i< 2; i ++) {
                beverage.add(Integer.parseInt(br.readLine()));
            }






    }
    static void logic() throws IOException {

        Collections.sort(burger);
        Collections.sort(beverage);

        int sum = 0 ;

       sum += burger.get(0);
       sum += beverage.get(0);

       sum = sum-50;

        System.out.println(sum);



    }
}
