package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistStudy {

	public static void main(String[] args) {
      
		ArrayList a = new ArrayList();
       
        a.add("Velocity");
        a.add('A');
        a.add(123);
        a.add(true);
        a.add(123.123);
        a.add("Velocity");
        a.add(null);
        a.add(123);
        a.add(null);
     
       System.out.println(a);
       System.out.println(a.size());
       System.out.println(a.isEmpty());
       
       System.out.println(a.contains(123));
       System.out.println(a.get(1));
       
       System.out.println(a.indexOf(123));
       
       System.out.println(a.indexOf("Velocity"));
       
       System.out.println(a.lastIndexOf("Velocity"));
      
       System.out.println(a.remove(1));
       
       System.out.println(a);
       
       for(int i=0;i<=7;i++)
       {  
    	  System.out.println(a.get(i)); 
       }
     
       System.out.println("========================");
       
        Iterator itr = a.iterator();
       while(itr.hasNext());
       {  
    	   System.out.println(itr);
       }
       
       System.out.println("========================");
       
        ListIterator i = a.listIterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
       
        System.out.println("=============================");
        
        for(Object test:a);
        {
        	System.out.println(a);
        }
	}
	
	
	
	

}
