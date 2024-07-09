package p1;

import java.util.Comparator;

public class SortByAge implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		int diff =  o1.getAge() - o2.getAge();
	    if(diff == 0) {
	      return o1.getName().compareTo(o2.getName());
	    }  
	    return diff;
	}
}
