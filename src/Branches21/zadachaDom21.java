package Branches21;

import java.util.Scanner;

public class zadachaDom21 {

	public static void main(String[] args) {
		Scanner sc;
	    String r;
	    String bykva;
	    String bykva2;
	    bykva = "�";
	    bykva2 = "�";

	    sc = new Scanner(System.in);

	    System.out.println("��� ��: ������� ��� �������?");
	    System.out.println("������� � ��� �");
	    System.out.print (">");
	    r = sc.next();

	    if (r.equals("�")){
	      System.out.println("��� �������� ��������");
	    }if (r.equals("�")){
	      System.out.println("��� �������� �������");
	    }else {
	    	  System.out.println("�� ����� �� ������ �����");
	    }
	}

}
