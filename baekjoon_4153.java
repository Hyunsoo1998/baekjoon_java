package baekjoon_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Collections;
import java.util.StringTokenizer;

public class baekjoon_4153 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));




            while(true) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");

               ArrayList<Integer> al = new ArrayList<Integer>();

               for(int i = 0 ; i<3; i++) {


                   al.add(Integer.parseInt(st.nextToken()));

               }
               Collections.sort(al);
                if((al.get(2)*al.get(2)) == (al.get(1)*al.get(1))+(al.get(0)*al.get(0))) {
                    if(al.get(2)==0 && al.get(1)==0 && al.get(0)==0) {
                        break;
                    }else{
                        System.out.println("right");
                    }


                }else if((al.get(2)*al.get(2))!=(al.get(1)*al.get(1))+(al.get(0)*al.get(0))) {
                    System.out.println("wrong");
                }









            }
        }
}
