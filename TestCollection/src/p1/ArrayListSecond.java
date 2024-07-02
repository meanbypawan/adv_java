package p1;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListSecond {
  public static void main(String args[]) {
	  ArrayList<Integer> al = new ArrayList<Integer>(3);
      al.add(10);
      al.add(20);
      al.add(30);
      al.add(40);
      al.add(50);
      al.add(5);
      System.out.println("Size : "+al.size());
      System.out.println(al);
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter element to be search");
      int element = sc.nextInt();
     
      if(al.contains(element))
    	  System.out.println("Element Found");
      else
    	  System.out.println("Element Not Found");
  }
}
