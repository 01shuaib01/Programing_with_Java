
class Person{
	private String name;
	private int age;
	public void setName(String name)
	{	this.name = name;}
	public void setAge(int age)
	{	this.age = age ;}
	
	public String getName()
	{	return name; }
	public int getAge()
	{	return age;	}
}

class Student extends Person{
	private int roll;
	public void setRoll(int r)
	{	this.roll = r;}
	public int getRoll()
	{	return roll; }
}

public class Inheri{
	public static void main(String[] args){
		Student obj = new Student();
		obj.setName("Abc");
		obj.setAge(21);
		obj.setRoll(1);
		System.out.println("student name is "+obj.getName());
		System.out.println("student age is "+obj.getAge());
		System.out.println("student roll is "+obj.getRoll());
	
	}
}