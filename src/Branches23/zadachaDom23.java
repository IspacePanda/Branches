package Branches23;

import java.util.Scanner;

public class zadachaDom23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �����");
		System.out.print(">");
		d = sc.nextInt();
		if (d > 31) {
			System.out.println("�� ����� �������� ����");
			
			 System.out.println("����");}
		else
		System.out.println("������� �����");
		System.out.print(">");
		m = sc.nextInt();
		System.out.println("����� ������ " + d);
		System.out.print("����� " + m);
		if (m > 12) {
			System.out.println("�� ����� �� ����� �����");
		}

	}

}