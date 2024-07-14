package DoIt알고리즘코딩테스트.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//실버3
//구간합
public class B_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int arr[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int finish = N-1;
        int count = 0;
        Arrays.sort(arr);
        while (start<finish) {
            if (arr[start] + arr[finish] == M) {
                start++;
                finish--;
                count++;
            }
            else if(arr[start]+arr[finish]>M){
                finish--;
            }
            else{
                start++;
            }

        }

        System.out.println(count);
    }
}
