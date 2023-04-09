package algorithm.practice.boj04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//최소, 최대
public class Q10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//
//			if (arr[i] < min) {
//				min = arr[i];
//			}
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println(min + " " + max);

	}

}
