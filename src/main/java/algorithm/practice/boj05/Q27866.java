package algorithm.practice.boj05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문자와 문자열
public class Q27866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int idx = Integer.parseInt(br.readLine());

		System.out.println(str.substring(idx - 1, idx));

	}

}
