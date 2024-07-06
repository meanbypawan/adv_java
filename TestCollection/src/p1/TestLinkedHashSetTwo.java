package p1;

import java.util.LinkedHashSet;

public class TestLinkedHashSetTwo {
   public static void main(String args[]) {
	   LinkedHashSet<StringBuffer> lhs = new LinkedHashSet<StringBuffer>();
	   lhs.add(new StringBuffer("A"));
	   lhs.add(new StringBuffer("A"));
	   lhs.add(new StringBuffer("A"));
	   lhs.add(new StringBuffer("A"));
	   
	   System.out.println(lhs);
   }
}
