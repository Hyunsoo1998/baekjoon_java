package baekjoon_java;

import java.util.*;

public class baekjoon_1120 {


    //자력으로 해결 못하고 다른 사람의 코드를 가져와서 이해함.


    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        int result = a.length();


//        연산은 전혀 신경쓰지 않았습니다.
//        결국에는 두 문자열의 최소차이를 구하는 문제이기에 앞이나 뒤에 채워넣는
//        알파벳은 b와 일치하게 채워넣으면 그만이기 때문입니다.

//        신경 써야 할부분은 오로지 현재 A와 B의 차이점입니다.
//        A 문자열과 같은 길이의 B의 부분 문자열을 반복적으로 비교하며 최소 차이를 찾으면 됩니다.

        for(int i=0;i<b.length()-a.length()+1;i++){
            int tmp=0;

            for(int j=0;j<a.length();j++){
                if(a.charAt(j)!=b.charAt(j+i)){
                    tmp++;
                }
            }
            if(result > tmp){
                result = tmp;
            }
        }

        System.out.println(result);
    }
}