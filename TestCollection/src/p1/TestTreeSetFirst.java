package p1;

import java.util.TreeSet;

public class TestTreeSetFirst {
  public static void main(String args[]) {
	  TreeSet<String> ts = new TreeSet<String>();
      ts.add("A");
      ts.add("C");
      ts.add("Z");
      ts.add("X");
      ts.add("Y");
      ts.add("B");
      for(String element : ts)
    	  System.out.println(element);
  }
}
