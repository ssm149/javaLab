package test;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("�Է� : ");
			int num = sc.nextInt();

			sum += num;

			System.out.println("���� : " + num + ", �� : " + sum);

			if (sum >= 100)
				break;

		}
		System.out.println("���α׷� ����");
	}

}
