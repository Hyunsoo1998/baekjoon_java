package baekjoon_java;

import java.util.Scanner;

public class baekjoon_3003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int King= scan.nextInt();
        int Queen = scan.nextInt();
        int look= scan.nextInt();
        int Bishop = scan.nextInt();
        int knight = scan.nextInt();
        int pon = scan.nextInt();

//2 1 2 1 2 1

//킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다
        System.out.print(1-King+" ");
        System.out.print(1-Queen+" ");
        System.out.print(2-look+" ");
        System.out.print(2-Bishop+" ");
        System.out.print(2-knight+" ");
        System.out.print(8-pon);


    }
}
