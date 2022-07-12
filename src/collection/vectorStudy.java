package collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class vectorStudy {

	public static void main(String[] args)
	{
          Vector v = new Vector();
          
          v.add("pune");
          v.add('a');
          v.add("pune");
          v.add(null);
          v.add(null);
          v.add(12);
          v.add(1.2);
          v.add(643);
          
          
          System.out.println(v.elementAt(1));
          System.out.println(v.get(1));
          System.out.println(v);
          System.out.println(v.remove(1.2));
          System.out.println(v);
          
          System.out.println("==========================");
          
          ListIterator lit = v.listIterator();
          while(lit.hasNext());
          {
        	  System.out.println(lit.next());
          }
          
          System.out.println("========================");

          Enumeration ve = v.elements();
          while(ve.hasMoreElements())
          {
        	  System.out.println(ve.nextElement());
          }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
	}

}
