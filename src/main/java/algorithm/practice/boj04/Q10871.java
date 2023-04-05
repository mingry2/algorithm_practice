package algorithm.practice.boj04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//X보다 작은 수
public class Q10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int size = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());

		int[] arr = new int[size];

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] < target) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
