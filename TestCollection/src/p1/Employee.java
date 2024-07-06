package p1;

public class Employee {
   private int id;
   private String name;
   private int salary;
   private int age;
public Employee(int id, String name, int salary, int age) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.age = age;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
   public String toString() {
	   return id+" "+name+" "+salary+" "+age;
   }
}
