package baekjoon_java;


import java.util.Scanner;

public class baekjoon_25304 {
    public static void main(String[] args)  {

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int X = scan.nextInt();
        int N = scan.nextInt();


        for(int i = 0 ; i<N; i++) {
          int a = scan.nextInt();
          int b = scan.nextInt();

            sum+= (a*b);
        }
        if(sum == X) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

/*250000
4
20000 5
30000 2
10000 6
5000 8
* */