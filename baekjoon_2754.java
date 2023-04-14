import java.util.*;
import java.io.*;


public class baekjoon_2754 {
    static BufferedReader br;



    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws  IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Double> Client_map = new HashMap<>();

        Client_map.put("A+" , 4.3);
        Client_map.put("A0",4.0);
        Client_map.put("A-",3.7);
        Client_map.put("B+" ,3.3);
        Client_map.put("B0",3.0);
        Client_map.put("B-",2.7);
        Client_map.put("C+" ,2.3);
        Client_map.put("C0",2.0);
        Client_map.put("C-" ,1.7);
        Client_map.put("D+",1.3);
        Client_map.put("D0",1.0);
        Client_map.put("D-" ,0.7);
        Client_map.put("F",0.0);

        String Client_input = br.readLine();

        if(Client_map.containsKey(Client_input)) {
            System.out.println(Client_map.get(Client_input));
        }






    }

}
