package p1;

import java.util.ArrayList;

public class ArrayListSix {
  public static void main(String arg[]) {
	  ArrayList<String> al1 = new ArrayList<String>();
      al1.add("A");
      al1.add("B");
      al1.add("C");
      
      ArrayList<String> al2 = new ArrayList<String>();
      al2.add("D");
      al2.add("E");
      al2.add("F");
      
      ArrayList<String> al3 = new ArrayList<String>();
      al3.add("G");
      al3.add("H");
      al3.add("I");
      
      al1.addAll(al2);
      al1.addAll(al3);
      
      System.out.println(al1);
      
      al1.retainAll(al2);
      System.out.println(al1);
      
     
  }
}
