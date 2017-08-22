public class CoinChange{
	public static int calculateWays(int[] coins, int money){
		long[] ways = new long[money+1];
		ways[0] = 1;
		for(int c : coins){
			for(int i = c; i < money; i++){
				ways[i] += ways[i-c];
			}
		}
		return ways[money];
	}
}