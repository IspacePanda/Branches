package Branches9;

import java.util.Scanner;

public class zadachaDom9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите первую сторону");
		int number1 = sc.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("¬ведите вторую сторону");
		int number2 = sc.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("¬ведите третюю сторону");
		int number3 = sc.nextInt();
		
		if ((number1) == (number2 = number3))
						System.out.println("явл€етс€");
			else 
				System.out.println ("Ќе €вл€€етс€")
		;
	}

}
