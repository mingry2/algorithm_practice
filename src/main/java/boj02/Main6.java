package boj02;

import java.util.Scanner;

//[2480] 주사위 세개
public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		//a,b,c 모두 다를 때
		if (a != b && b != c && a != c) {
			int max; //최댓값 구하기

			if (a > b) {
				//c > a > b 경우
				if (c > a) {
					max = c;
				}else {
					max = a;
				}
			} else {
				//c > b > a 경우
				if (c > b) {
					max = c;
				}else {
					max = b;
				}
			}
			System.out.println(max * 100);
		} else if (a == b && b == c) { //a,b,c 가 모두 같을 때
			System.out.println(10000 + (a * 1000));
		} else { //a,b,c 중 한 쌍만 같을 때
			if (a == b || a == c) {
				System.out.println(1000 + (a * 100));
			}else { //b,c가 같을 때
				System.out.println(1000 + (b * 100));
			}
		}

	}

}
