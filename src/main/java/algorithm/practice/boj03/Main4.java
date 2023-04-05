package algorithm.practice.boj03;

import java.util.Scanner;

//[25314] 코딩은 체육과목 입니다
public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt() / 4;

//		System.out.println("long ".repeat(N) + "int");

		String str[] = new String[N];
		for (int i = 0; i < N; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}

}
