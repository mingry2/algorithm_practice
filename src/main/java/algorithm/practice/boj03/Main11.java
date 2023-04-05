package algorithm.practice.boj03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//[10951] A+B - 4
public class Main11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		int a;
		int b;
		String str;

		while((str = br.readLine()) != null) {
			st = new StringTokenizer(str, " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			System.out.println(a+b);
		}

	}

}
