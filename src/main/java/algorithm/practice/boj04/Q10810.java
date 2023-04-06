package algorithm.practice.boj04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//공 넣기
public class Q10810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int buket = Integer.parseInt(st.nextToken()); //바구니 갯수
		int cast = Integer.parseInt(st.nextToken()); //던지는 횟수

		int[] arr = new int[buket];

		for (int i = 0; i < cast; i++){
			st = new StringTokenizer(br.readLine(), " ");

			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			for (int j = I - 1; j < J; j++){
				arr[j] = K;
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		br.close();

	}

}
