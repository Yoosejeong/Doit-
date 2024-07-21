package DoIt알고리즘코딩테스트.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//골드3
//구간합
public class B_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Long [] arr = new Long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);


        int count = 0;

        for(int k=0; k<N; k++){
            int start = 0;
            int end = N-1;
            Long find = arr[k];
            while(start<end) {
                if (arr[start] + arr[end] == find) {
                    if(start!=k && end!=k){
                        count++;
                        break;
                    }
                    else if(start == k ){
                        start++;
                    }
                    else if(end == k){
                        end--;
                    }
                }
                else if(arr[start]+ arr[end] >find){
                    end--;
                }
                else {
                    start++;
                }
            }
        }


        System.out.println(count);
    }
}
