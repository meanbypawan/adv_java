package p1;

import java.util.ArrayList;

/*
  POJO (plain old java object)
  Student :
    properties (id,name,age,contact)
    Behaviour 
 class Object{
   public String toString(){
      return this.getClass().getName()+"@"+this.hashCode();
   }
 }   
 */
class Student {
	private int id;
	private String name;
	private int age;
	private String contact;

	public Student(int id, String name, int age, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact = contact;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
    public String toString() {
    	return id+" "+name+" "+age+" "+contact;
    }
}

public class ArrayListSeven {

	public static void main(String[] args) {
       ArrayList<Student> al = new ArrayList<Student>();
       
       al.add(new Student(1,"A",21,"9009111222"));
       al.add(new Student(2,"B",22,"9009111223"));
       al.add(new Student(3,"C",23,"9009111224"));
       al.add(new Student(4,"E",26,"9009111225"));
       al.add(new Student(5,"D",24,"9009111226"));
	
       System.out.println(al);
       /*
         for(Student s : al)
    	 System.out.println(s);   
	   for(int i=0; i<al.size(); i++) {
		   Student s = al.get(i);
	       System.out.println(s); // s.toString()
	   }
	   */
	}

}
