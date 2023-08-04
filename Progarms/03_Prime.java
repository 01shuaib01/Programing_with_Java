public class Prime{
	public static void main(String[] args){
	int N=14;
	int i;
	for( i = 2;i<N;i++){
		if(N%i==0){
			System.out.println(N + " is Not a prime");
			break;
		}
	}
	if(i == N)
		System.out.println(N + " it is a Prime number");
	}
}