package DoIt알고리즘코딩테스트.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//실버1
//구간합
public class B_11660 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        StringBuilder sb = new StringBuilder();
        int arr[][] = new int[N+1][N+1];
        int A [][] = new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }

        }

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++) {
                arr[i][j] = arr[i-1][j]+arr[i][j-1]-arr[i-1][j-1]+A[i][j];
            }

        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());


            sb.append(arr[x2][y2]-arr[x1-1][y2]-arr[x2][y1-1]+arr[x1-1][y1-1]).append("\n");
        }

        System.out.println(sb);
    }
}
