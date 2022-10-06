package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_18258 {

    static BufferedReader br ;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N ;

    static LinkedList<Integer>queue = new LinkedList<Integer>();

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N= Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i ++) {
            st = new StringTokenizer(br.readLine()," ");

            switch(st.nextToken()) {
                case "push" :
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if(queue.isEmpty()) {
                        sb.append(-1).append('\n');
                        break;
                    }else {
                     sb.append(queue.poll()).append('\n'); //poll : 큐 맨 앞에 있는 값 반환 후 삭제 /큐가 비어있을 경우 null 반환
                        break;
                    }

                    case "size" :
                    sb.append(queue.size()).append('\n');
                        break;

                        case "empty" :
                    if(queue.isEmpty()) {
                        sb.append(1).append('\n');
                        break;
                    }
                    else {
                        sb.append(0).append('\n');
                            break;
                    }
                case "front" :
                    if(queue.isEmpty()) {
                        sb.append(-1).append('\n');
                        break;
                    }else {
                        sb.append(queue.peek()).append('\n');
                        break;
                    }
                case "back" :
                    Integer num = queue.peekLast();
                    if (queue.isEmpty()) {
                        sb.append(-1).append('\n');
                        break;
                    }else {
                        sb.append(queue.peekLast()).append('\n');
                        break;
                    }
            }
        }
        System.out.println(sb);
    }
}
