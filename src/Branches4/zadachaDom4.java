package Branches4;

import java.util.Scanner;

public class zadachaDom4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ �����");
		int number1 = sc.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("������� ������ �����");
		int number2 = sc.nextInt();
		if (number1 == number2)
			System.out.println("�����");
		else
			System.out.println("�� �����");
	}

}
