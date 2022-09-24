package baekjoon_java;

import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int korean;
    int math;
    int english;
    public Student(String name, int korean, int math, int english) {
        this.name = name;
        this.korean = korean;
        this.math = math;
        this.english = english;
    }
    @Override
    public int compareTo(Student student) {
        // TODO Auto-generated method stub
        if(this.korean<student.korean) {
            return 1;
        }
        else if(this.korean==student.korean) {
            if(this.english>student.english) {
                return 1;
            }
            else if(this.english==student.english) {
                if(this.math<student.math){
                    return 1;
                }
                else if(this.math==student.math) {
                    if(this.name.compareTo(student.name)>0) {
                        return 1;
                    }
                }
            }
        }
        return -1;

    }
}
public class baekjoon_10825 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String name;
        int korean,math,english;
        Student student;
        List<Student> slist=new ArrayList<Student>();
        for(int i=0;i<n;i++) {
            name=sc.next();
            korean=sc.nextInt();
            english=sc.nextInt();
            math=sc.nextInt();
            student=new Student(name,korean,math,english);
            slist.add(student);
        }

        Collections.sort(slist);
        for(int i=0;i<n;i++) {
            System.out.println(slist.get(i).name);
        }
    }

}