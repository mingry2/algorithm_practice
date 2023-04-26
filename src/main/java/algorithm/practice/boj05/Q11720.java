package algorithm.practice.boj05;

import java.io.IOException;
import java.util.Scanner;

//숫자의 합
public class Q11720 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String str = sc.next();

		sc.close();

		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += str.charAt(i) - '0';
		}

		System.out.print(sum);
	}

}
