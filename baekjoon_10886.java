package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int cute = 0 ; int not_cute = 0 ;

        int count = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < count ; i ++) {
            int input  = Integer.parseInt(br.readLine());
            if(input == 1) {
                cute++;
            }else if(input == 0 ) {
                not_cute++;
            }
        }

        if(cute > not_cute) {
            System.out.println("Junhee is cute!");
        }else if(not_cute > cute) {
            System.out.println("Junhee is not cute!");
        }



    }
}
