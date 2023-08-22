class A{

	public int add(int a,int b){
		return a+b;
	}	
	public int add(int a,int b,int c){
		return a+b+c;
	}	

}

public class Over{
	public static void main(String[] args){
		System.out.println("hello");
		A obj = new A();
		obj.add(10,20);
		obj.add(10,20,30);
		
	}
}