package algorithm.practice.boj04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//평균
public class Q1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		float[] arr = new float[N];

		float max = 0;
		float avg = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		br.close();

		for (int i = 0; i < arr.length; i++) {
			avg += ((arr[i] / max) * 100) / N;
		}

		System.out.println(avg);


	}

}
