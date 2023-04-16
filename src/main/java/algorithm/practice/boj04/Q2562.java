package algorithm.practice.boj04;

import java.io.IOException;
import java.util.Scanner;

//최댓값
public class Q2562 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = 9;

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		int count = 0;
		int max = 0;
		int index = 0;

		for (int value : arr) {
			count++;

			if(value > max) {
				max = value;
				index = count;
			}
		}

		System.out.println(max + "\n" + index);

	}

}
