package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_10101 {
    static BufferedReader br;
    static int angle1 , angle2,  angle3;

    public static void main(String[] args) throws IOException{

        Input();

        logic();

    }
    static void Input()throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        angle1 = Integer.parseInt(br.readLine());
        angle2 = Integer.parseInt(br.readLine());
        angle3 = Integer.parseInt(br.readLine());



    }
    static void logic() throws IOException {

        if(angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.println("Equilateral");


        }
        else if(angle1+angle2+angle3==180){
            if(angle1==angle2 || angle1==angle3 || angle2 == angle3 ) {
                System.out.println("Isosceles");

            }else if(angle1 != angle2 && angle1 != angle3 && angle2!=angle3) {
                System.out.println("Scalene");
            }
        }else{
            System.out.println("Error");
        }

    }
}
