package algorithm.practice.boj04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//바구니 뒤집기
public class Q10811 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder str = new StringBuilder();

		int N = Integer.parseInt(st.nextToken()); // 바구니 수

		int M = Integer.parseInt(st.nextToken()); // 역순으로 바꿀 횟수

		int[] arr = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = i;
		}

		for (int n = 0; n < M; n++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			while (i < j) {
				int tmp = arr[i];

				arr[i++] = arr[j];
				arr[j--] = tmp;
			}
		}

		for (int i = 1; i <= N; i++) {
			str.append(arr[i]).append(" ");
		}

		System.out.print(str);
		br.close();

	}

}
