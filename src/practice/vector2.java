package practice;

import java.util.ListIterator;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class vector2 {

	public static void main(String[] args) {


		Vector v = new Vector();
		
		v.add("kiran");
		v.add("neha");
		v.add("atul");
		v.add("kiran");
		
	System.out.println("print vector using listiterator cursor");
		
		ListIterator litr=v.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
	System.out.println("======for=loop========");	
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
	
		System.out.println("============for==eachloop================");
		
		for(Object s1:v)
		{
			System.out.println(s1);
		}
		
		
		
		
		
	}
	

}
