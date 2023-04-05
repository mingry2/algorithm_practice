package algorithm.practice.boj03;

import java.util.Scanner;

//[8393] 합
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int ans = 0;
		for (int i = 0; i <=N; i++) {
			ans += i;
		}
		System.out.println(ans);
	}

}
