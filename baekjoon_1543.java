package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_1543 {


    static BufferedReader br;
    static ArrayList<Character>Client_input_save;

    public static void main(String[] args) throws IOException {

        Input();




    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
//
//        Client_input_save = new ArrayList<>();
//
//        String Client_input = br.readLine();
//        String Client_word = br.readLine();
//
//        int Client_input_length = Client_word.length();
//        int count = 0 ;
//
//        for(int i = 0 ; i < Client_input.length(); i ++) {
//            Client_input_save.add(Client_input.charAt(i));
//
//        }
//
//        for(int i = 0 ; i <Client_input_save.size()-Client_input_length +1; i ++) {
//            if(Client_input_save.subList(i,i+Client_input_length).equals(Client_word)) {
//                i+=Client_input_length-1;
//                count++;
//            }
//        }
//        System.out.println(count);

        String document = br.readLine();
        char[] documents = document.toCharArray();

        String word = br.readLine();
        int L = word.length();

        int cnt = 0;

        for (int i = 0; i < documents.length - L+1 ; i++) {
            if(document.substring(i,i+L).equals(word)){
                i+=L-1;
                cnt++;
            }
        }
        System.out.println(cnt);


    }


}
