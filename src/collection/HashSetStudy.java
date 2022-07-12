package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetStudy {

	public static void main(String[] args) {
     
     HashSet hs=new HashSet();   
		
		hs.add("pune");
		hs.add("pune");
		hs.add(null);
		hs.add(null);
		hs.add(123);
		hs.add(12.21);
		hs.add(true);
		hs.add('A');
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		System.out.println(hs.contains('B'));
		
		System.out.println("==========================");
		
	//	for(int i=0;i<=hs.size()-1;i++)
	//	{
	//		System.out.println(hs.);
	//	}
		for( Object k:hs)
	     {
	    	 System.out.println(k);
	     }

		System.out.println("============================");
	 
	      Iterator i=hs.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }

HashSet<Integer> k=new HashSet<>();	
		
         k.add(45);
         k.add(33);
         k.add(55);
         k.add(77);
         k.add(null);
         k.add(null);
         
         System.out.println(k);
         
        for( Integer j:k) 
        {
        	System.out.println(j);
        }
         
         
         
         
         
         
         
         
	}

}
