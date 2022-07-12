package practice;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList a1=new ArrayList();
		
		a1.add(100);
		a1.add(200);
		a1.add(300);
		a1.add(500);
		a1.add(600);
		a1.add(700);
		a1.add(800);
		a1.add(900);
		
		System.out.println(a1);
		System.out.println(a1.size());
		
		System.out.println("===================================");
		
		a1.add(3,400);
		System.out.println(a1);
		System.out.println(a1.size());
		
		a1.remove(3);
		
		System.out.println("==================================");
		
		System.out.println(a1);
		System.out.println(a1.size());
		
	}

}
