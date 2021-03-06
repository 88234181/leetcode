/**
Davis has s staircases in his house and he likes to climb each staircase 1, 2, or 3 steps at a time. Being a very precocious child, he wonders how many ways there are to reach the top of the staircase.

Given the respective heights for each of the s staircases in his house, find and print the number of ways he can climb each staircase on a new line.

Input Format

The first line contains a single integer, s, denoting the number of staircases in his house. 
Each line i of the s subsequent lines contains a single integer, n, denoting the height of staircase i.

Constraints
1<=s<=5
1<=n<=36
Subtasks
1<=n<=20 for 50% of the maximum score.
Output Format
For each staircase, print the number of ways Davis can climb it in a new line.

Sample Input

3
1
3
7
Sample Output

1
4
44
**/

public class Staircase{
	public static int calculateWaysInterative(int n){
		if(n < 0){
			throws new IllegalArgumentException("illegal argument")
		}
		
		if(n <=1){
			return 1;
		}
		
		int[] paths = {1,1,2};
		
		for(int i = 3; i < n; i++){
			int count = paths[i-3] + paths[i-2] + paths[i-1];
			paths[i-3] = paths[i-2];
			paths[i-2] = paths[i-1];
			paths[i-1] = count;
		}
		return paths[n];
	}
	
	public static int calculateWaysDP(int n){
		if(n < 0){
			throws new IllegalArgumentException("illegal argument")
		}
		
		if(n <=1){
			return 1;
		}
		
		int[] paths = new int[n+1];
		paths[0] = 1;
		paths[1] = 1;
		paths[2] = 2;
		
		for(int i = 3; i < n; i++){
			paths[i] = paths[i-3] + paths[i-2] + paths[i-1];
		}
		
		return paths[n];
	}
}