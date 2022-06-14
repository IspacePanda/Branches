package Branches21;

import java.util.Scanner;

public class zadachaDom21 {

	public static void main(String[] args) {
		Scanner sc;
	    String r;
	    String bykva;
	    String bykva2;
	    bykva = "М";
	    bykva2 = "Д";

	    sc = new Scanner(System.in);

	    System.out.println("Кто ты: мальчик или девочка?");
	    System.out.println("Введите М или Д");
	    System.out.print (">");
	    r = sc.next();

	    if (r.equals("Д")){
	      System.out.println("мне нравятся мальчики");
	    }if (r.equals("М")){
	      System.out.println("Мне нравятся девочки");
	    }else {
	    	  System.out.println("Вы ввели не верную букву");
	    }
	}

}
