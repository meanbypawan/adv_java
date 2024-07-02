package p1;

import java.util.ArrayList;

public class ArrayListFouth {
public static void main(String args[]) {
	   ArrayList<Integer> al = new ArrayList<Integer>();
	   al.add(5); // 0
	   al.add(3); // 1
	   al.add(6); // 2
	   al.add(1); // 3
	   al.add(2); // 4
	   al.add(200); // 5
	   al.add(2); // 6
	   al.add(2);  // 7
	   al.add(5); // 5
	   System.out.println(al);
	   //al.remove(5);
	   al.remove(new Integer(5));
	   System.out.println(al);
   }
}
