package practice;

import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class vector {

	public static void main(String[] args) {

		Vector v = new Vector();
		
		v.add("kiran");
		v.add("neha");
		v.add("atul");
		v.add("kiran");
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains("neha"));
		System.out.println(v.get(3));
		
		v.add(2,"Helsinka");
		System.out.println(v);
		
		
		
		v.remove(2);
		System.out.println(v);
		
		v.set(2, "ameet");
		System.out.println(v);
		
		
		System.out.println("print=vector=using=iterator cursor");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
