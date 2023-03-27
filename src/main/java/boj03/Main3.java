package boj03;

import java.util.Scanner;

//[25304] 영수증
public class Main3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); //영수증에 적힌 총 가격
		int N = sc.nextInt(); //구매한 물건의 수

		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt(); //물건의 가격
			int b = sc.nextInt(); //물건의 개수

			arr[i] = a * b;
		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		if (sum == X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
