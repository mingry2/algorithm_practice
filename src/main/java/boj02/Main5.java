package boj02;

import java.util.Scanner;

//[2525] 오븐 시계
public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int min = A * 60 + B; //분단위로 변환
		int end = min + C;

		A = (end / 60) % 24; //24로 나눈값의 나머지
		B = end % 60;

		System.out.println(A + " " + B);

	}

}
