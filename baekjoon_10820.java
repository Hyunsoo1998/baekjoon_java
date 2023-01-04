package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_10820 {

    static BufferedReader br;


    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {

        StringBuilder sb = new StringBuilder();

        br = new BufferedReader(new InputStreamReader(System.in));

        String Client_input = "";

        while(((Client_input = br.readLine()) != null) && ! Client_input.isEmpty()) {

            int result1 = 0, result2 = 0, result3 = 0, result4 = 0 ;

            for(int i = 0 ; i <Client_input.length(); i++) {
                //소문자일때. 97 ~ 122
                if((int)Client_input.charAt(i) >= 97 && (int)Client_input.charAt(i)<=122) {
                    result1 ++;
                }

                //대문자일때. 65 ~ 90

                else if((int)Client_input.charAt(i) >= 65 && (int)Client_input.charAt(i)<=90) {
                    result2 ++;
                }

                //숫자일때.(0~ 9 )  48 ~ 57

                else if((int)Client_input.charAt(i) >=48 && (int)Client_input.charAt(i)<=57) {
                    result3++;
                }
                //공백일때.
                else if((int)Client_input.charAt(i) == 32 ) {
                    result4 ++;
                }

            }
            sb.append(result1).append(' ').append(result2).append(' ').append(result3).append(' ').append(result4);
            sb.append('\n');

        }

        System.out.println(sb);

    }
}
