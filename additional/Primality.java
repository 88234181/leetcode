public class Primality{
	public static boolean isPrime(int n){
		int a = Math.floor(Math.sqrt(n);
		if(n < 2){
			throws new IllegalArgumentException("illegal argument");
		}
		
		for(int i = 2; i <= a; i++){
			if(n%i == 0){
				return false;
			}
		}
		
		return true;
	}
}