package practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class arraylist3 {

	public static void main(String[] args) {

		ArrayList a3=new ArrayList();
		
		a3.add("meena");
		a3.add("neha");
		a3.add("atul");
		a3.add("ameet");
		a3.add("hemant");
		
		System.out.println(a3);
		System.out.println(a3.size());
		
		System.out.println(a3.indexOf("meena"));
		System.out.println(a3.lastIndexOf("hemant"));
		
	//	a3.set(1, "Helsinki");
	//	System.out.println("Upadted a3="+a3);
		
		System.out.println("==================================");
		
		ListIterator LItr=a3.listIterator();
		
		while(LItr.hasNext())
		{
			System.out.println(LItr.next());
		}
		
		System.out.println("=========================");
		
		for(int i=0;i<=a3.size()-1;i++)
			
		{
			System.out.println(a3.get(i));
		}	
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
