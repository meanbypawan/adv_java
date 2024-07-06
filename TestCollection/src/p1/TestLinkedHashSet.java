package p1;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
      LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
      lhs.add(10);
      lhs.add(-100);
      lhs.add(-100);
      lhs.add(10);
      lhs.add(15);
      lhs.add(11);
      lhs.add(23);
      lhs.add(45);
      for(Integer element : lhs)
        System.out.println(element);
	}

}
