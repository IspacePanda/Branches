package Branches16;

public class zadachaDom16 {

	public static void main(String[] args) {
		int x = 1;
		int y = -2;

		if ((x == 0) && (y == 0)) 			
		System.out.println("в начале координат");
		if ((x !=0) && (y == 0))
			System.out.println("На оси x");
		if ((x ==0)&& (y !=0))
			System.out.println("На оси y");			
		if ((x > 0) && (y > 0))
			System.out.println("в 1 четерть");
		if ((x < 0) && (y > 0))
		System.out.println("В 2 четверть");
		if ((x < 0) && (y < 0))
			System.out.println("В 3 четверь");
		if  ((x > 0) && (y< 0))
			System.out.println("В 4 четверть");
      

	}
}