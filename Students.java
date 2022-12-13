package baekjoon_java;


//Comparable의 compareTo는 자기 자신과 매개변수를 비교한다

import java.util.*;
public class Students implements Comparable<Students>{

    int age; //나이
    int classNumber; //학급

    Students(int age ,int classNumber) {
        this.age = age;
        this.classNumber= classNumber;

    }

    @Override
    public int compareTo(Students o) {

        //자기자신의 age가 o의 age보다 크다면 양수

//        if(this.age > o.age) {
//            return 1;
//        }
//        //자기자신의 age와 o의 age가 같다면 0
//        else if(this.age == o.age) {
//            return 0;
//        }
//        else {
//            //자기자신의 age가 o의 age보다 작다면 음수.
//            return -1;
//        }

        /*
         * 만약 자신의 age가 o의 age보다 크다면 양수가 반환 될 것이고,
         * 같다면 0을, 작다면 음수를 반환할 것이다.
         */

        return this.age - o.age;

    }


    public static void main(String[] args) {
        Students first = new Students(18,3);
        Students second = new Students(19 , 4);

        int result_age  = first.compareTo(second);

        if(result_age >0) {
            System.out.println("first가 second 보다 크다.");
        }else if(result_age == 0) {
            System.out.println("first와 second는 같다.");
        }else {
            System.out.println("first가 second보다 작다.");
        }
    }
}
