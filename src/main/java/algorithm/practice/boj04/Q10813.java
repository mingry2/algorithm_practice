package algorithm.practice.boj04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//공 바꾸기
public class Q10813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] =+ i + 1;
		}

		for (int i = 0; i < M; i++) {
			int tmp;

			st = new StringTokenizer(br.readLine(), " ");
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());

			tmp = arr[I-1];
			arr[I-1] = arr[J-1];
			arr[J-1] = tmp;
		}

		br.close();

		for (int answer : arr) {
			System.out.print(answer + " ");
		}


	}


}
