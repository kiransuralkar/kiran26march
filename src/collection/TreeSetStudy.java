package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {

		TreeSet t=new TreeSet();
		
		t.add(90);
	//	t.add("pune");
		t.add(10);
		t.add(80);
		t.add(20);
		t.add(1);
	//	t.add(null);
		
		System.out.println(t);
	
		System.out.println("===================================");
		
		for(Object test:t);
		{
			System.out.println(t);
		}
		
		System.out.println("=========================");
		
		Iterator B=t.iterator();
		while(B.hasNext());
		{
			System.out.println(B.next());
		}
	}

}
