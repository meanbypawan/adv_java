package p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestingNullValues {
  public static void main(String arg[]) {
	  ArrayList al = new ArrayList();
	  al.add(null);
	  al.add(null);
	  System.out.println("ArrayList : "+al);
	  
	  LinkedList ll = new LinkedList();
	  ll.add(null);
	  ll.add(null);
	  System.out.println("LinkedList : "+ll);
	  
	  HashSet<Object> hs = new HashSet<Object>();
	  hs.add(null);
	  hs.add(null);
	  System.out.println("HashSet : "+hs);
  
      LinkedHashSet lhs = new LinkedHashSet();
      lhs.add(null);
      lhs.add(null);
      System.out.println("LinkedHashSet : "+lhs);
      
      TreeSet ts = new TreeSet();
      ts.add(null);
      System.out.println("TreeSet : "+ts);
  }
}
