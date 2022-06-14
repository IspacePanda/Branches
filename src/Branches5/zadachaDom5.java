package Branches5;

import java.util.Scanner;

public class zadachaDom5 {
/// “ут выходит 5 и 6
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите первое число");
		int number1 = sc.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("¬ведите второе число");
		int number2 = sc.nextInt();
		if (number1 < number2)
			System.out.println("меньшее " + number1);
		else
			System.out.println("большее " + number1);

	}

}
