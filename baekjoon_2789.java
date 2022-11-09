package baekjoon_java;

import java.io.*;
import java.util.*;

public class baekjoon_2789 {

    static ArrayList<Character>Standard_list = new ArrayList<>();
    static ArrayList<Character>Client_input ;
    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        Input();
        logic();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        String CAMBRIDGE  = "CAMBRIDGE";

        String Client = br.readLine();

        for(int i = 0 ; i < CAMBRIDGE.length() ; i ++) {
            Character change = CAMBRIDGE.charAt(i);
            Standard_list.add(change);
        }

        Client_input = new ArrayList<>();


        for(int i = 0 ; i < Client.length(); i ++) {
            Character Client_change = Client.charAt(i);
            Client_input.add(Client_change);
        }


    }
    static void logic () {

        for(int i = 0 ; i < Client_input.size() ; i++) {

            if(!Standard_list.contains(Client_input.get(i))) {
                sb.append(Client_input.get(i));
                Client_input.remove(i);
                i = -1;
            }
        }
        System.out.println(sb);

    }
}
