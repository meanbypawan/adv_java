package p1;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {
      ArrayList<Integer> al = new ArrayList<Integer>();
      al.add(10);
      al.add(20);
      al.add(30);
      al.add(40);
      al.add(50);
      al.add(60);
      
      ListIterator<Integer> lit = al.listIterator(al.size());
      while(lit.hasPrevious()) {
    	  Integer element = lit.previous();
    	  System.out.println(element);
      }
      /*
      ListIterator<Integer> lit = al.listIterator();
	  while(lit.hasNext()) {
		 Integer element =  lit.next();
	     System.out.println(element); 
	  }
	  */
	}

}
