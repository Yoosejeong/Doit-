package DoIt알고리즘코딩테스트.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//실버3
//구간합
public class B_11659 {
    public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder();
    int arr[] = new int[N+1];

    st = new StringTokenizer(br.readLine());
    for(int i=1; i<=N; i++){
        arr[0] = 0;
        arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
    }


    for(int k=0; k<M; k++){
        st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());
       sb.append(arr[j]-arr[i-1]).append("\n");
    }
    System.out.println(sb);

    }
}
