package p1;

import java.util.ArrayList;

public class ArrayListFifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> al = new ArrayList<String>();
       al.add("A");
       al.add("B");
       al.add("C");
       
       ArrayList<String> al2 = new ArrayList<String>();
       al2.add("D");
       al2.add("E");
       
       al.addAll(al2);
       
       System.out.println(al);
	}

}
