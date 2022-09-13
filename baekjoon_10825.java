package baekjoon_java;

import java.util.*;
import java.io.*;

//만약에 클래스를 생성안하고 배열로 할 경우에는 N의 갯수에따라 2차원 배열로 선언해서 필드갯수만큼 열의 크기를 만들어서 입력을 받으려 했지만.
//그렇게 해준다 한들 정렬 후에는 열의 인덱스가 행의 인덱스와 순번이 뒤 바뀜? 아마도..
//그래서 클래스와 객체를 만들어서 작성하는데
//코드에서 이해가 안가는점

//1. Comparable<Hyunsoo> 로 Hyunsoo타입 클래스를 만듬. Comparable인터페이스를 구현할.
//Comparable인터페이스를 구현하기 위해 CompareTo(T o)를 구현해야하는데..

//static Hyunsoo[]a < Hyunsoo타입의 배열 a 선언(?) 즉 스태틱 클래스의 Hyunsoo와 지네릭 타입의 Hyunsoo의 관계성.



//입력받은 N의 갯수대로 클래스를 만들어 클래스의 갯수마다 필드를 생성해서 문제를 풀려고했지만, 솔루션을 보니 그게아님.
//클래스명을 배열의 객체명으로 넘겨받아 인덱스에 넣어줌
public class baekjoon_10825 {

   static  StringBuilder sb = new StringBuilder();

    static class Hyunsoo implements Comparable<Hyunsoo> {

        public String name;
        public int korean,english,math;

        @Override
        public int compareTo(Hyunsoo other) {
            if(korean!=other.korean) {
                return other.korean - korean;
            }

            if(english!=other.english) {
                return other.english - english;
            }

            if(math!= other.math) {
                return other.math - math;
            }

            return name.compareTo(other.name);

        }
    }
        static int N;
        static Hyunsoo[] a; //?? Hyunsoo타입의 배열 a(?)

    public static void main(String[] args) throws IOException {

         Input();
         Pro();


    }
    static void Input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        a= new Hyunsoo[N]; //<이부분. Hyunsoo라는 static클래스를 만들었는데 레퍼런스와 a


    }
    static void Pro() throws IOException {

        for(int i = 0 ; i<N; i ++) {
            sb.append(a[i].name).append('\n');

        }
        System.out.println(sb.toString());


    }
}