public class Fibinacci{
	public static long long fibinacciRecurvice(int i){
		if(i < 0){
			throws new IllegalArgumentException("illegal Argument");
		}
		if(i <= 1){
			return 1;
		}
		
		return fibinacciRecurvice(i-1) + fibinacciRecurvice(i-2);
	}
	
	public static long long fibinacciIterative(int num){
		long long[] tmp = new long long[num + 1];
		tmp[0] = 1;
		tmp[1] = 1;
		
		for(int i = 2; i < num + 1; i++){
			tmp[i] = tmp[i-1] + tmp[i-2];
		}
		return tmp[num];
	}
}