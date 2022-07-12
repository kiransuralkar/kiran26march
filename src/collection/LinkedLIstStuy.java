package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLIstStuy {

	public static void main(String[] args) {
        
	     LinkedList ll = new LinkedList();
	     
	     ll.add("Velocity");
	     ll.add(123);
	     ll.add('A');
	     ll.add("Velocity");
	     ll.add(null);
	     ll.add(null);
	     ll.add(12.12);
	     ll.add(true);
	     
	     System.out.println(ll);
	     System.out.println(ll.size());
	     System.out.println(ll.isEmpty());
	     System.out.println(ll.getFirst());
	     System.out.println(ll.getLast());
	     System.out.println(ll.peek());
	     System.out.println(ll);
	     System.out.println(ll.poll());
	     System.out.println(ll);
	     
	     System.out.println(ll.poll());
	     System.out.println(ll.pop());
	     System.out.println(ll);
	     
	     System.out.println("=============================");
	     
	     for( Object k:ll)
	     {
	    	 System.out.println(k);
	     }
	     
	     System.out.println("==============================");
	     
	     ListIterator itr = ll.listIterator();
	     while(itr.hasNext())
	     {
	    	 System.out.println(itr.next());
	     }
	     
	     
	     
	     
	}

}
