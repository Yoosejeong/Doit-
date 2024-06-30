package DoIt알고리즘코딩테스트.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//실버4
//구간합
public class B_2018 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int start = 1;
        int end = 1;
        int count = 1;
        int sum = 1;

        while (end != N) {
            if (sum == N) {
                count++;
                end++;
                sum += end;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else {
                end++;
                sum += end;
            }
        }
        System.out.println(count);
    }
}
