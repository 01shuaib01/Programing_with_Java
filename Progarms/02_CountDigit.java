public class countDigit{
	public static void main(String[] args){
	
	int n = 54321;
	int count = 0;
	
	while(n > 0){
		count++;
		n = n/10;
	}
	System.out.println("count of the digit is "+count);
	}
}