class A{

	public void f1(){
		System.out.println("A class");
	}	

}

class B extends A{

	public void f1(){
		System.out.println("B class");
	}	
		

}

public class Over{
	public static void main(String[] args){
		System.out.println("hello");
		B obj = new B();
		obj.f1();
		
	}
}