package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetStudy {

	public static void main(String[] args) {

		LinkedHashSet is=new LinkedHashSet();
		
		is.add("pune");
		is.add("pune");
		is.add('A');
		is.add(123);
		is.add(12.234);
		is.add(null);
		is.add(null);
		is.add(true);
		
		System.out.println(is);
		
		for(Object i:is)
		{
			System.out.println(i);
		}
		
		System.out.println("=======================");
		
		Iterator i=is.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	System.out.println("===========================");	
		
		LinkedHashSet<Integer>A=new LinkedHashSet<>();
		 
		A.add(90);
		A.add(10);
		A.add(80);
		A.add(20);
		A.add(1);
		
		System.out.println(A);
		
		
		
		
	}

}
