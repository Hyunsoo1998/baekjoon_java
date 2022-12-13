package baekjoon_java;

import java.util.Comparator;

public class Comparator_Students implements Comparator<Comparator_Students> {

    int age;
    int classNumber;

    public Comparator_Students(int age , int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }

    @Override
    public int compare(Comparator_Students o1 , Comparator_Students o2) {

            return o1.classNumber - o2.classNumber;
    }

    public static void main(String[] args) {
        Comparator_Students a = new Comparator_Students(17 ,2);
        Comparator_Students b = new Comparator_Students(18 ,1);
        Comparator_Students c = new Comparator_Students(15,3);

        //a객체와는 상관없이 b와 c 객체를 비교한다.
        int result = a.compare(b,c);

        if(result > 0 ) {
            System.out.println("b객체가 c 객체보다 큽니다.");
        }
        if(result == 0 ) {
            System.out.println("b객체와 c 객체는 같습니다.");
        }
        if(result < 0) {
            System.out.println("c객체가 b 객체보다 큽니다.");
        }


    }

}
