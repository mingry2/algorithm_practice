package algorithm.practice.boj05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//단어 길이 재기
public class Q2743 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		br.close();

		System.out.println(str.length());
	}

}
