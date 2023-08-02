// Demo how to create a class and object

class Person{
	private String name;
	private int age;
	public void setVal(String n,int a){
		name = n;
		age = a;
	}
	public void show(){
		System.out.println("student name is "+name);
		System.out.println("student age is "+age);
	}
}	
public class HelloWorld{
	public static void main(String[] args){
	//System.out.println("Hello world");
	Person obj = new Person();
	obj.setVal("abc",20);
	obj.show();
	}
}