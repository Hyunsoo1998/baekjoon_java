package baekjoon_java;


import java.util.*;
import java.io.*;

public class bakejoon_1264 {
    static BufferedReader br;

    public static void main(String[] args) throws IOException{


        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));


        int n ;

        String name ;
        while(   !(name =br.readLine()).equals("#")) {
            // A : 65, a : 97, Z: 90 , z:  122

            int count = 0;

                char arr[] = new char[name.length()];

                for (int i = 0; i < arr.length; i++) {

                    arr[i] = name.charAt(i);

                    n = (int) arr[i];

                    if (n > 90) {
                        n = n - 32;
                        arr[i] = (char) n;
                    }
                }

                for (int i = 0; i < arr.length; i++) {

                    //'a', 'e', 'i', 'o', 'u
                    if (arr[i] == 'A') {
                        count++;
                    } else if (arr[i] == 'E') {
                        count++;
                    } else if (arr[i] == 'I') {
                        count++;
                    } else if (arr[i] == 'O') {
                        count++;
                    } else if (arr[i] == 'U') {
                        count++;
                    }
                }
            System.out.println(count);
        }
    }
}
