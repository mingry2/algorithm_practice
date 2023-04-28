package algorithm.practice.boj05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문자열 반복
public class Q2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String[] str = br.readLine().split(" "); // 공백을 기준으로 나눠

			int r = Integer.parseInt(str[0]);

			String s = str[1];

			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < r; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}

	}

}
