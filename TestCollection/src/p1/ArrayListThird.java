package p1;

import java.util.ArrayList;

public class ArrayListThird {
   public static void main(String args[]) {
	   ArrayList<Integer> al = new ArrayList<Integer>(20);
	   al.add(10);
	   al.add(20);
	   al.add(15);
	   al.add(25);
	   
	   System.out.println(al);
       
	   al.add(2,500);
	   System.out.println(al + " : "+al.size());
   }
}
