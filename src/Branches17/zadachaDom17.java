package Branches17;

public class zadachaDom17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 11;
		int y = 11;
		if (x > y) {
			y = x;
			System.out.println("Х больше" + y + x);
			System.out.println("x  " + x);
			System.out.println("y  " + y);
		} else if (x < y) {
			x = y;
			System.out.println("У больше ");
			System.out.println("x  " + x);
			System.out.println("y  " + y);
		}
		if (x == y)
			x = 0;
		y = 0;
		System.out.println("равны");
		System.out.println("x  " + x);
		System.out.println("y  " + y);

	}
}
