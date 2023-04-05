package algorithm.practice.boj03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//[15552] 빠른 A+B
public class Main5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st; //공백을 기준으로 입력받을 때 사용

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i ++) {
			st = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st.nextToken()) + (Integer.parseInt(st.nextToken())) + "\n"));
		}
		bw.close();
	}

}
