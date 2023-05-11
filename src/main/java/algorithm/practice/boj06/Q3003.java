package algorithm.practice.boj06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] chessPiece = new int[]{1,1,2,2,2,8};
		int[] arr = new int[6];
		int[] result = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] += Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < chessPiece.length; i++) {
			result[i] = chessPiece[i] - arr[i];
		}

		System.out.print(Arrays.toString(result));

	}

}
