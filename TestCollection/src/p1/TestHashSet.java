package p1;

import java.util.HashSet;

public class TestHashSet {
  public static void main(String args[]) {
	  HashSet<Integer> hs = new HashSet<Integer>();
	  hs.add(-100);
	  hs.add(50);
	  hs.add(10);
	  hs.add(30);
	  hs.add(99);
	  hs.add(-100);
	  hs.add(99);
	  System.out.println(hs);
  }
}
