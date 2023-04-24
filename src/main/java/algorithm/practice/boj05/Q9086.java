package algorithm.practice.boj05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문자열
public class Q9086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < t; i++) {
			String str = br.readLine();
			sb.append(str.charAt(0));
			sb.append(str.charAt(str.length()-1)+"\n");
		}

		System.out.println(sb);
	}

}
