package p1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSecond {
   public static void main(String args[]) {
	  LinkedList<String> ll = new LinkedList<String>();
	  ll.add("A");
	  ll.add("B");
	  ll.add("B");
	  ll.add("B");
	  ll.add("A");
	  ll.add("A");
	  ll.add("C");
	  Iterator<String> itr = ll.iterator();
	  while(itr.hasNext()) {
		  String element = itr.next();
		  System.out.println(element);
	  }
   }
}
