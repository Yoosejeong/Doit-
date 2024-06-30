package DoIt알고리즘코딩테스트.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//골드3
//구간합
public class B_10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long S [] = new long[N+1];
        long C [] = new long[M];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            S[0] = 0;
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        long count = 0;
        int result;
        for(int i=1; i<=N; i++){
            result = (int)S[i] % M;
            if (result == 0) count ++;
            C[result]++;
        }

        for(int i=0; i<M; i++){
            if(C[i]>1){
                count += C[i] * (C[i]-1) / 2;
            }
        }

        System.out.println(count);





    }
}
