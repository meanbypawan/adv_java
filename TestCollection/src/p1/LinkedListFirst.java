package p1;

import java.util.LinkedList;

public class LinkedListFirst {
  public static void main(String args[]) {
	  LinkedList<String> ll = new LinkedList<String>();
      ll.add("A");
      ll.add("B");
      ll.add("A");
      ll.add("C");
      for(String element : ll)
    	  System.out.println(element);
  }
}
