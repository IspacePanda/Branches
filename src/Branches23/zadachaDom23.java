package Branches23;

import java.util.Scanner;

public class zadachaDom23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число");
		System.out.print(">");
		d = sc.nextInt();
		if (d > 31) {
			System.out.println("вы ввели неверную дату");
			
			 System.out.println("ѕќ ј");}
		else
		System.out.println("¬ведите мес€ц");
		System.out.print(">");
		m = sc.nextInt();
		System.out.println("число мес€ца " + d);
		System.out.print("ћес€ц " + m);
		if (m > 12) {
			System.out.println("вы ввели не верно мес€ц");
		}

	}

}