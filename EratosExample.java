package baekjoon_java;

//소수 구하는 알고리즘 에라토스테네스의 체

public class EratosExample {
    static boolean prime[] = new boolean[121];

    public static void main(String[] args) throws Exception{

        // 구하고자 하는 숫자 범위
        int N = 120;

        // 소수는 false
        // 1은 소수가 아니므로 제외
        prime[0] = prime[1] = true;

        for(int i=2; i*i<=N; i++){
            // prime[i]가 소수라면
            if(!prime[i]){
                // prime[j] 소수가 아닌 표시
                for(int j=i*i; j<=N; j+=i) prime[j] = true;
            }
        }

        // 소수 출력
        for(int i=1; i<=N;i++){
            if(!prime[i]) System.out.print(i+" ");
        }

    }
}

